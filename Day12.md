# 🗓️ Java Revision – Day 12
## Exception Handling – Day 7
## try-with-resources (Memory Safety)

---

### 🎯 CORE GOAL (Why This Exists)
> Guarantee resource cleanup automatically, even during failures

Resources = things outside JVM memory:
- Files
- Database connections
- Network sockets
- Streams

If not closed → resource leaks → app slowdown/crash.

---

### 1️⃣ Why finally Is RISKY for Resources (Critical)
#### Traditional approach (old & risky)

BufferedReader br = null;

try {

    br = new BufferedReader(new FileReader("data.txt"));
    System.out.println(br.readLine());
    
} catch (Exception e) {

    e.printStackTrace();
} finally {

    br.close(); // ❌ risky
}

#### 🚨 Problems with finally
1. br may be null → NullPointerException
2. close() itself can throw exception
3. Original exception may be lost
4. Multiple resources = nested try-catch chaos

📌 Interview line
> finally cannot guarantee safe cleanup without extra defensive code.

---

### 2️⃣ What Is AutoCloseable? (Foundation)
#### Definition

public interface AutoCloseable {

    void close() throws Exception;
}

Any class implementing this:
- Can be used in try-with-resources
- Will be automatically closed

Examples
- FileReader
- BufferedReader
- InputStream
- Connection (JDBC)
- PreparedStatement
- ResultSet

📌 JVM ensures close() is called.

---

### 3️⃣ try-with-resources – Core Idea

Syntax

try (Resource r = new Resource()) {

    // use resource
}


What JVM guarantees:
- Resource is closed automatically
- Happens even if:
     - exception occurs
     - return statement executes

📌 This is stronger than finally.

---

### 4️⃣ File Read WITHOUT try-with-resources (Leak-Prone)

#### ❌ Old Style (Task Requirement)

import java.io.*;

public class FileReadOld {

    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println(br.readLine());

        // forgot to close ❌
    }
}

#### 🚨 What Can Go Wrong
- File handle stays open
- OS resource leak
- On Windows → file lock
- On Linux → FD exhaustion

---


### 5️⃣ Rewrite Using try-with-resources (SAFE)
#### ✅ Modern, Safe Code

import java.io.*;

public class FileReadSafe {

