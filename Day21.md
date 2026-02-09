# 🟢 Java Revision – Day 21
# 🗓️ Array Day 7: Full Revision (Day 1–6) + Interview Q&A

---

# 🎯 Real Goal of Day 7 (Interview Mindset)

By the end of today, you should be able to:
- Dry-run any array problem without IDE
- Explain logic verbally (step-by-step, calm, confident)
- Write clean code on paper / whiteboard
- Answer follow-up questions without panic
- Interview success = clarity + confidence, not speed.

---

# 🔁 PART 1: DAY 1–6 REVISION (LOGIC RECALL)
### ✅ Day 1 – Array Fundamentals

You must be able to say:
Array = fixed-size, same-type elements, contiguous memory
Index starts from 0 (offset logic)
Stored in heap, reference in stack
Access time = O(1)

📌 Interview check:

> Why array size is fixed?
> 
> → Contiguous memory allocation.

---

### ✅ Day 2 – Memory & Reference

You must explain confidently:
- Stack vs Heap
- Reference copy vs object copy
- Modifying element affects original
- Reassigning reference does NOT

🔥 Golden line (must memorize):
> Java is pass-by-value, but for arrays the value passed is the reference.


---


### ✅ Day 3 – Traversal Techniques

You must know when to use:
- for → index-based logic
- for-each → read-only
- while → condition-based
- Reverse traversal → length - 1

📌 Interview trap:
- i <= arr.length ❌
- Correct → i < arr.length


---


### ✅ Day 4 – Basic Problems

Patterns you must recall instantly:
- Min / Max → compare & update
- Sum / Average → accumulation
- Linear search → compare + break
- Count even/odd → condition + counter

📌 Interview expectation:
> Single traversal, O(n) time, O(1) space.


---


### ✅ Day 5 – Insert & Delete

You must explain shift logic verbally:
- Insert → shift right to left
- Delete → shift left to right
- Maintain logical size
- Why costly → O(n) shifting

📌 Interview favorite:
> Why insertion at beginning is most expensive?


---


### ✅ Day 6 – Array vs ArrayList

Decision-based answers only:
- Array → fixed size, primitives, faster
- ArrayList → dynamic, flexible, cleaner APIs
- Internally ArrayList still uses array

📌 Industry line:
> Use array for performance, ArrayList for flexibility.


---


### PART 2: DRY-RUN THINKING (VERY IMPORTANT)
Example: Find Max

You should say aloud:
1. Assume first element as max
2. Traverse from index 1
3. Compare & update
4. End → max found

No IDE. No code. Just logic.

Example: Insert at Index

Say this verbally:
1. Check space
2. Shift elements right-to-left
3. Insert value
4. Increase size

Interviewers LOVE this explanation.

---

### PART 3: WRITE CODE WITHOUT IDE (MENTAL PRACTICE)

You should be able to write this from memory:

int max = arr[0];

for (int i = 1; i < arr.length; i++) {

    if (arr[i] > max) {
        max = arr[i];
    }
}


If you hesitate → revise again.

### PART 4: INTERVIEW Q&A (MOST ASKED)

Q1. Why array index starts from 0?

A: Index represents offset from base address.

Q2. Where is array stored in Java?

A: Heap memory; reference in stack.

Q3. Is array passed by value or reference?

A: Java is pass-by-value; array reference is passed by value.

Q4. Why insertion/deletion is costly in array?

A: Because elements must be shifted due to contiguous memory.

Q5. Array or ArrayList – which to use?

A: Array for fixed size & performance, ArrayList for dynamic size & flexibility.

Q6. Time complexity of traversal?

A: O(n)

Q7. Can array store primitives?

A: Yes. ArrayList cannot.

### PART 5: FINAL INTERVIEW MOCK (30 SECONDS)

If interviewer says:
> “Explain arrays in Java”

You should answer:
> Arrays in Java are fixed-size, indexed data structures stored in heap memory. They allow O(1) access using indexes. Arrays are efficient and support primitive types, but insertion and deletion are costly due to shifting. For dynamic sizing, ArrayList is preferred.

