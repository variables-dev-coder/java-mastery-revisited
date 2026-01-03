# 🚀 Day 02 – Core Java Fundamentals (Expert Mode)
---

## 1️⃣ Methods & Method Overloading

🔹 What is a Method (Beyond Basics)

A method is:
- A unit of behavior
- A stack frame creator
- A contract (name + parameters + return type)

Every method call:
- Pushes a frame to stack
- Passes parameters by value
- Returns control to caller

---

🔹 Method Overloading (Compile-Time Polymorphism)

Definition
Same method name, different parameter list.

✔️ Allowed:
- Parameter count
- Parameter type
- Parameter order

❌ Not allowed:
- Only return type change

---

🔹 Overloading Resolution (Expert Rule)

Java decides overloaded method at compile time, based on:
1. Exact match
2. Widening
3. Autoboxing
4. Varargs (last)

Coding example : 


🧠 Interview line:
> Overloading is resolved at compile time, not runtime.

---

## 2️⃣ Memory Basics – Stack vs Heap (VERY IMPORTANT)

🔹 Stack Memory
- Stores method calls
- Stores local variables
- Thread-specific
- Fast

🔹 Heap Memory
- Stores objects
- Shared across threads
- Managed by GC
- Slower than stack

---

🔹 Visual Model

Stack → reference variables

Heap  → actual objects

🔹 Practice (Understand, don’t just run)

code : 

---

## 3️⃣ Arrays (1D, 2D, Dynamic)

🔹 1D Array

int[] arr = {10, 20, 30};

- Fixed size
- Zero-based
- Stored in heap

🔹 2D Array (Array of arrays)

int[][] matrix = {

    {1, 2},
    
    {3, 4}
    
};

Rows can have different lengths.


🔹 Dynamic Array Creation

int[] nums = new int[5];

nums[0] = 100;

🔹 Practice

code : 

🧠 Interview line:
> Java supports jagged arrays, not true matrices.

---

## 4️⃣ Strings (String vs StringBuilder vs StringBuffer)

🔹 String
- Immutable
- Stored in String Pool
- Thread-safe

String s = "Java";

s.concat("World"); // creates new object

🔹 StringBuilder
- Mutable
- Not thread-safe
- Fast

🔹 StringBuffer
- Mutable
- Thread-safe
- Slower

🔹 Practice

code :

🧠 Interview rule:
> Use StringBuilder inside loops.

---

## 5️⃣ Wrapper Classes

🔹 Why Wrapper Classes Exist
- Convert primitives → objects
- Required for collections
- Enable utility methods

🔹 Autoboxing & Unboxing

Integer a = 10; // autoboxing

int b = a;      // unboxing

🔹 Practice

class WrapperDemo {

    public static void main(String[] args) {

        Integer x = Integer.valueOf("100");
        
        int y = x + 20;

        System.out.println(y);
    }
    
}


🧠 Interview trap:
> Wrapper objects can be null → primitives cannot.

---

## 6️⃣ Command Line Arguments

🔹 What They Are

Inputs passed at JVM startup.

java Test 10 20

🔹 Practice

class CommandLineDemo {

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        
        int b = Integer.parseInt(args[1]);

        System.out.println("Sum = " + (a + b));
    }
}


---

## 7️⃣ Packages & Access Modifiers

🔹 Packages
- Logical grouping
- Prevent naming conflict
- Control access
- package com.munna.core.day02;

🔹 Access Modifiers (VERY IMPORTANT)

| Modifier  | Same Class | Same Package | Subclass | Other |
| --------- | ---------- | ------------ | -------- | ----- |
| private   | ✔️         | ❌          | ❌       | ❌   |
| default   | ✔️         | ✔️          | ❌       | ❌   |
| protected | ✔️         | ✔️          | ✔️       | ❌   |
| public    | ✔️         | ✔️          | ✔️       | ✔️   |


🔹 Practice

Create two packages and test access.

🧠 Interview line:
> protected is package + inheritance based access.

---

## 8️⃣ Java Coding Conventions & Best Practices

🔹 Naming
- Class → PascalCase
- Method → camelCase
- Constants → UPPER_SNAKE_CASE

🔹 Clean Code Rules
- One method = one job
- Avoid deep nesting
- Prefer composition
- Fail fast (validate early)

🔹 Example (Clean vs Bad)

❌ Bad

void doStuff(int x) {

    if(x>0){
    
        if(x<100){
        
            System.out.println(x);
            
        }
        
    }
    
}


✅ Good

void printValidNumber(int number) {

    if (number <= 0 || number >= 100) return;
    
    System.out.println(number);
    
}

---

# 🔥 LAST: TOP 10 BEST INTERVIEW QUESTIONS (Day-02)

## 1️⃣ Why method overloading is compile-time polymorphism?
- Because method resolution happens before runtime.

## 2️⃣ Where are local variables stored?
- Stack memory.

## 3️⃣ Why Java arrays are objects?
- They carry metadata & support bounds checking.

## 4️⃣ Why String is immutable?
- Security, thread-safety, caching, hash consistency.

## 5️⃣ Difference between StringBuilder & StringBuffer?
- Thread safety vs performance.

## 6️⃣ Why wrapper classes exist?
- Collections, object behavior, utility methods.

## 7️⃣ What happens if args[] is empty?
- ArrayIndexOutOfBoundsException

## 8️⃣ Why protected is tricky?
- Accessible only via inheritance across packages.

## 9️⃣ Why Integer.parseInt() fails sometimes?
- NumberFormatException for non-numeric input.

## 🔟 Why stack is faster than heap?
- Simple LIFO allocation, no GC involvement.



