    public static void main(String[] args) {
        try (BufferedReader br =
                     new BufferedReader(new FileReader("data.txt"))) {

            System.out.println(br.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

#### 🧠 What Happens Internally
1. Resource created
2. try block executes
3. JVM calls br.close() automatically
4. Happens before catch / finally

---

### 6️⃣ Verifying Automatic Close (Proof)
#### Custom Resource

class MyResource implements AutoCloseable {

    public void use() {
        System.out.println("Using resource");
    }

    @Override
    public void close() {
        System.out.println("Resource closed automatically");
    }
}

#### Test Code

public class AutoCloseTest {

    public static void main(String[] args) {
        try (MyResource r = new MyResource()) {
            r.use();
        }
    }
}

#### Output

Using resource

Resource closed automatically

📌 Proof complete.

---

### 7️⃣ Multiple Resources Handling (IMPORTANT)
#### Rule
- Resources are closed in reverse order

### Example

import java.io.*;

public class MultiResource {

    public static void main(String[] args) {
        try (
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr)
        ) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

#### Close Order

BufferedReader → FileReader

📌 LIFO (stack-like).

---

### 8️⃣ Exception During close() (Suppressed Exceptions)
#### Key Concept (Interview Favorite)

If:
- Exception occurs in try block
- Another occurs in close()

👉 Close exception is suppressed, not lost.

Example

try (MyResource r = new MyResource()) {

    throw new RuntimeException("Main exception");
}


JVM keeps:
- Main exception
- Suppressed close exception

📌 Access via:

Throwable[] suppressed = e.getSuppressed();

---

### 9️⃣ JDBC Usage (VERY IMPORTANT)
#### ❌ Old JDBC (Bad)

Connection con = null;

try {

    con = DriverManager.getConnection(...);
    
} finally {

    con.close();
}

#### ✅ Modern JDBC (Industry Standard)

try (

    Connection con = DriverManager.getConnection(...);
    PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
    ResultSet rs = ps.executeQuery()
) {

    while (rs.next()) {
        System.out.println(rs.getString("name"));
    }
}

📌 No leaks. No finally. Clean.

---

### 🔟 Best Practices (Senior Rules)

#### ✅ Always use try-with-resources for:
- Files
- Streams
- JDBC
- Sockets

#### ❌ Never:
- Manually close in finally
- Ignore close exceptions
- Mix try-with-resources + finally unnecessarily

---

### 🧠 FINAL MENTAL MODEL (LOCK THIS)

Resource acquired → try

AutoCloseable → mandatory

try-with-resources → JVM closes

finally → risky for resources


---



## Why Needed
- Prevent resource leaks
- Ensure automatic cleanup
- Safer than finally

## AutoCloseable
- Any resource implementing AutoCloseable
- close() called automatically

## try-with-resources
- Introduced in Java 7
- Closes resources even on exception or return
- Supports multiple resources

## JDBC Usage
- Use try-with-resources for Connection, Statement, ResultSet

## Best Practice
Always prefer try-with-resources over finally for resource cleanup.

---

## Trap-Heavy Interview Questions & Answers

---

## Q1. Why was try-with-resources introduced when finally already exists?

### Correct Answer:
Because `finally` **cannot guarantee safe resource cleanup**.

Problems with `finally`:
- Resource may be `null`
- `close()` can throw exception
- Original exception may be lost
- Multiple resources cause nested try-catch complexity

`try-with-resources` guarantees **automatic, safe, and deterministic cleanup**.

---

## Q2. Does try-with-resources replace finally completely?

### Trap Answer ❌  
Yes, finally is no longer needed.

### Correct Answer ✅  
No.

`finally` is still used for:
- Non-resource cleanup
- Logging
- Lock release

But for **resource management**, try-with-resources is preferred.

---

## Q3. What interface must a class implement to be used in try-with-resources?

### Correct Answer:
`AutoCloseable`

Any class implementing `AutoCloseable` will have its `close()` method called automatically.

---

## Q4. What is the difference between AutoCloseable and Closeable?

### Correct Answer:
- `AutoCloseable` is more general and introduced in Java 7
- `Closeable` extends `AutoCloseable`
- `Closeable.close()` throws `IOException`
- `AutoCloseable.close()` throws `Exception`

Most Java IO/JDBC classes implement `AutoCloseable`.

---

## Q5. In what order are multiple resources closed?

### Correct Answer:
**Reverse order of creation (LIFO)**.

```java
try (A a = ...; B b = ...) { }
Close order:

b.close()
a.close()

---

Q6. What happens if an exception occurs in try block and another in close()?
Trap Answer ❌
The close exception replaces the original.

Correct Answer ✅
The exception from close() is suppressed, not lost.

The original exception is preserved.

Access via:

Throwable[] suppressed = e.getSuppressed();

---

Q7. Can we catch suppressed exceptions directly?
Correct Answer:
No.

They are attached to the primary exception and must be accessed using getSuppressed().

---

Q8. Can we use try-with-resources with a custom class?
Correct Answer:
Yes, if the class implements AutoCloseable.

---

Q9. Will resources be closed if a return statement exists inside try?
Correct Answer:
Yes.

Resources are closed before the method returns.

---

Q10. What happens if resource creation itself fails?
Correct Answer:
Previously created resources are closed

The exception is propagated

---

Q11. Can we declare resources outside try and use try-with-resources?
Trap Answer ❌
No, resources must be created inside try.

Correct Answer ✅
Yes, since Java 9, resources declared outside can be used if they are final or effectively final.

----

Q12. Is try-with-resources faster than finally?
Trap Answer ❌
Yes, JVM optimizes it.

Correct Answer ✅
No.

Performance difference is negligible.
The benefit is safety and readability, not speed.

---

Q13. Should we use try-with-resources for JDBC?
Correct Answer:
Yes, always.

Resources like:

Connection

Statement

ResultSet

must be managed using try-with-resources to avoid leaks.

---

Q14. Can we mix try-with-resources and finally?
Correct Answer:
Yes, but rarely.

Example use:

try-with-resources for resource cleanup

finally for non-resource logic

---

Q15. Interview Killer ⚠️
Why is try-with-resources considered safer than finally?

Correct Answer:
Because it:

Guarantees cleanup

Handles multiple resources cleanly

Preserves original exceptions

Prevents resource leaks

Reduces boilerplate code

---

Q16. What happens if close() throws an exception?
Correct Answer:
JVM handles it automatically

Suppresses it if another exception already exists

Propagates it if no other exception exists

---

Q17. Can we throw checked exceptions from close()?
Correct Answer:
Yes, but they are managed automatically by JVM.

---

Q18. What is the biggest mistake developers make with try-with-resources?
Correct Answer:
Forgetting to use it for JDBC

Mixing business logic inside close

Ignoring suppressed exceptions

Falling back to finally unnecessarily

---

Q19. Is try-with-resources mandatory in modern Java?
Correct Answer:
Not mandatory, but industry best practice.

Not using it is considered a code smell.

---

Q20. One-line rule to remember?
Correct Answer:

If it must be closed → use try-with-resources

---

