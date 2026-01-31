# 🟢 Array Revision – Day 18
# 🗓️ Day 4: Basic Array Problems (Expert Level)

---

## 🎯 Why Day 4 Is Extremely Important

Every advanced problem (sliding window, subarray, prefix sum) is built on:
- Traversal
- Comparison
- Condition-based counting
> Interviewers often start with these to test thinking clarity.

---

### 1️⃣ Min / Max in Array (MOST ASKED)
❓ Problem

Find smallest and largest element in an array.

#### Expert Thinking Process
- Assume first element as answer
- Compare with rest
- Update when condition matches

📌 Why not start with 0?

Because array can have negative values.

#### ✅ Correct Logic

int min = arr[0];

int max = arr[0];

for (int i = 1; i < arr.length; i++) {

    if (arr[i] < min) min = arr[i];
    if (arr[i] > max) max = arr[i];
}

⏱ Time: O(n)

📦 Space: O(1)

📌 Interview line
> Single traversal is enough to find both min and max.


---


### 2️⃣ Sum of Elements (BASE PATTERN)
❓ Problem

Find sum of all elements.

🧠 Thinking
- Initialize sum = 0
- Accumulate during traversal

int sum = 0;

for (int i = 0; i < arr.length; i++) {

    sum += arr[i];
}


📌 Used in:
- Average
- Prefix sum
- Sliding window

---

### 3️⃣ Average of Elements (FOLLOW-UP QUESTION)
❓ Problem

Find average.

#### Expert Insight
- Average = sum / count
- Watch for integer division

double avg = (double) sum / arr.length;


📌 Interview trap

int avg = sum / arr.length; // ❌ loses decimal

---

### 4️⃣ Search Element (Linear Search)
❓ Problem

Check if an element exists.

#### Thinking
- Traverse
- Compare each element
- Stop early if found

boolean found = false;

for (int i = 0; i < arr.length; i++) {

    if (arr[i] == key) {
        found = true;
        break;
    }
}

⏱ Time: O(n)

📦 Space: O(1)

📌 Interview line
> Linear search works on both sorted and unsorted arrays.

---

### 5️⃣ Linear Search vs Binary Search (INTERVIEW CLARITY)

| Search | Array Type  | Time     |
| ------ | ----------- | -------- |
| Linear | Any         | O(n)     |
| Binary | Sorted only | O(log n) |

📌 Binary search is not applicable here yet.


---

### 6️⃣ Count Even / Odd Numbers (CONDITION PATTERN)
❓ Problem

Count even and odd elements.

### Thinking
- Use % 2
- Maintain two counters

int even = 0, odd = 0;

for (int i = 0; i < arr.length; i++) {

    if (arr[i] % 2 == 0) even++;
    else odd++;
}

📌 This logic scales to:
- Count positives / negatives
- Count primes
- Count duplicates (later)

---

### 7️⃣ Find Largest & Smallest (INTERVIEW FAVORITE)

This is same as min/max, but interviewer checks explanation.

📌 Correct Explanation
> Start with first element to avoid wrong assumptions.

---

### 8️⃣ Common Interview Traps (VERY IMPORTANT)
#### ❌ Starting with 0

int max = 0; // ❌ wrong for all-negative arrays

#### ❌ Multiple loops
// unnecessary extra traversal

#### ❌ Not handling edge cases
- Empty array
- Single element array

---

### 9️⃣ Edge Case Handling (Pro-Level)

if (arr.length == 0) {

    System.out.println("Array is empty");
    return;
}

📌 Mentioning this in interview gives bonus points.

---

### 🔥 Final Interview Explanation (30 seconds)

> To solve basic array problems, we traverse the array once and use variables to track min, max, sum, or counts. We always initialize from the first element to handle negative values. All these operations take O(n) time and O(1) space.

---

### ✅ Day 4 Mastery Checklist
✔ Min / Max logic clear

✔ Sum / Average understood

✔ Linear search mastered

✔ Condition-based counting confident


---

# Java Arrays – Interview Questions & Answers (Day 4)
## Topic: Basic Array Problems (Min, Max, Sum, Search)

---

### Q1. How do you find the minimum and maximum element in an array?
**Answer:**  
Initialize both `min` and `max` with the first element of the array, then traverse the array once and update them based on comparisons.

**Why first element?**  
Because the array may contain negative values, and starting with `0` can give wrong results.

---

### Q2. What is the time and space complexity of finding min and max?
**Answer:**  
- Time Complexity: **O(n)**  
- Space Complexity: **O(1)**  
Only one traversal and constant extra space are used.

---

### Q3. Can you find both min and max in a single traversal?
**Answer:**  
Yes. By comparing each element with both `min` and `max` during the same loop, both can be found in one traversal.

---

### Q4. How do you calculate the sum of elements in an array?
**Answer:**  
Initialize a variable `sum` to `0`, traverse the array, and add each element to `sum`.

---

### Q5. How do you calculate the average of array elements?
**Answer:**  
First calculate the sum of elements, then divide it by the number of elements (`arr.length`).  
Type casting to `double` is required to avoid integer division.

---

### Q6. What is linear search?
**Answer:**  
Linear search is a technique where each element of the array is checked one by one until the target element is found or the array ends.

---

### Q7. What is the time complexity of linear search?
**Answer:**  
- Best Case: **O(1)** (element found at first index)  
- Worst Case: **O(n)** (element not present or at last index)

---

### Q8. When should linear search be used?
**Answer:**  
Linear search should be used when the array is **unsorted** or when the array size is small.

---

### Q9. How do you count even and odd elements in an array?
**Answer:**  
Traverse the array and use the modulo operator (`% 2`).  
If `arr[i] % 2 == 0`, it is even; otherwise, it is odd.

---

### Q10. How do you find the largest element in an array?
**Answer:**  
Initialize the largest value with the first element and update it whenever a larger element is found during traversal.

---

### Q11. What are common mistakes while solving basic array problems?
**Answer:**  
- Initializing min/max with `0` instead of the first element  
- Using multiple loops unnecessarily  
- Incorrect loop boundaries (`i <= arr.length`)  
- Ignoring edge cases like empty arrays

---

### Q12. How do you handle an empty array safely?
**Answer:**  
Check if `arr.length == 0` before performing operations and handle it accordingly to avoid runtime errors.

---

### Q13. Why is a single traversal preferred in interviews?
**Answer:**  
A single traversal improves efficiency, reduces time complexity, and shows optimized thinking.

---

### Q14. What is the difference between searching and counting in arrays?
**Answer:**  
- Searching checks whether an element exists.  
- Counting calculates how many elements satisfy a condition.

---

### Q15. Give a one-line interview summary for basic array problems.
**Answer:**  
Basic array problems are solved using single-pass traversal with comparison and condition-based logic, achieving O(n) time and O(1) space.

---




