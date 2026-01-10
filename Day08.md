# 🗓️ Java Revision – Day 08

# Exception Handling – Day 03

## try-catch-finally (Core Control)

## 🎯 GOAL (Very Important)
> Control failure flow without crashing the application

This means:
- Application should not die suddenly
- Resources should always be cleaned
- Business flow should stay predictable

---

## 1️⃣ What is try Block?

### Definition
The try block defines a risk zone — code where an exception may occur.

try {

    // risky code
}

### 🔒 Rules of try Block
1. try cannot exist alone
2. Must be followed by:
   - catch
   - OR finally
   - OR both

3. Code inside try is executed line by line
4. Once an exception occurs:
   - Remaining lines in try are skipped

📌 JVM treats try as a protected execution region

---

## 2️⃣ What is catch Block? (Execution Control)
### Purpose
Handle a specific type of failure and prevent JVM crash.

catch (ExceptionType e) {

    // recovery or logging
    
}

### 🧠 JVM Logic
- JVM checks:
  > “Is there a matching catch block?”
- If yes → control moves to catch
- If no → exception propagates upward


---


## 3️⃣ Catch Execution Order (VERY IMPORTANT)
### Rule
👉 Child exception first, parent exception last

❌ Wrong Order (Compile-time Error)

try {

    int a = 10 / 0;
    
} catch (Exception e) {

} catch (ArithmeticException e) {

}

Why?

Exception already catches everything

ArithmeticException becomes unreachable

✅ Correct Order

try {

    int a = 10 / 0;
    
} catch (ArithmeticException e) {

    System.out.println("Arithmetic issue");
    
} catch (Exception e) {

    System.out.println("Generic issue");
    
}


📌 Interview line
> Catch blocks must be ordered from most specific to most general.

---

## 4️⃣ What is finally Block? (Guaranteed Execution)
### Definition

finally is a cleanup block that executes regardless of success or failure.

finally {

    // cleanup code
    
}

### Used For
- Closing files
- Releasing DB connections
- Releasing locks
- Logging

📌 Key Idea
> finally exists for resource safety, not error handling.

---

## 5️⃣ Normal Execution Flow (NO Exception)

✅ Code

public class NormalFlowDemo {

    public static void main(String[] args) {
    
        try {
        
            System.out.println("Try block");
            
            int a = 10 + 5;
            
        } catch (Exception e) {
        
            System.out.println("Catch block");
            
        } finally {
        
            System.out.println("Finally block");
            
        }
        
        System.out.println("Program continues");
        
    }
    
}


### 🔄 Execution Flow

Try → Finally → Next statements

Output

Try block

Finally block

Program continues


---


## 6️⃣ Exception Execution Flow

✅ Code

public class ExceptionFlowDemo {

    public static void main(String[] args) {
    
        try {
        
            System.out.println("Try start");
            
            int a = 10 / 0;
            
            System.out.println("Try end"); // skipped
            
        } catch (ArithmeticException e) {
        
            System.out.println("Catch executed");
            
        } finally {
        
            System.out.println("Finally executed");
            
        }
        
        System.out.println("Program continues");
        
    }
    
}


### 🔄 Execution Flow

Try → Exception → Catch → Finally → Next statements

Output

Try start

Catch executed

Finally executed

Program continues


---


## 7️⃣ Proving: finally ALWAYS Runs
### Case 1: Exception Occurs ✅
  - finally runs

### Case 2: No Exception ✅
 - finally runs

### Case 3: return inside try ✅
 - finally runs

public class FinallyWithReturn {

    public static void main(String[] args) {
    
        System.out.println(test());
        
    }

    static int test() {
    
        try {
        
            return 10;
            
        } finally {
        
            System.out.println("Finally executed");
            
        }
        
    }
    
}

Output

Finally executed

10


📌 Critical Insight
> return pauses, finally executes, then value returns.


---


## 8️⃣ finally vs return (INTERVIEW TRAP)

### 🔥 If finally has return → it OVERRIDES try return

static int test() {

    try {
    
        return 10;
        
    } finally {
    
        return 20;
    }
    
}

Output

20


📌 Industry Rule
> ❌ Never return from finally

It destroys method intent


---

## 9️⃣ finally Execution During Exception

Even if exception is NOT caught

public class FinallyWithoutCatch {

    public static void main(String[] args) {
    
        try {
        
            int a = 10 / 0;
            
        } finally {
        
            System.out.println("Finally executed");
            
        }
        
    }
    
}


Output

Finally executed

Exception in thread "main" java.lang.ArithmeticException

📌 finally executes before JVM crash

---

## 🔟 ONLY Case finally Does NOT Run ❌
### 🚫 System.exit()

public class SystemExitDemo {

    public static void main(String[] args) {
    
        try {
        
            System.out.println("Try block");
            
            System.exit(0);

        } finally {
        
            System.out.println("Finally block");
            
        }
        
    }
    
}

Output

Try block

📌 JVM shuts down immediately → finally skipped

---


