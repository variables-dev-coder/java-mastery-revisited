# 🔥 OOP RE-PRACTICE → 3-DAY MASTER PLAN

## 1️⃣ Class & Object (Not Definition – Reality)

🔹 Class

A blueprint that defines:
- State → fields (data)
- Behavior → methods
- Rules → access control

class User {

    int id;
    
    String name;

    void login() {
    
        System.out.println("User logged in");
    }
    
}


🔹 Object

An actual instance occupying heap memory.

User u1 = new User();

🔥 Interview Truth
- Class → compile time
- Object → runtime

Multiple objects can be created from one class

---

## 2️⃣ Constructors – Object Birth Mechanism

❓ What Constructor REALLY Does
- Allocates memory
- Initializes object state
- Enforces mandatory fields

class User {

    int id;
    
    String name;

    User(int id, String name) {
    
        this.id = id;
        
        this.name = name;
    }
    
}

🔹 Types

| Type          | Purpose                               |
| ------------- | ------------------------------------- |
| Default       | Provided by compiler (if none exists) |
| Parameterized | Force valid object creation           |
| Private       | Singleton / Factory pattern           |

🔥 Rule
- Constructor name = class name
- No return type
- Runs only once per object


---


## 3️⃣ this Keyword – ALL Meanings (Very Important)

1️⃣ Refers to current object

this.id = id;

2️⃣ Constructor chaining

this(10);

3️⃣ Passing current object

method(this);

4️⃣ Returning current object

return this;

🔥 Interview Line
> "this resolves ambiguity between instance variables and parameters"


---


## 4️⃣ static Keyword – Class-Level Power

🔹 What static REALLY Means
> Belongs to class, not object

class Counter {

    static int count = 0;

    Counter() {
    
        count++;
    }
    
}

🔹 Static Can Be
- Variables
- Methods
- Blocks
- Nested classes

🔥 Rules
- Static method ❌ cannot access non-static directly
- Static loaded once at class loading time

---

## 5️⃣ Object Lifecycle & JVM Memory (CRUCIAL)
🔹 Memory Areas

| Area      | Purpose                  |
| --------- | ------------------------ |
| Stack     | Method calls, local vars |
| Heap      | Objects & instance vars  |
| Metaspace | Class metadata           |

🔄 Lifecycle
- Class loaded
- Object created (new)
- Constructor executed
- Object used
- Eligible for GC

🔥 Interview Tip
> Java has no destructors, GC handles cleanup


---

## 6️⃣ Encapsulation – Data Protection (REAL MEANING)
> Hide data + expose behavior safely

class BankAccount {

    private double balance;

    public double getBalance() {
    
        return balance;
        
    }

    public void deposit(double amount) {
    
        if (amount > 0) balance += amount;
        
    }
    
}

🔥 Why Encapsulation?
- Validation
- Security
- Loose coupling
- Maintainability

---

## 7️⃣ Immutable Classes (Very High Value Topic)

🔹 What is Immutable?
> Object state cannot change after creation

🔹 Classic Example

final class ImmutableUser {

    private final int id;
    
    private final String name;

    public ImmutableUser(int id, String name) {
    
        this.id = id;
        
        this.name = name;
    }

    public int getId() {
    
    return id; 
    
    }
    
    public String getName() {
    
    return name; 
    
    }
    
}

🔹 Rules
1. Class final
2. Fields private final
3. No setters
4. Defensive copy (for mutable objects)

🔥 Why Important?
- Thread-safe
- Cache friendly
- Used in String, Wrapper classes

---

## 1️⃣ Why Constructors Are NOT Inherited?

✅ Short Answer

Because constructors are meant to initialize a class’s own state, not the child’s.

✅ Deep Reason
- Inheritance is about behavior sharing
- Constructors are about object creation
- Child class may have different fields, so parent constructor cannot safely initialize it

class A {

    A(int x) {}
    
}

class B extends A {

    B() {
    
        // A(int) is NOT inherited
        
        super(10); // must be called explicitly
        
    }
    
}

