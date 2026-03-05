# 🟢 Java Revision – Day 26
# 📅 Array Day 12 – Prefix Sum Technique

Topics we cover:
1. Prefix Sum Concept
2. Building Prefix Sum Array
3. Range Sum Queries
4. Optimization Thinking

---

### 1️⃣ Prefix Sum Concept
#### 🧠 Problem

Suppose we have:

arr = [2,4,1,3,5]

We want to answer queries like:

Sum from index 1 to 3

Sum from index 0 to 4

Sum from index 2 to 4

#### Normal Approach

Every query:

for(i = L → R)

   sum += arr[i]

Time:

O(n) per query

If there are 1000 queries, time becomes:

O(n × q)

Too slow.

---

### 2️⃣ Prefix Sum Idea (Key Insight)

Instead of calculating sums repeatedly, we precompute cumulative sums once.

Prefix sum means:

Sum of elements from index 0 → i

Example:

arr = [2,4,1,3,5]

Prefix array:

prefix[0] = 2

prefix[1] = 2+4 = 6

prefix[2] = 6+1 = 7

prefix[3] = 7+3 = 10

prefix[4] = 10+5 = 15

So:

prefix = [2,6,7,10,15]

---

### 3️⃣ Building Prefix Sum Array

#### Logic

prefix[0] = arr[0]

prefix[i] = prefix[i-1] + arr[i]

public class PrefixSumBuild {

    public static void main(String[] args) {

        int[] arr = {2,4,1,3,5};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int num : prefix)
            System.out.print(num + " ");
    }
}

Output:

2 6 7 10 15

---

### 4️⃣ Range Sum Query (Main Use Case)

Now we want:

Sum from L to R

Example:

L = 1

R = 3

Using prefix:

Sum(L,R) = prefix[R] - prefix[L-1]

Example:

prefix[3] = 10

prefix[0] = 2

Sum = 10 - 2 = 8

Check:

4 + 1 + 3 = 8

Correct.

---

### 5️⃣ Important Edge Case

If:

L = 0

Then:

Sum = prefix[R]

Because there is no prefix[-1].

---

### 6️⃣ Java Code – Range Sum Query

public class RangeSumQuery {

    public static void main(String[] args) {

        int[] arr = {2,4,1,3,5};

        int n = arr.length;
        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n; i++)
            prefix[i] = prefix[i-1] + arr[i];

        int L = 1;
        int R = 3;

        int sum;

        if(L == 0)
            sum = prefix[R];
        else
            sum = prefix[R] - prefix[L-1];

        System.out.println(sum);
    }
}

---

### 7️⃣ Optimization Thinking (Important 🔥)

Without prefix sum:

Each query = O(n)

Total = O(n × q)

With prefix sum:

Build prefix = O(n)

Each query = O(1)

Total = O(n + q)

Huge improvement.

---

### 8️⃣ Visualization (Very Important)

arr:    [2, 4, 1, 3, 5]

prefix: [2, 6, 7,10,15]
           ↑        ↑
        L-1 index   R index

Range sum:

prefix[R] - prefix[L-1]

---

### 9️⃣ Where Prefix Sum Is Used (Interview Level)

Prefix sum appears in:
- Subarray sum problems
- Range queries
- Maximum subarray variations
- Difference array technique
- Sliding window optimizations
- Matrix prefix sums (2D problems)

---

🔟 Common Interview Questions

Using prefix sum:
- Find sum of multiple ranges
- Count subarrays with given sum
- Find equilibrium index
- Maximum subarray sum (variation)

#### 🧠 Expert Summary

Prefix sum = precompute cumulative sums to answer queries instantly.

Trade-off:

Extra space → faster queries

---

# Java Arrays – Interview Questions & Answers (Day 12)
## Topic: Prefix Sum Technique, Range Sum Queries, Optimization Thinking

---

## 🔹 Prefix Sum Basics

### Q1. What is a prefix sum?
**Answer:**  
A prefix sum is the cumulative sum of elements from index `0` to index `i` in an array.

Example:

arr = [2,4,1,3,5]
prefix = [2,6,7,10,15]


---

### Q2. Why is prefix sum used?
**Answer:**  
Prefix sum is used to optimize repeated range sum queries by precomputing cumulative sums, allowing queries to be answered in constant time.

---

### Q3. How do you build a prefix sum array?
**Answer:**  
Initialize:

prefix[0] = arr[0]

Then:

prefix[i] = prefix[i-1] + arr[i]


---

### Q4. What is the time complexity of building a prefix sum array?
**Answer:**  
O(n), since each element is processed once.

---

### Q5. What is the space complexity of prefix sum?
**Answer:**  
O(n), because an additional array is used to store cumulative sums.

---

## 🔹 Range Sum Queries

### Q6. How do you find the sum of elements between indices L and R using prefix sum?
**Answer:**  
If `L > 0`:

sum = prefix[R] - prefix[L-1]


If `L = 0`:

sum = prefix[R]


---

### Q7. Why does prefix[R] - prefix[L-1] work?
**Answer:**  
Because `prefix[R]` contains the sum from `0 → R`, and subtracting `prefix[L-1]` removes the sum from `0 → L-1`.

---

### Q8. What is the time complexity of answering a range sum query using prefix sum?
**Answer:**  
O(1), since it requires only one subtraction operation.

---

### Q9. What is the total time complexity if there are Q range queries?
**Answer:**  

O(n + Q)

Where:
- O(n) for building prefix array
- O(1) per query

---

## 🔹 Optimization Thinking

### Q10. What problem does prefix sum solve compared to naive approach?
**Answer:**  
The naive approach computes each range sum in O(n), while prefix sum reduces it to O(1).

---

### Q11. What is the naive time complexity for Q range queries?
**Answer:**  

O(n × Q)


---

### Q12. When is prefix sum most useful?
**Answer:**  
When multiple range sum queries need to be answered efficiently.

---

### Q13. What is the trade-off of prefix sum optimization?
**Answer:**  
It uses extra space to reduce time complexity.

---

## 🔹 Advanced Concept Questions

### Q14. Can prefix sum work with negative numbers?
**Answer:**  
Yes, prefix sum works with both positive and negative numbers.

---

### Q15. Can prefix sums be extended to 2D arrays?
**Answer:**  
Yes. 2D prefix sums are used for fast range queries in matrices.

---

### Q16. What common problems use prefix sums?
**Answer:**  
- Subarray sum problems  
- Range sum queries  
- Equilibrium index problems  
- Maximum subarray variations  
- Difference arrays

---

### Q17. What is an equilibrium index?
**Answer:**  
An index where the sum of elements on the left equals the sum of elements on the right.

---

### Q18. What is a difference array?
**Answer:**  
A technique derived from prefix sums used to efficiently perform range updates.

---

## 🔹 Interview Insight

### Q19. Why do interviewers like prefix sum problems?
**Answer:**  
Because they test optimization thinking, understanding of cumulative computation, and ability to reduce time complexity.

---

### Q20. Give a one-line summary of prefix sum technique.
**Answer:**  
Prefix sum precomputes cumulative sums to answer range queries in constant time instead of recomputing sums repeatedly.

---




















