# 🟢 Java Revision – Day 25
# 📅 Array Day 11 – Frequency Problems (Very Important 🔥)

We’ll cover:
1. What is Frequency Pattern
2. Frequency Array
3. Hashing using Array
4. Duplicate Detection
5. Optimization Thinking
6. Interview Traps

---

### 1️⃣ What Are Frequency Problems?

Frequency means:
> How many times each element appears.

Example:

Input:  [1,2,2,3,1,4,2]

Output:

1 → 2 times

2 → 3 times

3 → 1 time

4 → 1 time

### 🧠 Why Frequency Problems Are Powerful

Because they convert:

O(n²) comparison problems

into

O(n) optimized solutions.

That’s the real benefit.

---

### 2️⃣ Frequency Array (Basic but Important)
### 🧠 When Can We Use Frequency Array?

Only when:
- Values are limited
- Values are non-negative
- Range is known

Example:
- Marks (0–100)
- Ages (0–120)
- Characters (a–z)

#### 🎯 Idea

If maximum value is 100:

Create:

int[] freq = new int[101];

Then:

freq[arr[i]]++

#### ✅ Code

public class FrequencyArray {

    public static void main(String[] args) {

        int[] arr = {1,2,2,3,1,4,2};

        int max = 4;
        int[] freq = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }
    }
}

⏱ Time & Space

Time → O(n)

Space → O(k) (k = range size)


---


### 3️⃣ Hashing Using Array (Optimized Thinking)

Frequency array is basically:
> Hashing using direct index mapping

We use array index as hash.

Example:

Value 5 → stored at freq[5]

That is direct hashing.

#### 🔥 Why This Is Faster

Instead of:

For each element:

   compare with every other element

We do:

Increment count at index

Constant time update.


---


### 4️⃣ Duplicate Detection (Important Interview Topic 🔥)
#### 🧠 Problem

Check if array contains duplicates.

Example:

[1,2,3,4] → No

[1,2,3,2] → Yes

❌ Naive Approach

Nested loops → O(n²)

#### ✅ Frequency-Based Approach

If freq[value] becomes > 1

→ duplicate found

#### ✅ Code

public class DuplicateDetection {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2};

        int max = 4;
        int[] freq = new int[max + 1];

        boolean duplicate = false;

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;

            if (freq[arr[i]] > 1) {
                duplicate = true;
                break;
            }
        }

        System.out.println(duplicate ? "Duplicate Found" : "No Duplicate");
    }
}

Time → O(n)

---


### 5️⃣ What If Values Are Large? (Important 🔥)

If array contains:

[1000000, 999999, 500000]

We cannot create:

int[1000001]

That wastes memory.

So we use:

HashMap<Integer, Integer>

That’s dynamic hashing.

---

### 6️⃣ Real Interview Questions Based on Frequency
- Find first non-repeating element
- Find element with highest frequency
- Find all duplicates
- Check if two arrays are anagrams
- Find missing number
- Find majority element

Frequency logic is base of all these.

---

### 7️⃣ Advanced Thinking – First Non-Repeating Element

Algorithm:
1. Build frequency
2. Traverse array again
3. First element with freq = 1 → answer

---

### 8️⃣ Common Interview Traps 🚨

❌ Not handling negative numbers

❌ Forgetting range check

❌ Using too large frequency array

❌ Not resetting frequency for multiple test cases

---

### 9️⃣ Comparison Table
| Approach        | Time  | Space | When to Use         |
| --------------- | ----- | ----- | ------------------- |
| Nested loops    | O(n²) | O(1)  | Small arrays        |
| Frequency array | O(n)  | O(k)  | Limited range       |
| HashMap         | O(n)  | O(n)  | Large/unknown range |


#### 🔥 Deep Concept Summary

Frequency problems are about:
1. Converting comparisons → counting
2. Using extra space to reduce time
3. Understanding trade-off: Time vs Space

This is a core DSA pattern.

#### 🎯 Array Day 11 Mastery Checklist

✔ Can explain frequency array

