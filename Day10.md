# 🗓️ Java Revision – Day 10
## Exception Handling – Day 5
## throw vs throws (Very Important)

# 🎯 CORE GOAL (Think Like a Senior Dev)

> Understand who CREATES an exception and who HANDLES it

Most developers confuse this.

Once you get this right, exception handling becomes logical, not memorization.

# 🔑 BIG PICTURE FIRST (Memorize This)

throw   → creates exception (WHERE problem detected)

throws  → declares exception (WHO will handle it)


---


### 1️⃣ throw – Manually Creating an Exception

What throw REALLY Means

throw is used when YOU detect a problem, not the JVM.

> JVM throws exceptions automatically
> 
> throw is used when business logic detects invalid state

#### ✅ Syntax

throw new ExceptionType("message");

#### ✅ Example 1: Validation Logic using throw

public class ThrowExample {

    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Valid age");
    }

    public static void main(String[] args) {
        validateAge(15);
        System.out.println("Program continues");
    }
}

#### 🧠 What Happens

1. Condition fails
2. You explicitly create exception
3. JVM stops normal flow
4. Looks for handler
5. No handler → program crashes

📌 Interview line
> throw is used to signal a problem detected by application logic.

---

### 2️⃣ Checked vs Unchecked with throw

#### ❌ Checked Exception with throw (Needs Handling)

throw new Exception("Checked exception");

#### ❌ Compile-time error unless:
- caught OR
- declared with throws

#### ✅ Unchecked Exception with throw (No Compiler Force)

throw new RuntimeException("Unchecked exception");

📌 Industry practice
> Business validation usually throws unchecked exceptions.

---

### 3️⃣ throws – Declaring Responsibility

What throws REALLY Means

throws means:
> “This method does NOT handle the exception.
> 
> Whoever calls me MUST handle it.”

It does NOT throw the exception.

#### ✅ Syntax

returnType methodName() throws ExceptionType

#### ✅ Example 2: Propagating Exception using throws

import java.io.FileReader;

import java.io.FileNotFoundException;

public class ThrowsExample {

    static void readFile() throws FileNotFoundException {
        FileReader fr = new FileReader("data.txt");
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }
}

#### 🧠 What Happens

- readFile() may fail
- It does NOT handle failure
- Responsibility passed upward
- main() also passes it
- JVM finally handles it → crash

📌 Interview line
> throws enables exception propagation.

---

### 4️⃣ Exception Propagation (CRITICAL CONCEPT)

#### Definition

Exception propagation = Exception moves up the call stack until handled

#### ✅ Example 3: Call Stack Behavior

public class PropagationDemo {

    static void method3() {
        int a = 10 / 0;
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {
        method1();
    }
}

#### 🧠 Execution Flow

main → method1 → method2 → method3

                         ↑ exception occurs

#### Stack Trace Shows

- method3
- method2
- method1
- main


📌 Senior insight
> Stack trace is literally the call stack history.

---

### 5️⃣ Handling Propagated Exception (Best Practice)

public class PropagationHandled {

    static void risky() {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            risky();
        } catch (ArithmeticException e) {
            System.out.println("Handled in main");
        }
    }
}

📌 Rule
> Handle exceptions at logical boundaries, not everywhere.

---

### 6️⃣ Rethrowing Exceptions (IMPORTANT)

#### What is Rethrowing?
- Catch an exception
- Do something (log, cleanup)
- Throw it again (same or wrapped)

#### ✅ Example 4: Rethrow Same Exception

public class RethrowSame {

    static void process() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Logging exception");
            throw e; // rethrow
        }
    }

    public static void main(String[] args) {
        process();
    }
}


📌 Stack trace preserved.

#### ✅ Example 5: Rethrow Wrapped Exception (Industry Standard)

public class RethrowWrapped {

    static void process() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            throw new RuntimeException("Calculation failed", e);
        }
    }

    public static void main(String[] args) {
        process();
    }
}


📌 Why wrap?
- Hide low-level details
- Preserve root cause
- Clean API surface

### 7️⃣ throw vs throws (INTERVIEW TABLE)

| Aspect               | throw            | throws                 |
| -------------------- | ---------------- | ---------------------- |
| Purpose              | Create exception | Declare responsibility |
| Used inside          | Method body      | Method signature       |
| Creates exception    | ✅ Yes            | ❌ No                   |
| Propagates exception | ❌ No             | ✅ Yes                  |
| Count                | One exception    | Multiple allowed       |

---

### 8️⃣ Real Backend Mapping (VERY IMPORTANT)

