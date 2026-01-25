# 🟢 Java Revision – Day 16
# 🗓️ Day 2: Array Memory & Internals (VERY IMPORTANT)

---

## 🎯 Day 2 Target (What you MUST master)

By the end of this:
- You clearly understand Stack vs Heap
- You can explain array reference confidently
- You know default values (and why)
- You can predict output when:
    - array is passed to method
    - array is returned from method
- You can answer the trick interview question:
  
   - 👉 Is array passed by value or reference?

 ---

### 1️⃣ Stack vs Heap

#### 🔹 Stack Memory
- Stores local variables
- Stores method calls
- Fast
- Automatically cleared

#### 🔹 Heap Memory
- Stores objects
- Stores arrays
- Shared across methods
- Cleared by Garbage Collector

#### Example

int x = 10;

int[] arr = new int[3];

#### What goes where?

Stack                    Heap

-----                    ----

x = 10                   [0, 0, 0]

arr ───────────────▶     array object

📌 Interview line
> In Java, array variables are stored in stack, but array objects are stored in heap.

---

### 2️⃣ Array Reference (MOST IMPORTANT CONCEPT)

int[] a = {10, 20, 30};

int[] b = a;

Memory view:

Stack

a ─┐

   ├──▶ [10, 20, 30]  (Heap)
   
b ─┘

Now:

b[1] = 99;

System.out.println(a[1]);

✅ Output: 99

WHY?
- No new array created
- Only reference copied
- Both point to same heap memory

📌 Interview sentence
> Assigning one array to another copies the reference, not the data.

---

### 3️⃣ Default Values in Array (INTERVIEW FAVORITE)

int[] nums = new int[3];

System.out.println(nums[0]);

#### Why output is 0?

Because Java assigns default values.

| Type    | Default  |
| ------- | -------- |
| int     | 0        |
| double  | 0.0      |
| boolean | false    |
| char    | '\u0000' |
| Object  | null     |

📌 Why Java does this?
- Prevents garbage values
- Ensures memory safety

📌 Interview line
> Java initializes array elements with default values automatically.

---

### 4️⃣ Pass Array to Method (TRICKY PART 🔥)

public class Test {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        change(arr);
        System.out.println(arr[0]);
    }

    static void change(int[] a) {
        a[0] = 99;
    }
}

Output?

✅ 99

Explanation (Say this clearly):
- Array reference is passed
- Method modifies same heap object
- So original array changes

📌 Interview-ready line
> When an array is passed to a method, changes to elements affect the original array.

---

### 5️⃣ Is Java Pass-by-Value or Pass-by-Reference? (🔥 TRAP QUESTION)

#### ❌ Wrong answers
- “Java is pass by reference”
- “Arrays are passed by reference”

#### ✅ Correct Answer (MUST MEMORIZE)
> Java is always pass-by-value.
> 
> For arrays, the value passed is the reference.

📌 One-liner
> Java passes a copy of the reference, not the array itself.

This single line impresses interviewers.

---


### 6️⃣ Reassigning Array Inside Method (CONFUSION CLEAR)

static void change(int[] a) {

    a = new int[]{7, 8, 9};
}

Main:

int[] arr = {1, 2, 3};

change(arr);

System.out.println(arr[0]);

Output?

✅ 1

WHY?
- Reference a is changed locally
- Original reference arr remains same

📌 Golden rule

| Action         | Original affected? |
| -------------- | ------------------ |
| Modify element | ✅ Yes              |
| Reassign array | ❌ No               |

---

### 7️⃣ Return Array from Method

static int[] createArray() {

    int[] arr = {5, 10, 15};
    return arr;
}


Usage:

int[] nums = createArray();

System.out.println(nums[1]); // 10


📌 Interview point
> Returning array returns the reference to heap memory.

---

### 8️⃣ Practice: Observe Reference Behavior (MANDATORY)

#### Practice 1

int[] a = {1, 2, 3};

int[] b = a;

b[0] = 50;


👉 What is a[0]?

✅ 50

#### Practice 2

int[] a = {1, 2, 3};

modify(a);

static void modify(int[] x) {

    x = new int[]{9, 9, 9};
}


👉 What is a[0]?

✅ 1

---

### 9️⃣ Final Interview Answer (Say This Confidently)

Arrays in Java are objects stored in heap memory.
Variables store references on stack.
Java uses pass-by-value, but for arrays the value passed is the reference, so modifying elements affects the original array, while reassigning does not.

---

# Java Arrays – Interview Questions & Answers (Day 2)
## Topic: Array Memory & Internals

---

### Q1. Where are arrays stored in Java?
**Answer:**  
Arrays in Java are stored in **heap memory**. The array variable itself is stored on the **stack** and holds a reference to the array object in the heap.

---

### Q2. What is the difference between stack and heap memory?
**Answer:**  
- **Stack memory** stores local variables and method calls. It is fast and automatically managed.
- **Heap memory** stores objects and arrays. It is shared across methods and managed by the Garbage Collector.

---

### Q3. What is an array reference in Java?
**Answer:**  
An array reference is a variable that stores the **memory address** of the array object in heap memory. Multiple references can point to the same array.

---

### Q4. What are the default values of array elements in Java?
**Answer:**  
Java automatically assigns default values to array elements:
- `int` → `0`
- `double` → `0.0`
- `boolean` → `false`
- `char` → `'\u0000'`
- Object reference → `null`

This avoids garbage values and ensures memory safety.

---

### Q5. What happens when you assign one array to another?
```java
int[] a = {1, 2, 3};
int[] b = a;
Answer:
No new array is created. Only the reference is copied, so both variables point to the same array in heap memory.

---

Q6. What happens if you modify an array inside a method?
Answer:
If you modify the elements of the array inside a method, the changes are reflected in the original array because both references point to the same heap object.

---

Q7. What happens if you reassign an array inside a method?
Answer:
Reassigning the array reference inside a method does not affect the original array, because the reference change is local to that method.

---

Q8. Is Java pass-by-value or pass-by-reference?
Answer:
Java is always pass-by-value.
For arrays, the value passed is a copy of the reference, not the array itself.

---

Q9. Why do changes to array elements reflect outside the method?
Answer:
Because both the caller and the method refer to the same array object in heap memory via copied references.

---

Q10. How can you prevent modification of the original array?
Answer:
Create a copy of the array before modifying it, using:

Manual copying

clone() method

---

Q11. Can an array be returned from a method?
Answer:
Yes. When an array is returned from a method, the reference to the array object in heap memory is returned.

---

Q12. Why are arrays considered objects in Java?
Answer:
Because arrays are created in heap memory, have a length property, and are handled using references, just like other objects.

---

Q13. What is the key rule to remember about array references?
Answer:

Modifying array elements → affects original array

Reassigning array reference → does not affect original array

---

Q14. Why is understanding array memory important for interviews?
Answer:
Because many interview questions test output prediction and side effects caused by reference sharing, especially when arrays are passed to methods.

---

Q15. One-line interview summary about arrays and memory
Answer:
Arrays are heap-allocated objects in Java, accessed via stack-based references, and passed to methods using pass-by-value of the reference.

---

























 