---

### ✅ DAY 7 COMPLETION CHECKLIST

✔ Can explain every concept verbally

✔ Can dry-run problems without IDE

✔ Can write basic code from memory

✔ Can answer “why”, not just “how”

## 🚀 WHAT THIS MEANS FOR YOU

If you can do Day 7 properly, you are already above average fresher level and moving towards solid 1–2 year experience mindset.

---

# Java Arrays – Interview Questions & Answers (Day 7)
## Topic: Full Revision (Day 1–6) + Conceptual Interview Round

---

## 🔹 Fundamentals (Day 1)

### Q1. What is an array in Java?
**Answer:**  
An array is a fixed-size, indexed data structure that stores elements of the same data type in contiguous memory locations.

---

### Q2. Why does array indexing start from 0?
**Answer:**  
Because the index represents the offset from the base memory address. Index `0` means zero offset.

---

### Q3. Where are arrays stored in Java?
**Answer:**  
Arrays are stored in heap memory, and the array variable holds a reference stored in stack memory.

---

### Q4. Why is array size fixed?
**Answer:**  
Because arrays use contiguous memory allocation, and resizing would require allocating a new block and copying elements.

---

## 🔹 Memory & Reference (Day 2)

### Q5. What is the difference between stack and heap memory?
**Answer:**  
Stack stores local variables and method calls, while heap stores objects and arrays.

---

