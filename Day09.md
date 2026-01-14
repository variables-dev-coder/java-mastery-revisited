# 🗓️ Java Revision – Day 09
# Exception Handling – Day 4
## Multiple catch & Multi-catch (Clean Handling)

## 🎯 GOAL (Why this matters)
> Handle multiple failure types cleanly
> 
> without:

- duplicate code
- broken logic
- unreadable exception blocks

Bad handling = noisy, fragile code

Clean handling = maintainable backend systems

---

### 1️⃣ Multiple Catch Blocks (Classic & Still Important)
Concept

Use multiple catch blocks when:
- Each exception needs different handling
- Recovery logic is different

✅ Example: Handle 3 Exceptions Separately

public class MultipleCatchDemo {

    public static void main(String[] args) {
        try {
            int[] arr = {10, 20};
            System.out.println(arr[5]);        // AIOOBE
            int a = 10 / 0;                    // ArithmeticException
            String s = null;
            s.length();                        // NullPointerException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index issue");
        }
        catch (ArithmeticException e) {
            System.out.println("Math issue");
        }
        catch (NullPointerException e) {
            System.out.println("Null reference issue");
        }
    }
}

🧠 Execution Rule
- JVM jumps to the first matching catch
- Remaining catch blocks are skipped
- Only one catch executes

---

### 2️⃣ Order of Catch Blocks (VERY IMPORTANT ⚠️)
Rule (Memorize)
> Child exception first → Parent exception last

❌ WRONG Order (Compile-time Error)

try {

    int a = 10 / 0;
}

catch (Exception e) {

    System.out.println("General");
}

catch (ArithmeticException e) {

    System.out.println("Arithmetic");
    
}


❌ Error

Unreachable catch block

Why?
- Exception already catches everything
- Child never reached

✅ CORRECT Order

try {

    int a = 10 / 0;
}

catch (ArithmeticException e) {

    System.out.println("Arithmetic");
}

catch (Exception e) {

    System.out.println("General");
}

🧠 Interview Line
> Catch blocks must be ordered from most specific to most general.

---

### 3️⃣ Why Multiple Catch Can Become Ugly

❌ Bad Design (Duplication)

catch (ArithmeticException e) {

    logError(e);
    
}

catch (NullPointerException e) {

    logError(e);
    
}

catch (ArrayIndexOutOfBoundsException e) {

    logError(e);
    
}

Problems:
- Duplicate logic
- Hard to maintain
- Violates DRY principle

👉 This is why multi-catch exists.


---

### 4️⃣ Multi-catch (|) – Clean & Modern Java

Concept

Use one catch block to handle multiple exception types with same logic.

public class MultiCatchDemo {

    public static void main(String[] args) {
        try {
            String s = null;
            s.length();
        }
        catch (NullPointerException | ArithmeticException |
               ArrayIndexOutOfBoundsException e) {
            System.out.println("Runtime exception occurred");
        }
    }
}

🧠 Behind the Scenes
- e is implicitly final
- JVM matches exception type
- Executes shared logic

---

### 5️⃣ Rule: Exceptions in Multi-catch Must Be Unrelated

❌ INVALID Multi-catch (Compile-time Error)

catch (Exception | ArithmeticException e) {

}


Why?
- ArithmeticException is a child of Exception
- Redundant & ambiguous

📌 Rule
> Do not mix parent and child in multi-catch.

---

### 6️⃣ Why e Is Final in Multi-catch (Trap Question)

catch (NullPointerException | ArithmeticException e) {

    e = new RuntimeException(); // ❌ compile-time error
    
}

Why?
- Compiler cannot guarantee exact type at runtime
- Prevents unsafe reassignment

🧠 Interview Answer
> The exception variable in multi-catch is implicitly final for type safety.

---

### 7️⃣ When NOT to Use Multi-catch (VERY IMPORTANT)

#### ❌ Case 1: Different Recovery Logic

catch (IOException | SQLException e) {

    // BAD: recovery is different
    
}


Why?
- IO failure ≠ DB failure
- Handling must differ

#### ❌ Case 2: Need Exception-Specific Data

catch (FileNotFoundException | SQLException e) {

    e.getSQLState(); // ❌ not allowed
    
}


Why?
- Shared type does not expose specific methods

#### ❌ Case 3: Business Logic Decisions

If exception type decides:
- retry?
- fallback?
- abort?