✔ Understand hashing via index

✔ Can detect duplicates

✔ Know when to use HashMap

✔ Can analyze time & space

---


# Java Arrays – Interview Questions & Answers (Day 11)
## Topic: Frequency Problems, Hashing Using Array, Duplicate Detection

---

## 🔹 Frequency Basics

### Q1. What is a frequency problem in arrays?
**Answer:**  
A frequency problem involves counting how many times each element appears in an array.

---

### Q2. Why are frequency problems important in interviews?
**Answer:**  
Because they help optimize brute-force O(n²) solutions into efficient O(n) solutions using extra space.

---

### Q3. What is a frequency array?
**Answer:**  
A frequency array is an auxiliary array where each index represents a value and stores the count of occurrences of that value.

---

### Q4. When can we use a frequency array?
**Answer:**  
When:
- The values are non-negative  
- The range of values is small and known  
- Memory usage is manageable  

---

## 🔹 Hashing Using Array

### Q5. What is hashing using an array?
**Answer:**  
Hashing using an array means using array indices as hash keys to store and retrieve frequency information in constant time.

---

### Q6. Why is frequency array considered a form of hashing?
**Answer:**  
Because it maps each value directly to an index, allowing O(1) access for counting.

---

### Q7. What is the time complexity of building a frequency array?
**Answer:**  
O(n), since each element is processed once.

---

### Q8. What is the space complexity of a frequency array?
**Answer:**  
O(k), where k is the range of values.

---

### Q9. What is the limitation of using a frequency array?
**Answer:**  
It cannot efficiently handle very large ranges or negative values without wasting memory.

---

## 🔹 Duplicate Detection

### Q10. How can you detect duplicates using a frequency array?
**Answer:**  
If during counting, any frequency becomes greater than 1, a duplicate exists.

---

### Q11. What is the time complexity of duplicate detection using frequency array?
**Answer:**  
O(n)

---

### Q12. What is the naive approach to detect duplicates?
**Answer:**  
Using nested loops to compare each element with every other element, resulting in O(n²) time complexity.

---

## 🔹 HashMap vs Frequency Array

### Q13. When should you use HashMap instead of a frequency array?
**Answer:**  
When:
- Values are large  
- Range is unknown  
- Negative numbers exist  
- Memory optimization is needed  

---

### Q14. What is the time complexity of using HashMap for frequency counting?
**Answer:**  
Average case O(n), since insertion and lookup are O(1) on average.

---

### Q15. What is the space complexity of HashMap-based frequency counting?
**Answer:**  
O(n), in the worst case where all elements are unique.

---

## 🔹 Advanced Frequency Questions

### Q16. How do you find the first non-repeating element?
**Answer:**  
1. Build frequency array or HashMap.  
2. Traverse the original array again.  
3. Return the first element whose frequency is 1.

---

### Q17. How do you find the element with the highest frequency?
**Answer:**  
Build frequency and track the element with the maximum count.

---

### Q18. How can frequency logic help check if two arrays are anagrams?
**Answer:**  
By counting frequencies of elements in both arrays and comparing frequency arrays or maps.

---

## 🔹 Conceptual & Interview Insight

### Q19. Why does using extra space improve time complexity in frequency problems?
**Answer:**  
Because it avoids repeated comparisons and stores computed information for constant-time lookup.

---

### Q20. Give a one-line summary of frequency problems.
**Answer:**  
Frequency problems use hashing or auxiliary storage to convert O(n²) comparison-based logic into efficient O(n) counting-based solutions.

---

## 🔹 Common Interview Traps

### Q21. What mistakes do candidates make in frequency problems?
**Answer:**  
- Not handling negative values  
- Using too large frequency arrays  
- Forgetting second traversal for ordered results  
- Not resetting frequency for multiple test cases  

---

### Q22. Why are frequency problems considered foundational for advanced topics?
**Answer:**  
Because they form the base for solving problems like majority element, missing numbers, subarray sums, sliding window, and hashing-based optimizations.

---





