In Spring Boot:
- Service layer → throw unchecked exceptions
- Controller layer → no try-catch
- Global handler → handles exceptions

📌 Clean architecture depends on correct throw / throws usage.

---

### 9️⃣ Common Interview Traps ⚠️

❌ “throws throws exception” → WRONG

❌ “throw handles exception” → WRONG

❌ Catch + ignore exception → VERY WRONG

✅ Correct:
> throw creates, throws declares, JVM propagates.

---

### 🧠 FINAL MENTAL MODEL (LOCK THIS)

Problem detected  → throw

Cannot handle     → throws

Moves up stack    → propagation

Handled at edge   → try-catch

---

## throw
- Used to explicitly create an exception
- Used inside method body
- Signals invalid state detected by logic

## throws
- Used in method signature
- Declares responsibility to caller
- Enables exception propagation

## Exception Propagation
- Exception travels up call stack
- Stops when handled
- JVM handles if unhandled

## Rethrowing
- Same exception: preserve stack trace
- Wrapped exception: hide details, keep cause

## Mental Model
throw → create
throws → delegate

---


# Java Exception Handling – Day 5 (throw vs throws)
## Interview Questions & Answers (Very Important)

---

## Q1. What is the difference between `throw` and `throws`?

### Answer:
- `throw` is used to **explicitly create and throw an exception**.
- `throws` is used to **declare that a method may pass an exception to its caller**.

| Aspect | throw | throws |
|------|------|-------|
| Usage | Inside method body | In method signature |
| Purpose | Creates exception | Delegates handling |
| Throws exception | Yes | No |
| Propagation | No | Yes |

---

## Q2. Does `throws` throw an exception?

### Answer:
No.  
`throws` does **not throw** an exception.  
It only **declares responsibility**, allowing the exception to propagate to the caller.

---

## Q3. When should `throw` be used?

### Answer:
`throw` should be used when:
- Business logic detects invalid input
- A method finds an illegal or unexpected state
- JVM cannot detect the problem automatically

Example:
```java
if (age < 18) {
    throw new IllegalArgumentException("Invalid age");
}


Q4. Can we use throw without throws?
Answer:

Yes, if the exception is unchecked (RuntimeException).

Checked exceptions require either:

try-catch

or throws

Q5. What happens if a checked exception is thrown but not handled or declared?
Answer:

Compilation fails with a compile-time error.

Q6. What is exception propagation?
Answer:

Exception propagation is the process where an exception moves up the call stack until:

it is handled, or

JVM terminates the program

Q7. How does the JVM decide where to handle an exception?
Answer:

JVM searches:

Current method

Calling method

Up the call stack

JVM default handler (if none found)

Q8. What is rethrowing an exception?
Answer:

Rethrowing means:

Catching an exception

Performing some action (logging, cleanup)

Throwing it again (same or wrapped)

Q9. Difference between rethrowing same exception and wrapping exception?
Answer:

Rethrowing same exception preserves the original stack trace.

Wrapping creates a new exception but preserves the original cause.

Wrapping is preferred in layered applications.

Q10. Why is exception wrapping used in real applications?
Answer:

To:

Hide low-level implementation details

Preserve root cause

Keep method signatures clean

Maintain layered architecture

Q11. Can a method throw multiple exceptions?
Answer:

Yes.

Example:

void process() throws IOException, SQLException {
}

Q12. What happens if an exception is thrown in a called method but not handled?
Answer:

Exception propagates to caller

If still unhandled, JVM terminates the thread

Q13. Why does Spring Boot prefer unchecked exceptions?
Answer:

Because unchecked exceptions:

Keep APIs clean

Support centralized exception handling

Avoid exception propagation chains

Q14. Is it a good practice to catch and ignore exceptions?
Answer:

No.
Ignoring exceptions hides bugs and leads to unpredictable system behavior.

Q15. Interview Trap ⚠️

Does throw keyword throw an exception at compile time or runtime?

Answer:

At runtime.
throw creates an exception object and hands control to JVM during execution.

Q16. What is the best place to handle exceptions?
Answer:

At logical boundaries, such as:

Controller layer

Global exception handler

Entry/exit points of the system

Q17. Can throw be used inside a catch block?
Answer:

Yes.
This is commonly used for rethrowing or wrapping exceptions.

Q18. What happens to the call stack when an exception occurs?
Answer:

Current method stops execution

Stack unwinds method by method

Stack trace records call history

Q19. Which is better: handling exception early or late?
Answer:

Handling should be done late, at a place where:

Full context is available

Correct decision can be made

Q20. One-line rule to remember?
Answer:
throw → create
throws → delegate
exception → propagate
handle → boundary

