👉 Do NOT use multi-catch

---

### 8️⃣ Best Practice Pattern (Industry Standard)

✅ Clean Hybrid Approach

try {

    riskyOperation();
    
}

catch (ArithmeticException | NullPointerException e) {

    logError(e);
    
}

catch (Exception e) {

    handleGenericFailure(e);
    
}


🧠 Why this works:
- Similar failures grouped
- Generic fallback last
- Clean & readable

---

### 9️⃣ Decision Table (MEMORIZE)

| Situation          | Use            |
| ------------------ | -------------- |
| Different handling | Multiple catch |
| Same handling      | Multi-catch    |
| Parent + child     | Separate catch |
| Logging only       | Multi-catch    |
| Business decisions | Separate catch |

---

### 🔟 Interview Killer Question ⚠️

Why was multi-catch introduced in Java 7 ?

✅ Answer

To:
- Reduce duplicate catch blocks
- Improve readability
- Enforce cleaner exception handling
- Support DRY principle

---

### 🧠 FINAL MENTAL MODEL

Multiple catch → different recovery

Multi-catch → same recovery

Order → child first

Never mix parent & child

---

## Multiple Catch
- Used when handling logic differs
- Order: child → parent
- Only one catch executes

## Multi-catch
- Handles multiple exceptions in one block
- Introduced in Java 7
- Exception variable is final
- Cannot mix parent and child

## Do Not Use Multi-catch When
- Handling logic differs
- Exception-specific methods needed
- Business decisions depend on exception type

## Best Practice
Group similar failures, keep generic catch last.

---


## Multiple Catch & Multi-catch (Trap-Heavy Interview Q&A)

### 1️⃣ Can multiple catch blocks execute for one try?
❌ Wrong Answer

Yes, if multiple exceptions occur.

✅ Correct Answer

No. Only one catch block executes — the first matching one.

📌 JVM stops searching once it finds a match.

### 2️⃣ What happens if catch blocks are ordered parent → child?
🔥 Trap

try {

    int a = 10 / 0;
}

catch (Exception e) {

}

catch (ArithmeticException e) {

}

✅ Correct Answer

Compilation fails with unreachable catch block error.

📌 Child exceptions must come before parent.

### 3️⃣ Why does Java enforce child → parent order?

✅ Answer

To avoid unreachable code and ensure specific handling before generic handling.

### 4️⃣ What is multi-catch?

✅ Answer

A single catch block that handles multiple unrelated exceptions using |.

catch (NullPointerException | ArithmeticException e) { }


Introduced in Java 7.

### 5️⃣ Can we use parent and child together in multi-catch?

❌ Trap Answer

Yes, because it handles both.

✅ Correct Answer

No. Compilation fails.

catch (Exception | ArithmeticException e) { } // ❌


📌 Parent already covers child.

### 6️⃣ Why is the exception variable final in multi-catch?

🔥 Trap Question

✅ Correct Answer

Because the compiler cannot determine the exact runtime type and must prevent unsafe reassignment.

catch (A | B e) {

    e = new RuntimeException(); // ❌
    
}

### 7️⃣ Can we call exception-specific methods inside multi-catch?

❌ Wrong Answer

Yes, based on instanceof.

✅ Correct Answer

No, unless the method exists in all exception types.

catch (SQLException | IOException e) {

    e.getSQLState(); // ❌
    
}

### 8️⃣ When should multi-catch NOT be used?

✅ Answer

When:

Recovery logic differs

Business decision depends on exception type

Exception-specific information is required

### 9️⃣ Is multi-catch better than multiple catch?

❌ Trap Answer

Yes, always.

✅ Correct Answer

No.
Use multi-catch only when handling logic is identical.

### 🔟 Can multi-catch improve performance?

❌ Trap Answer

Yes, fewer catch blocks = faster.

✅ Correct Answer

No measurable performance difference.

It’s a readability & maintainability feature, not performance.

### 1️⃣1️⃣ What happens if an exception in multi-catch needs rethrowing?

✅ Answer

It can be rethrown, but only as a common supertype.

catch (IOException | SQLException e) {

    throw e; // allowed only if method declares both
    
}

### 1️⃣2️⃣ Can multi-catch replace a generic catch (Exception e)?

❌ Trap Answer

Yes, always.

✅ Correct Answer

No.

Generic catch is still needed for unknown failures.

