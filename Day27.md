# 🟢 Java Revision – Day 27
# 📅 Array Day 13 – Subarray Basics

Topics we cover:

1️⃣ What is a Subarray

2️⃣ All Possible Subarrays

3️⃣ Maximum Sum Subarray (Brute Force)

4️⃣ Pattern Thinking

---

### 1️⃣ What is a Subarray?

A subarray is a continuous part of an array.

Example:

arr = [1,2,3]

Possible subarrays:

[1]

[2]

[3]

[1,2]

[2,3]

[1,2,3]

Important rule:

✔ Elements must be contiguous

❌ Not Subarrays

[1,3]

Why?

Because 2 is skipped → not continuous.

---

### 2️⃣ Difference Between Subarray and Subsequence

| Type        | Continuous?  | Example |
| ----------- | ------------ | ------- |
| Subarray    | Yes          | [2,3]   |
| Subsequence | Not required | [1,3]   |

Interviews test this difference.

---

### 3️⃣ How Many Subarrays Exist?

Formula:

n(n+1)/2

Example:

n = 5

5(6)/2 = 15 subarrays

Why?

Because for every index we can start a subarray.

Visualization

arr = [1,2,3]

Start at index 0

[1]

[1,2]

[1,2,3]

Start at index 1

[2]

[2,3]

Start at index 2

[3]

Total = 6.

---

### 4️⃣ Print All Subarrays

To generate all subarrays we need two boundaries:

Start index

End index


public class AllSubarrays {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        for(int start = 0; start < arr.length; start++) {

            for(int end = start; end < arr.length; end++) {

                for(int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println();
            }
        }
    }
}

Time Complexity

O(n³)

Because:

Start loop → n

End loop → n

Printing loop → n

---

### 5️⃣ Maximum Sum Subarray (Brute Force)

This is a classic interview question.

Problem:

arr = [-2,1,-3,4,-1,2,1,-5,4]

Maximum sum subarray:

[4,-1,2,1]

Sum = 6

Brute Force Logic

1️⃣ Generate every subarray

2️⃣ Compute sum

3️⃣ Track maximum


public class MaxSubarrayBrute {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;

        for(int start = 0; start < arr.length; start++) {

            for(int end = start; end < arr.length; end++) {

                int sum = 0;

                for(int i = start; i <= end; i++) {
                    sum += arr[i];
                }

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}

Complexity

O(n³)

Very slow for large arrays.


---

### 6️⃣ Improved Brute Force

Instead of recalculating sum each time:

sum += arr[end]

Optimized Code

public class MaxSubarrayBetter {

    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = Integer.MIN_VALUE;

        for(int start = 0; start < arr.length; start++) {

            int sum = 0;

            for(int end = start; end < arr.length; end++) {

                sum += arr[end];

                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}

Complexity

O(n²)

Better than O(n³).

---

### 7️⃣ Why This Topic Is Important

Subarray logic is used in:
- Maximum subarray (Kadane’s Algorithm)
- Subarray sum equals K
- Sliding window problems
- Prefix sum problems
- Dynamic programming

Almost every array interview question uses subarrays.


---

### 8️⃣ Expert Mental Model

Think like this:

Start index → choose start

End index → expand subarray

This is the two boundary pattern.

---

### 🧠 Expert Summary

Subarray problems usually follow this thinking:

1️⃣ Fix start

2️⃣ Expand end

3️⃣ Track something (sum, max, length)

This is the foundation of many optimized algorithms.

---

# Java Arrays – Interview Questions & Answers (Day 13)
## Topic: Subarray Basics, All Subarrays, Maximum Sum Subarray (Brute Force)

---

## 🔹 Subarray Fundamentals

### Q1. What is a subarray?
**Answer:**  
A subarray is a continuous sequence of elements within an array.

Example:

arr = [1,2,3]
Subarrays = [1], [2], [3], [1,2], [2,3], [1,2,3]


---

### Q2. What is the difference between a subarray and a subsequence?

| Feature | Subarray | Subsequence |
|--------|---------|------------|
Continuity | Must be contiguous | Not required |
Example | [2,3] | [1,3] |

---

### Q3. How many subarrays exist in an array of size n?
**Answer:**  
The number of subarrays is:


n(n + 1) / 2


Example:

n = 5
5 × 6 / 2 = 15 subarrays


---

### Q4. Why does the formula n(n+1)/2 work?
**Answer:**  
Because each index can act as a starting point, and from that point the subarray can extend up to the end of the array.

---

## 🔹 Generating All Subarrays

### Q5. How do you generate all subarrays of an array?
**Answer:**  
Use two nested loops:
1. First loop selects the starting index.
2. Second loop selects the ending index.

---

### Q6. What is the time complexity of printing all subarrays?
**Answer:**  

O(n³)


Reason:
- Start index loop → O(n)
- End index loop → O(n)
- Printing elements → O(n)

---

### Q7. Can generating subarrays be optimized?
**Answer:**  
The number of subarrays itself is O(n²), so generating them requires at least O(n²) time. However, printing elements increases complexity to O(n³).

---

## 🔹 Maximum Sum Subarray (Brute Force)

### Q8. What is the maximum subarray sum problem?
**Answer:**  
The problem asks for the contiguous subarray with the largest possible sum.

Example:

arr = [-2,1,-3,4,-1,2,1,-5,4]

Maximum subarray = [4,-1,2,1]
Sum = 6


---

### Q9. What is the brute-force approach to solve the maximum subarray problem?
**Answer:**  
1. Generate all possible subarrays.
2. Calculate their sums.
3. Track the maximum sum.

---

### Q10. What is the time complexity of the brute-force maximum subarray solution?
**Answer:**  

O(n³)


Because:
- Start index loop → O(n)
- End index loop → O(n)
- Sum calculation → O(n)

---

### Q11. How can the brute-force method be improved?
**Answer:**  
Instead of recomputing the sum each time, accumulate it incrementally:


sum += arr[end]


This reduces complexity to:


O(n²)


---

### Q12. Why is the O(n²) approach still inefficient for large arrays?
**Answer:**  
Because the number of subarrays grows quadratically, making it slow for very large datasets.

---

## 🔹 Advanced Interview Insight

### Q13. What is the optimal algorithm for the maximum subarray problem?
**Answer:**  
Kadane's Algorithm, which solves the problem in O(n) time.

---

### Q14. Why are subarray problems common in interviews?
**Answer:**  
Because they test:
- Understanding of array traversal
- Boundary control
- Optimization thinking
- Ability to reduce time complexity

---

### Q15. What common problems are based on subarrays?
**Answer:**  
- Maximum subarray sum
- Subarray sum equals K
- Longest subarray with given sum
- Sliding window problems
- Prefix sum problems

---

### Q16. What is the key pattern in most subarray problems?
**Answer:**  
Choose a starting index and expand the ending index while maintaining some condition (sum, length, maximum value).

---

### Q17. Why must subarrays always be contiguous?
**Answer:**  
Because by definition a subarray represents a continuous portion of an array.

---

### Q18. Can negative numbers affect subarray algorithms?
**Answer:**  
Yes. Negative numbers can reduce sums, which is why algorithms like Kadane's Algorithm are needed.

---

### Q19. What are common mistakes in subarray problems?
**Answer:**  
- Confusing subarray with subsequence
- Incorrect loop boundaries
- Resetting sums incorrectly
- Not considering negative numbers

---

### Q20. Give a one-line summary of subarray problems.
**Answer:**  
Subarray problems focus on analyzing continuous segments of an array to optimize calculations involving sums, lengths, or other conditions.

---





