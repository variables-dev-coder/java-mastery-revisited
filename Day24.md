## 🟢 Java Revision – Day 24
## 📅 Array Day 10 – Searching Patterns (Expert Level)

We’ll cover:
1. Linear Search
2. Sentinel Search
3. Count Occurrences
4. Interview depth & traps

---

### 1️⃣ Linear Search (Foundation Pattern)
#### 🧠 What Is Linear Search?

Linear search means:
- Traverse the array
- Compare each element with target
- Stop when found

It works on:
- Sorted arrays
- Unsorted arrays

#### 🎯 Core Logic

for each element:

    if element == key → return index

#### ✅ Java Code

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50};
        int key = 30;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}

#### ⏱ Complexity
| Case    | Time |
| ------- | ---- |
| Best    | O(1) |
| Worst   | O(n) |
| Average | O(n) |


#### 🧠 Interview Insight

If interviewer asks:
> Why use linear search if binary search is faster?

Answer:
> Linear search works on unsorted arrays. Binary search requires sorted input.

---

### 2️⃣ Sentinel Search (Optimization of Linear Search) 🔥

This is rarely known by beginners.

#### 🧠 Problem with Linear Search

Every loop checks:

i < arr.length

That’s an extra comparison every iteration.

#### 🎯 Sentinel Idea

We:
1. Temporarily replace last element with key
2. Remove boundary check inside loop
3. Restore last element later

This removes one comparison per iteration.

#### ✅ Java Code

public class SentinelSearch {

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 50};
        int key = 30;

        int n = arr.length;
        int last = arr[n - 1];

        arr[n - 1] = key;

        int i = 0;
        while (arr[i] != key) {
            i++;
        }

        arr[n - 1] = last;

        if (i < n - 1 || last == key)
            System.out.println("Found at index " + i);
        else
            System.out.println("Not Found");
    }
}

#### 🔥 Why Sentinel Search Is Smart
- Removes boundary check
- Slightly faster in tight loops
- Used in system-level optimization

Time → O(n)

Space → O(1)

#### 🧠 Interview Line
> Sentinel search reduces one comparison per iteration by eliminating boundary checks.

---

### 3️⃣ Count Occurrences (Important Pattern)
#### 🧠 Problem

Count how many times a key appears.

Example:

[1,2,3,2,2,5]

key = 2

Output → 3

#### 🎯 Core Logic

Instead of stopping when found,

continue scanning and count.

#### ✅ Java Code

public class CountOccurrences {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 5};
        int key = 2;
        int count = 0;

        for (int num : arr) {
            if (num == key) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}

#### ⏱ Complexity

Time → O(n)

Space → O(1)

---

### 4️⃣ Advanced Insight – Searching in Sorted Array

If array is sorted:
- Linear search → O(n)
- Binary search → O(log n)

But counting occurrences in sorted array can be optimized using:
- First occurrence (binary search)
- Last occurrence (binary search)
- Count = last - first + 1

That’s interview-level optimization.

---

### 5️⃣ Comparison Summary

| Technique       | Sorted Required | Time     | Space | Level        |
| --------------- | --------------- | -------- | ----- | ------------ |
| Linear Search   | No              | O(n)     | O(1)  | Basic        |
| Sentinel Search | No              | O(n)     | O(1)  | Intermediate |
| Binary Search   | Yes             | O(log n) | O(1)  | Advanced     |

---


### 6️⃣ Common Interview Traps 🚨

❌ Returning wrong index

❌ Forgetting break

❌ Not handling element at last index

❌ Not restoring sentinel value

❌ Missing edge cases (empty array)

---

### 🧠 Final Expert Summary

Searching patterns test:
- Loop control
- Condition logic
- Early stopping
- Optimization awareness
- Sorted vs unsorted thinking

Linear search is simple.

Sentinel search shows deeper understanding.

Binary search shows algorithmic maturity.

---

### ✅ Day 10 Mastery Checklist

✔ Can explain best/worst case

✔ Understand sentinel optimization

✔ Can count occurrences

✔ Know when to use binary search


---


# Java Arrays – Interview Questions & Answers (Day 10)
## Topic: Searching Patterns (Linear, Sentinel, Count Occurrences)

---

## 🔹 Linear Search

### Q1. What is linear search?
**Answer:**  
Linear search is a technique where each element of the array is checked sequentially until the target element is found or the array ends.

---

### Q2. What is the time complexity of linear search?
**Answer:**  
- Best Case: O(1) (element found at first position)  
- Worst Case: O(n) (element at last position or not present)  
- Average Case: O(n)

---

### Q3. What is the space complexity of linear search?
**Answer:**  
O(1), because it uses only a constant amount of extra space.

---

### Q4. When should linear search be used?
**Answer:**  
Linear search should be used when:
- The array is unsorted  
- The dataset is small  
- Simplicity is preferred over optimization  

---

### Q5. Why is linear search inefficient for large datasets?
**Answer:**  
Because in the worst case it must check every element, resulting in O(n) time complexity.

---

## 🔹 Sentinel Search

### Q6. What is sentinel search?
**Answer:**  
Sentinel search is an optimized version of linear search where the last element is temporarily replaced with the target value to eliminate boundary checking inside the loop.

---

### Q7. Why is sentinel search considered an optimization?
**Answer:**  
Because it removes one comparison per loop iteration (the boundary check), slightly improving performance in tight loops.

---

### Q8. What is the time complexity of sentinel search?
**Answer:**  
O(n), same as linear search.

---

### Q9. What is an important step after performing sentinel search?
**Answer:**  
The original last element must be restored to maintain array integrity.

---

### Q10. When is sentinel search practically useful?
**Answer:**  
In low-level systems or performance-critical scenarios where reducing comparisons is beneficial.

---

## 🔹 Count Occurrences

### Q11. How do you count occurrences of a key in an unsorted array?
**Answer:**  
Traverse the entire array and increment a counter whenever the element matches the key.

---

### Q12. What is the time complexity of counting occurrences?
**Answer:**  
O(n), since every element must be checked.

---

### Q13. How can counting occurrences be optimized in a sorted array?
**Answer:**  
By using binary search to find the first and last occurrence, then computing:  
Count = lastIndex - firstIndex + 1  
This reduces time complexity to O(log n).

---

### Q14. What is the difference between searching and counting?
**Answer:**  
Searching determines whether an element exists (and possibly its index), while counting determines how many times it appears.

---

## 🔹 Conceptual & Interview Insight

### Q15. Why is binary search faster than linear search?
**Answer:**  
Because binary search divides the search space in half each iteration, resulting in O(log n) time complexity.

---

### Q16. Why can’t binary search be used on an unsorted array?
**Answer:**  
Because binary search relies on sorted order to eliminate half of the search space at each step.

---

### Q17. What are common mistakes in searching problems?
**Answer:**  
- Incorrect loop boundaries  
- Not handling empty arrays  
- Forgetting to break after finding element  
- Not restoring sentinel value  

---

### Q18. Is searching always O(n)?
**Answer:**  
No. Linear and sentinel search are O(n), but binary search on sorted arrays is O(log n).

---

### Q19. Give a one-line summary of searching patterns.
**Answer:**  
Searching patterns involve sequential or optimized comparisons to locate or count elements, with time complexity depending on array order and algorithm choice.

---

### Q20. How do interviewers evaluate searching problems?
**Answer:**  
They check:
- Boundary handling  
- Early stopping logic  
- Understanding of time complexity  
- Awareness of sorted vs unsorted optimizations  

---