### Q6. What happens when you assign one array to another?
```java
int[] b = a;
Answer:
Only the reference is copied. Both variables point to the same array in heap memory.

Q7. Is array passed by value or reference in Java?
Answer:
Java is always pass-by-value. For arrays, the value passed is the reference.

Q8. Why do changes inside a method affect the original array?
Answer:
Because both the caller and method reference the same array object in heap memory.

🔹 Traversal (Day 3)
Q9. What is array traversal?
Answer:
Array traversal means accessing each element one by one using loops.

Q10. Which loop is best for array traversal and why?
Answer:
The for loop is best because it provides index access and full control.

Q11. What is reverse traversal?
Answer:
Accessing array elements from the last index (length - 1) to index 0.

Q12. What is an off-by-one error?
Answer:
A boundary mistake where loop conditions cause missing elements or runtime exceptions.

🔹 Basic Problems (Day 4)
Q13. How do you find the maximum element in an array?
Answer:
Initialize max with the first element and update it while traversing the array.

Q14. How do you calculate the average of array elements?
Answer:
Calculate the sum first, then divide by the number of elements, using type casting to avoid integer division.

Q15. What is linear search?
Answer:
A technique where each element is compared sequentially until the target is found or traversal ends.

Q16. What is the time complexity of linear search?
Answer:
O(n)

🔹 Insert & Delete (Day 5)
Q17. Why is insertion in array costly?
Answer:
Because elements must be shifted to maintain order due to contiguous memory, leading to O(n) time complexity.

Q18. In which direction do you shift elements during insertion?
Answer:
Right to left, to avoid overwriting data.

Q19. In which direction do you shift elements during deletion?
Answer:
Left to right, to fill the gap created by deletion.

Q20. Do arrays shrink after deletion?
Answer:
No. Arrays do not shrink automatically; only logical size is reduced.

🔹 Array vs ArrayList (Day 6)
Q21. What is the difference between Array and ArrayList?
Answer:
Arrays are fixed-size and faster, while ArrayList is dynamic and more flexible.

Q22. Can ArrayList store primitive types?
Answer:
No. ArrayList stores objects only; primitives are stored using wrapper classes.

Q23. Which is better for performance and why?
Answer:
Arrays are better for performance because they avoid boxing/unboxing and extra memory overhead.

Q24. When should you use ArrayList instead of array?
Answer:
When the size is dynamic, frequent insertions/deletions are required, and cleaner APIs are preferred.

🔹 Mixed Concept Questions (Interview Favorites)
Q25. Can you access array elements in O(1) time?
Answer:
Yes. Arrays support direct index-based access.

Q26. Why are arrays suitable for DSA problems?
Answer:
Because they are simple, fast, and allow direct control over indexing and memory.

Q27. What is the time complexity of array traversal?
Answer:
O(n)

Q28. Can an array store different data types?
Answer:
No. Arrays store elements of the same data type.

Q29. What happens if you access an invalid index?
Answer:
Java throws ArrayIndexOutOfBoundsException.

Q30. Give a 1-line summary of arrays in Java.
Answer:
Arrays are fixed-size, heap-allocated data structures that provide fast indexed access but costly updates.


Q31. In Java, arrays are stored in heap memory.

If that’s true, why is array access still O(1)? Explain clearly.

A. Array access is O(1) because elements are stored contiguously and their memory address can be calculated directly using the index.



Q32. In Java, when you pass an array to a method and modify its elements inside the method, the changes are reflected outside the method.

Why does this happen?

Is Java pass-by-value or pass-by-reference? Explain clearly.


Answer :

In Java, everything is pass-by-value.

When an array is passed to a method, the value being passed is the reference to the array, not the actual array elements.

Both the caller and the method receive references pointing to the same array object in heap memory.

So, when we modify the elements of the array inside the method, the changes are reflected outside because both references point to the same object.

However, if we reassign the array reference inside the method, it does not affect the original array.


Q. Suppose you have an array and you want to insert an element at index 0.

Explain step by step how you would do it, and also explain

why insertion at the beginning of an array is the most costly operation.

A.

To insert an element at the beginning of an array, first I check whether there is available space in the array.

Since arrays are fixed-size and stored in contiguous memory, I need to shift all existing elements one position to the right, starting from the last index up to index 0.

This shifting must be done from right to left to avoid overwriting elements.

After shifting, I place the new element at index 0 and update the logical size of the array.


Q. What is the difference between array traversal and array searching?

Also explain the time complexity of both.

A. 

Array traversal means visiting every element of the array one by one, usually from index 0 to length - 1, to perform some operation like printing, summing, or counting.

Array searching means checking whether a specific element exists in the array. Searching may stop early if the element is found, but it still uses traversal internally.

The time complexity of traversal is always O(n) because every element is visited.

The time complexity of linear search is O(n) in the worst case, and O(1) in the best case when the element is found at the first index.



Q. You are given an unsorted array.

The interviewer asks:

“How will you find the minimum and maximum element in the array?”

Explain:

The logic

The number of traversals

The time and space complexity

A:

To find the minimum and maximum element in an unsorted array,

I first assume the first element of the array as both min and max.

Then I traverse the array from the second element onward.

For each element:

If it is smaller than min, I update min

If it is greater than max, I update max

This way, both minimum and maximum can be found in a single traversal.


⏱ Time Complexity

Since each element is visited once, the time complexity is O(n).

📦 Space Complexity

Only two extra variables are used, so the space complexity is O(1).


Q. What is the difference between Array and ArrayList in Java?

The interviewer then asks a follow-up:

“If both provide O(1) access, why would you ever choose an array over an ArrayList?”


A:

Arrays in Java are fixed in size, while ArrayList is dynamic and can grow or shrink automatically.

Both provide O(1) access, but I would choose an array when the size is known in advance and performance or memory efficiency is critical.

Arrays can store primitive types directly, avoid boxing and unboxing, and have less memory overhead compared to ArrayList.

ArrayList, on the other hand, is better suited when the size is dynamic and flexibility or cleaner APIs are required.



Q: You are given an array and asked to delete an element at a given index.

Explain:

How you will do it step by step

Why deletion in an array is costly

Time complexity


A:

To delete an element at a given index in an array,

I first identify the index to be removed.

Since arrays are stored in contiguous memory, I shift all elements to the left, starting from the next index, to fill the gap created by deletion.

After shifting, I reduce the logical size of the array by one.

Deletion in an array is costly because multiple elements may need to be shifted to maintain order.

The time complexity of deletion is O(n), and the space complexity is O(1).
