🔥 Interview Line
> “Constructors initialize class-specific state, so inheriting them would break object integrity.”


---

## 2️⃣ Difference Between Static & Instance Variables

| Feature       | Static              | Instance             |
| ------------- | ------------------- | -------------------- |
| Belongs to    | Class               | Object               |
| Memory        | One copy            | One per object       |
| Access        | `ClassName.var`     | Object reference     |
| Lifecycle     | Class load → unload | Object creation → GC |
| Thread Safety | Shared → risky      | Safer                |


🔥 Example

class Test {

    static int x;
    
    int y;
    
}
- x → shared
- y → unique per object

🔥 Interview Line
> “Static variables represent class-level state; instance variables represent object-level state.”

---


## 3️⃣ Why String Is Immutable?
✅ Primary Reasons
- Security (URLs, DB creds)
- Thread safety
- String Pool optimization
- HashMap key reliability

🔥 Example

String s = "java";

s.concat("world");

System.out.println(s); // java

🔥 Critical Point
- Any modification → new object
- Old object remains unchanged

🔥 Interview Line
> “Immutability makes String thread-safe, secure, and cacheable.”


---

## 4️⃣ What Happens If Constructor Is Private?
✅ Result
- Object cannot be created outside the class
- Used in:
  - Singleton
  - Factory pattern
  - Utility classes

🔥 Example

class Singleton {

    private Singleton() {}
    
}

🔥 Interview Line
> “Private constructors restrict object creation and enforce controlled instantiation.”

---

## 5️⃣ Object Creation Steps in JVM

🔄 Execution Order

1️⃣ Class loading
2️⃣ Memory allocated in heap
3️⃣ Default values assigned
4️⃣ Constructor executed
5️⃣ Reference returned

User u = new User();

🔥 Important
- Object exists before constructor runs
- Constructor initializes it

🔥 Interview Line
> “Memory allocation happens before constructor execution.”

---

## 6️⃣ Can Constructor Be Overridden?
❌ No

Because:
- Constructor name = class name
- Overriding applies to methods only

---

## 7️⃣ Can We Make Constructor static?
❌ No

Because:
- Constructor runs on object creation
- Static belongs to class

---

## 8️⃣ Can Abstract Class Have Constructor?

✅ Yes

Used to:
- Initialize common fields

abstract class Shape {

    Shape() {
    
        System.out.println("Shape created");
        
    }
    
}

---


## 9️⃣ Can Interface Have Constructor?

❌ No

Because:
- Interface has no instance state

---

## 🔟 Can We Call Constructor Explicitly?

❌ No

obj.ClassName(); // invalid


Only via:
- new
- this()
- super()

---

## 1️⃣1️⃣ Why this() Must Be First Statement?

Because:
- Object initialization order must be strict
- Avoids partially initialized object

---

## 1️⃣2️⃣ Can Static Method Access Instance Variable?

❌ No (directly)

Because:
- Instance belongs to object
- Static has no object context


---

## 1️⃣3️⃣ Why Static Methods Cannot Be Overridden?

Because:
- Overriding is runtime
- Static binding is compile-time

👉 This is method hiding, not overriding.

---

## 1️⃣4️⃣ Can We Change Immutable Object Internally?

❌ No (by design)
Unless:
- Reflection (breaks immutability)

---

## 1️⃣5️⃣ What Is Tight vs Loose Coupling?

- Tight → hard dependency
- Loose → interface-based dependency

🔥 Encapsulation + interfaces reduce coupling

---

## 1️⃣6️⃣ Why No Multiple Inheritance in Java (Classes)?

To avoid:
- Diamond problem
- Method ambiguity

---

## 1️⃣7️⃣ Can this Be Used in Static Context?

❌ No

Because:
- this refers to current object
- Static has no object

---

## 1️⃣8️⃣ Why Java Has No Destructor?

Because:
- Garbage Collector manages memory
- Programmer cannot control destruction timing

---

## 🎯 FINAL INTERVIEW EDGE
If you answer these with confidence, interviewer knows:
> “This candidate understands Java internals, not just syntax.”






























