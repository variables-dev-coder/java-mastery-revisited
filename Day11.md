# 🗓️ Java Revision – Day 11
# Exception Handling – Day 6
# Custom Exceptions (Real Backend Skill)

## 🎯 CORE GOAL
> Create business-meaningful errors instead of generic technical exceptions

Bad backend code:
- NullPointerException
- IllegalArgumentException

Good backend code:
- InvalidUserException
- InsufficientBalanceException

👉 This improves readability, debugging, logging, and API responses.

---

### 1️⃣ Why Custom Exceptions Exist (VERY IMPORTANT)
#### Problem with built-in exceptions

throw new IllegalArgumentException("User not found");

❌ Issues:
- No business meaning
- Hard to categorize
- Poor API error response
- Ugly logs

Solution: Custom Exceptions

throw new InvalidUserException("User does not exist");

✅ Benefits:
- Business clarity
- Domain-driven design
- Clean error handling
- Better API contracts

📌 Interview line
> Custom exceptions represent business rule violations, not system failures.

---

### 2️⃣ Checked vs Unchecked Custom Exceptions
#### 🟢 Unchecked Custom Exceptions (MOST USED)

When to use
- Business rule violations
- Validation failures
- Authorization issues

Why preferred
- Clean method signatures
- Centralized handling
- Works perfectly with Spring Boot

✅ Example: Unchecked Custom Exception

public class InvalidUserException extends RuntimeException {

    public InvalidUserException(String message) {
        super(message);
    }
}

📌 Industry standard: extend RuntimeException

#### 🔵 Checked Custom Exceptions (RARE)

When to use
- Library / framework APIs
- Mandatory caller handling
- External contracts

❌ Not recommended for service layers

Example (for knowledge)

public class FileProcessingException extends Exception {

    public FileProcessingException(String message) {
        super(message);
    }
}

📌 Backend services almost never use this.

---


### 3️⃣ Naming Conventions (INTERVIEW FAVORITE)

#### ✅ Correct Naming

InvalidUserException

InsufficientBalanceException

OrderNotFoundException

UnauthorizedAccessException

#### ❌ Wrong Naming

UserError

BalanceProblem

CustomException1

📌 Rule
> Name exception after business failure, not technical issue.


---


### 4️⃣ Exception Messages (VERY IMPORTANT)
#### ❌ Bad Message

throw new InvalidUserException("Error");

#### ✅ Good Message

throw new InvalidUserException("User with given ID does not exist");


📌 Message should be:
- Human-readable
- API-safe
- Log-friendly
- Not reveal internal data

---


### 5️⃣ TASK 1 – Create InvalidUserException

public class InvalidUserException extends RuntimeException {

    public InvalidUserException(String message) {
        super(message);
    }
}

---

### 6️⃣ TASK 2 – Create InsufficientBalanceException

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

---

### 7️⃣ Throw Custom Exceptions from Service Layer

🧠 Rule

Service layer throws exceptions, controller handles them

✅ Service Class

public class BankService {

    public void withdraw(double balance, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (balance < amount) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available: " + balance
            );
        }

        System.out.println("Withdrawal successful");
    }
}

✅ User Service Example

public class UserService {

    public void findUser(String userId) {
        if (userId == null || userId.isEmpty()) {
            throw new InvalidUserException("User ID cannot be empty");
        }

        // assume user not found
        throw new InvalidUserException("User not found with ID: " + userId);
    }
}


📌 Key idea
> Services NEVER print errors — they THROW.

---

### 8️⃣ Catch Custom Exceptions in Controller / Main Layer

#### ✅ Controller / Main Layer

public class Application {