## 1️⃣1️⃣ Execution Flow Summary (MEMORIZE)

No exception        → try → finally

Exception caught   → try → catch → finally

Exception uncaught → try → finally → JVM crash

return in try      → finally → return

System.exit()      → finally skipped

---

## 🧠 Senior-Level Best Practices

✅ Use finally ONLY for cleanup

❌ Never put business logic in finally

❌ Never return from finally

✅ Prefer try-with-resources over finally (next day topic)

---


## try block
- Contains risky code
- Stops execution on exception

## catch block
- Handles specific exceptions
- Order: child → parent

## finally block
- Executes always
- Used for cleanup
- Runs even with return or exception
- Skipped only with System.exit()

## finally vs return
- finally executes before return
- return in finally overrides try return (bad practice)

## Execution Flow
No exception: try → finally
Exception handled: try → catch → finally
Exception unhandled: try → finally → crash

---


## 1️⃣ Can a try block exist without catch?

✅ Answer

Yes, only if finally is present.

try {

    riskyCode();
    
} finally {

    cleanup();
    
}


❌ Invalid:

try {

    riskyCode();
    
}


📌 Trap intent: Many candidates say “No” immediately.


---


## 2️⃣ Can a catch block exist without try?

❌ Answer

No.

A catch block must always follow a try.


---


## 3️⃣ What happens if an exception occurs inside try but no matching catch exists?

✅ Answer
- finally executes
- Then the exception propagates
- JVM terminates the thread

📌 Important: finally executes before crash.

---

## 4️⃣ Does finally always execute?

❌ Trap Answer: “Yes, always”

✅ Correct Answer:

finally executes in all cases except:
- System.exit()
- JVM crash / power failure

---

## 5️⃣ What if both try and finally have return?

🔥 Trap Code

static int test() {

    try {
    
        return 10;
        
    } finally {
    
        return 20;
        
    }
    
}

✅ Answer

Returned value = 20

📌 Why?

finally overrides try return.

🎯 Senior Rule
> Never return from finally.

---

## 6️⃣ Will finally execute if an exception is thrown in catch?

✅ Answer

Yes.

try {

    int a = 10 / 0;
    
} catch (ArithmeticException e) {

    throw new RuntimeException();
    
} finally {

    System.out.println("Finally");
    
}

📌 finally always executes before propagation.


---


## 7️⃣ What happens if an exception occurs in finally itself?

🔥 Trap Code

try {

    int a = 10 / 0;
    
} finally {

    int b = 10 / 0;
    
}

✅ Answer
- Original exception is lost
- Exception from finally is thrown

📌 Very dangerous

Never throw exceptions from finally.


---

## 8️⃣ Can we write multiple finally blocks?

❌ Answer

No.

Only one finally per try.

---

## 9️⃣ What is the correct order of multiple catch blocks?

✅ Answer

Child → Parent

catch (ArithmeticException e) { }

catch (Exception e) { }

❌ Reverse order causes compile-time error.

---

## 🔟 Is it allowed to catch Exception?

✅ Answer
- Yes, but discouraged unless:
- Global handler
- Logging
- Boundary layer

📌 Catching Exception hides specific failures.

---

## 1️⃣1️⃣ Can finally modify variables returned by try?

🔥 Trap Code

static int test() {

    int x = 10;
    
    try {
    
        return x;
        
    } finally {
    
        x = 20;
        
    }
    
}

✅ Answer

Returned value = 10

📌 Return value is copied before finally executes.

---

## 1️⃣2️⃣ What happens if both catch and finally throw exceptions?

✅ Answer
- Exception from finally wins
- Exception from catch is lost

📌 This is why finally should be clean and safe.

---

## 1️⃣3️⃣ Can we write try inside try?
✅ Answer

Yes (nested try blocks).

📌 Used when:
- Different risk zones
- Different recovery logic

---

## 1️⃣4️⃣ Can finally be skipped without System.exit()?
❌ Answer

No (under normal JVM execution).

---

## 1️⃣5️⃣ Interview Killer Question ⚠️

Why is finally dangerous if misused?

✅ Answer

Because:
- It can suppress original exceptions
- It can override return values
- It can introduce new failures
- It can hide root cause

📌 Senior insight
> finally is for cleanup, not logic.

---

## 1️⃣6️⃣ Why does Java execute finally even after return?
✅ Answer

To guarantee:
- Resource release
- Memory safety
- Predictable cleanup

This design ensures no resource leaks.

---

## 1️⃣7️⃣ What is better: finally or try-with-resources?
✅ Answer

try-with-resources is better because:
- Automatic cleanup
- No suppression bugs
- Cleaner code

📌 finally is legacy for resource handling.

---

## 🧠 FINAL INTERVIEW CHEAT SHEET

try → risky code

catch → handle failure

finally → cleanup

finally runs:

✔ exception

✔ return

✔ no exception

✘ System.exit()

never:

✘ return from finally

✘ throw from finally

✘ business logic in finally






















🔥 Start Day 4 – Multiple catch & Multi-catch

Just say “Next” 💪