### 1️⃣3️⃣ Why is this considered bad practice?

catch (Exception e) {

    e.printStackTrace();
    
}

✅ Answer

Because:

Hides specific failures

Breaks layered architecture

Pollutes logs without context

### 1️⃣4️⃣ Can checked and unchecked exceptions be mixed in multi-catch?

✅ Answer

Yes, if handling logic is the same.

catch (IOException | NullPointerException e) {

    log(e);
}

### 1️⃣5️⃣ Interview Killer ⚠️

Why is multi-catch dangerous in business logic?

✅ Answer

Because it:

Hides failure intent

Prevents differentiated recovery

Leads to incorrect fallback decisions

### 🧠 FINAL INTERVIEW CHEAT SHEET

Only one catch executes

Order → child before parent

Multi-catch → same logic only

No parent + child in multi-catch

Exception variable is final

Readability > performance



---

### 1️⃣ Can one try block have multiple catch blocks?

✅ Answer

Yes. A single try block can have multiple catch blocks, but only one catch executes — the first matching one.

📌 Trap: Some candidates say all matching catches execute → ❌

### 2️⃣ In what order are catch blocks checked?

✅ Answer

From top to bottom, in the order they appear in code.

The first matching catch is executed.

### 3️⃣ Why must catch blocks be ordered child → parent?

🔥 Trap Question

✅ Answer

Because if a parent exception (Exception) appears first, it will catch all child exceptions, making child catches unreachable.

This causes a compile-time error.

### 4️⃣ Will this code compile?

try {

    int a = 10 / 0;
    
} catch (Exception e) {

} catch (ArithmeticException e) {

}

❌ Answer

No.

📌 Reason

ArithmeticException is already handled by Exception.

### 5️⃣ What is multi-catch?

✅ Answer

Multi-catch allows handling multiple unrelated exceptions in a single catch block using |.

Introduced in Java 7.

### 6️⃣ Will this multi-catch compile?

catch (Exception | ArithmeticException e) {

}

❌ Answer

No.

📌 Reason

You cannot mix parent and child exceptions in multi-catch.

### 7️⃣ Why is the exception variable in multi-catch final?

🔥 Trap Question

✅ Answer

Because the compiler cannot guarantee which exception type was thrown at runtime.

Making it final ensures type safety and prevents reassignment.

### 8️⃣ Can we call exception-specific methods inside multi-catch?

catch (FileNotFoundException | SQLException e) {

    e.getSQLState(); // ?
    
}

❌ Answer

No.

📌 Reason

The variable type is the common parent, not the specific exception.

### 9️⃣ When should multi-catch NOT be used?

✅ Answer

When:
- Different exceptions need different recovery
- Business logic depends on exception type
- Exception-specific methods are required

📌 Trap: “Multi-catch is always better” → ❌

### 🔟 Which is better: multiple catch or multi-catch?

✅ Answer
Depends on the handling logic:
- Same handling → multi-catch
- Different handling → multiple catch

### 1️⃣1️⃣ Will this code compile?

catch (NullPointerException | ArithmeticException e) {

    e = new RuntimeException();
    
}

❌ Answer

No.

📌 Reason

Exception variable in multi-catch is implicitly final.

### 1️⃣2️⃣ How many catch blocks execute if an exception occurs?

✅ Answer

Only one — the first matching catch.

### 1️⃣3️⃣ Can multi-catch improve performance?

🔥 Trap Question

❌ Answer

No.

📌 Reason

Multi-catch improves readability, not performance.

### 1️⃣4️⃣ Can checked and unchecked exceptions be mixed in multi-catch?

✅ Answer

Yes, if handling logic is identical and they are not parent-child.

Example:

catch (IOException | IllegalArgumentException e) {

}

### 1️⃣5️⃣ Interview Killer Question ⚠️

Why was multi-catch introduced in Java?

✅ Answer

To:

Reduce duplicate catch blocks

Improve readability

Enforce DRY principle

Clean up exception handling code

### 1️⃣6️⃣ What happens if no catch matches the exception?

✅ Answer

finally executes

Exception propagates

JVM terminates the thread

### 1️⃣7️⃣ Can we nest multi-catch inside multiple catch blocks?

✅ Answer

Yes.

Example:

try {

}
catch (ArithmeticException | NullPointerException e) {

}

catch (Exception e) {

}


---












