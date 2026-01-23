# 🗓️ DAY 1 – What is an Array? (FOUNDATION DAY)
# 🎯 Day 1 Goal

By the end of today, you must be able to:
- Explain what an array is (clearly, in interviews)
- Understand why arrays exist
- Know how arrays are stored in memory
- Write basic array code without thinking

---

### 1️⃣ What is an Array? (Simple but Deep)

👉 Definition (Interview-ready)

An array is a fixed-size, indexed, contiguous memory data structure used to store multiple values of the same data type.

Example (Real-life)

Think of a row of seats in a cinema 🎬
- Seats are continuous
- Each seat has a number (index)
- You can directly go to seat #5

Same logic applies to arrays.

---

### 2️⃣ Why Do We Need Arrays?
#### Without arrays:

int m1, m2, m3, m4, m5;

❌ Hard to manage

❌ No loops

❌ No scalability

#### With arrays:

int[] marks = {90, 85, 88, 92, 76};

✅ Easy

✅ Loop-friendly

✅ Organized

📌 Interview line:
> Arrays solve the problem of storing and processing multiple values efficiently using indexing.

---

### 3️⃣ Array Indexing (VERY IMPORTANT)
- Java arrays are 0-based indexed
- First element → index 0
- Last element → length - 1

int[] arr = {10, 20, 30, 40};

arr[0] → 10

arr[3] → 40

❌ arr[4] → ArrayIndexOutOfBoundsException

---

### 4️⃣ Array Memory Concept (Core Understanding)

Key Truths:
- Array elements are stored in contiguous memory
- Java arrays are created in Heap memory
- Array variable stores reference, not actual values

int[] arr = new int[3];

Memory picture:

arr  →  | 0 | 0 | 0 |
        heap memory

📌 Interview gold point:
> Because arrays use contiguous memory, accessing elements is O(1).

---

### 5️⃣ Declaring an Array (Correct Ways)
#### ✅ Declaration
int[] arr;

#### ✅ Allocation
arr = new int[5];

#### ✅ Declaration + Allocation
int[] arr = new int[5];

#### ✅ Initialization
int[] arr = {10, 20, 30};


#### ❌ Wrong:
int arr[5]; // ❌ C-style, not Java

----

### 6️⃣ Default Values in Array (INTERVIEW FAVORITE)

| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| double    | 0.0           |
| char      | '\u0000'      |
| boolean   | false         |
| Object    | null          |

int[] arr = new int[3];

System.out.println(arr[0]); // 0

📌 Interview Question

Q: Why default values exist?

A: To avoid garbage values and ensure memory safety.

---

### 7️⃣ Array Length vs Size (Trick Question)

int[] arr = {1, 2, 3};

System.out.println(arr.length); // 3

- length → property
- Not a method ❌ length()

📌 Interview Line
> Array length is fixed and decided at creation time.

---

### 8️⃣ First Complete Runnable Program (Must Practice)

public class ArrayIntro {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

✅ Compile

✅ Run

✅ Understand every line

---

### 9️⃣ Time Complexity (Beginner Awareness)

| Operation       | Time |
| --------------- | ---- |
| Access by index | O(1) |
| Traversal       | O(n) |
| Search (linear) | O(n) |


----

# ARRAY – DAY 1 COMPLETE ANSWERS (INTERVIEW LEVEL)


### 1️⃣ What is an Array?

Interview Answer:
> An array is a fixed-size, indexed data structure that stores multiple values of the same data type in contiguous memory locations, allowing fast access using index.

One-liner (if interviewer is strict):
> Array stores same-type elements in contiguous memory with index-based access.

---

### 2️⃣ Why does array index start from 0?

Answer (Technical reason):

Array indexing starts from 0 because the index represents the offset from the base memory address.

- arr[0] → base address + 0
- arr[1] → base address + (1 × size)

📌 Interview Gold Line:
> Index 0 directly maps to the base address, making memory access faster and simpler.

---

### 3️⃣ Where is array stored in Java?

Answer:

In Java:
- Arrays are objects
- Stored in Heap memory
- Array variable stores a reference to the heap memory

int[] arr = new int[3];

📌 Interview Line:
> Array elements are stored in heap memory, and the variable holds a reference to that memory.

---

### 4️⃣ What happens if index is invalid?

Answer:

Java throws a runtime exception:

ArrayIndexOutOfBoundsException

Example:

int[] arr = {10, 20};

System.out.println(arr[2]); // ❌

📌 Why?
> To protect memory safety and prevent illegal access.

---

### 5️⃣ Difference between Array and Variables?

| Feature     | Variable        | Array                |
| ----------- | --------------- | -------------------- |
| Stores      | Single value    | Multiple values      |
| Indexing    | ❌               | ✅                    |
| Loop usage  | ❌               | ✅                    |
| Scalability | ❌               | ✅                    |
| Memory      | Single location | Contiguous locations |

📌 Interview Line:
> Variables handle single data, arrays handle bulk data efficiently.

---

### 6️⃣ Why array size is fixed?

Answer:

Because arrays are stored in contiguous memory, Java must allocate all required memory at once.

📌 Interview Line:
> Resizing an array would require new memory allocation and copying, which is costly.

---


### 7️⃣ Coding Practice (Runnable & Clean)

Declare array of 5 integers

Print all values

Change one value

Print again

public class ArrayPractice {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // Print all values
        System.out.println("Original Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Change one value
        arr[2] = 99;

        // Print again
        System.out.println("\nAfter Modification:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

---

### 8️⃣ Why Arrays Can’t Grow?

Interview Answer:
> Arrays can’t grow because they use contiguous memory.
> 
> If size increases, a new memory block must be allocated and old data copied, which is inefficient.

📌 That’s why ArrayList exists.

---

### 9️⃣ Why Is Array Access Fast?

Interview Answer:
> Array access is fast because elements are stored in contiguous memory and can be accessed directly using index, giving O(1) time complexity.

Interview One-liner:
> Index-based direct access makes arrays extremely fast.

---


















