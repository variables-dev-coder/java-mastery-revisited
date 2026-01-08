# Day 2 – Checked vs Unchecked Exceptions

## Checked Exceptions
- Verified at compile time
- Must be handled or declared
- Represent external, recoverable risks
- Examples: IOException, SQLException

## Unchecked Exceptions
- Occur at runtime
- Extend RuntimeException
- Indicate programming errors
- Examples: NullPointerException, IllegalArgumentException

## Why Checked Exceptions Exist
- Force acknowledgment of risk
- Prevent silent failures
- Make APIs self-documenting

## Why Unchecked Preferred in Backend
- Clean method signatures
- Supports centralized handling
- Avoids exception propagation chains
- Encourages fail-fast design

## Handling Checked Exceptions
1. try-catch (local recovery)
2. throws (delegate responsibility)

## Exception Wrapping
- Convert checked to unchecked
- Preserve root cause
- Hide implementation details

## Industry Rule
Use unchecked exceptions in service & controller layers.


# Day 2 – Checked vs Unchecked Exceptions (Interview Q&A)

## Q1. What is a checked exception?
A checked exception is verified at compile time and must be handled or declared using try-catch or throws.

## Q2. Why does Java enforce checked exceptions?
To force developers to acknowledge and handle external risks like IO or database failures.

## Q3. What is an unchecked exception?
Unchecked exceptions occur at runtime and represent programming bugs. Compiler does not enforce handling.

## Q4. Why is NullPointerException unchecked?
Because it indicates a developer mistake, not a recoverable condition.

## Q5. Why does Spring prefer unchecked exceptions?
Unchecked exceptions keep APIs clean and allow centralized exception handling.

## Q6. What is exception wrapping?
Converting a checked exception into an unchecked one while preserving the original cause.

## Q7. When should checked exceptions be used?
At API or library boundaries where the caller must decide how to handle failures.

## Q8. What happens if a checked exception is not handled?
Compilation fails.

## Q9. Which is better: checked or unchecked?
Depends on context. Backend services prefer unchecked; external APIs may use checked.

## Q10. Real-world rule?
Checked for external risk, unchecked for code bugs.