    public static void main(String[] args) {

        BankService bankService = new BankService();

        try {
            bankService.withdraw(5000, 7000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("System error");
        }
    }
}


📌 Controller:
- Converts exception → response
- Logs
- Sends proper message

---

### 9️⃣ How Spring Boot Uses Custom Exceptions (CRITICAL)
In Spring Boot:
- Services → throw new CustomException()
- Controllers → NO try-catch
- @ControllerAdvice → global handling

Example:

@ResponseStatus(HttpStatus.NOT_FOUND)

@ExceptionHandler(InvalidUserException.class)

public ErrorResponse handleInvalidUser(InvalidUserException ex) {

    return new ErrorResponse(ex.getMessage());
}


📌 This is industry-mandatory.

---

### 🔟 Where Custom Exceptions Are Used (Notes)
- Service layer validation
- Business rule enforcement
- Authorization checks
- Payment & order processing
- API error mapping

---

### 🧠 FINAL MENTAL MODEL (LOCK THIS)

System error → built-in exception

Business error → custom exception

Service → throw

Controller → handle

Spring Boot → global handler


---


## Why Custom Exceptions
- Represent business rule violations
- Improve readability and debugging
- Enable clean API responses

## Checked vs Unchecked
- Prefer unchecked (RuntimeException)
- Checked used rarely in libraries

## Naming
- Use business-focused names
- End with Exception

## Messages
- Clear, user-friendly
- No internal details

## Backend Usage
- Service layer throws
- Controller or global handler catches
- Spring Boot uses @ControllerAdvice

---

# Java Exception Handling – Day 6 (Custom Exceptions)
## Trap-Heavy Interview Questions & Answers

---

## Q1. Why do we need custom exceptions when Java already provides many?

### Answer:
Built-in exceptions represent **technical failures** (null, IO, arithmetic).
Custom exceptions represent **business rule violations**.

Example:
- Technical: `NullPointerException`
- Business: `InvalidUserException`

Custom exceptions improve:
- Code readability
- API error responses
- Logging and debugging
- Domain clarity

---

## Q2. Should custom exceptions be checked or unchecked?

### Correct Answer:
Most custom exceptions in backend applications should be **unchecked**  
(by extending `RuntimeException`).

### Why?
- Avoid method signature pollution
- Support centralized exception handling
- Enable clean layered architecture

---

## Q3. When should a checked custom exception be used?

### Answer:
Rarely. Only when:
- Writing a reusable library
- Caller **must** handle the exception
- API contract requires explicit handling

---

## Q4. Is it good practice to extend `Exception` for custom exceptions?

### Trap Answer ❌  
Yes, because it forces handling.

### Correct Answer ✅  
No. In backend systems, extending `RuntimeException` is preferred.

Forcing handling often causes:
- Unnecessary try-catch
- Poor design
- Broken layering

---

## Q5. Where should custom exceptions be thrown?

### Correct Answer:
In the **service layer**, where business rules are enforced.

Services detect invalid state and **throw**, not handle.

---

## Q6. Where should custom exceptions be handled?

### Correct Answer:
At **application boundaries**, such as:
- Controller layer
- Global exception handler (`@ControllerAdvice`)

Never deep inside business logic.

---


## Q7. Is it a good practice to catch a custom exception immediately after throwing it?

### Answer:
No.

That defeats the purpose of:
- Exception propagation
- Centralized handling
- Clean architecture

---


## Q8. Why is this bad practice?

```java
try {
    throw new InvalidUserException("User not found");
} catch (InvalidUserException e) {
    System.out.println(e.getMessage());
}
Answer:
Business logic and handling are mixed

Error context is lost

Not scalable


Q9. What should a good custom exception name represent?
Correct Answer:
The business failure, not the technical problem.

Example:

✅ InsufficientBalanceException

❌ BalanceError


Q10. What makes a good exception message?
Answer:
A good message should be:

Clear and human-readable

Safe to expose in API responses

Helpful for debugging

Free of internal/system details


Q11. Should custom exceptions contain sensitive data?
Correct Answer:
No.

Exception messages may reach:

Logs

API responses

Monitoring tools

Never expose internal IDs, SQL, or secrets.


Q12. How does Spring Boot typically handle custom exceptions?
Answer:
Service layer throws custom exceptions

Controllers do not use try-catch

@ControllerAdvice handles globally

Maps exceptions to HTTP responses


Q13. Why is catching Exception considered bad practice?
Answer:
Because it:

Hides specific failures

Makes debugging difficult

Breaks layered exception design

Generic catching should be used only at system boundaries.


Q14. Can multiple custom exceptions extend the same base exception?
Correct Answer:
Yes.

Example:

class BusinessException extends RuntimeException { }
class InvalidUserException extends BusinessException { }
class InsufficientBalanceException extends BusinessException { }
This allows grouped handling.


Q15. Interview Killer ⚠️
Why are custom exceptions important in REST APIs?

Answer:
Because they:

Map cleanly to HTTP status codes

Provide meaningful error responses

Improve API consumer experience

Support standardized error formats


Q16. Should custom exceptions be logged where they are thrown?
Correct Answer:
No.

They should be logged:

Once

At the boundary (controller/global handler)

Logging at multiple layers causes log pollution.


Q17. What is the difference between system exceptions and business exceptions?
Answer:
System exceptions → JVM / infrastructure failures

Business exceptions → rule violations defined by application logic


Q18. Is it okay to use RuntimeException directly instead of custom exception?
Trap Answer ❌
Yes, it’s simpler.

Correct Answer ✅
No.

Using custom exceptions provides:

Semantic meaning

Better handling

Clear intent


Q19. Can custom exceptions be reused across microservices?
Answer:
Yes, but usually:

Shared via common library

Or represented via error codes/messages


Q20. One-line rule to remember?
Answer:

Technical failure → built-in exception
Business failure  → custom exception
Throw in service  → handle at boundary



























