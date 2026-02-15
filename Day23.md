# 🟢 Java Revision – Day 23
# 📅 Array Day 9 – Rotation Problems (Interview Favorite 🔥)

---

### 1️⃣ What is Rotation?

Rotation means shifting elements circularly.

Example:

Original: [1,2,3,4,5]

Left rotate by 1 →  [2,3,4,5,1]

Right rotate by 1 → [5,1,2,3,4]

Important: No element is lost.

---

### 2️⃣ Left Rotation (Basic Understanding)

#### 🧠 Concept

Left rotate by 1:

[1,2,3,4,5]

↓

Save first element

Shift all left

Put saved element at end

#### ✅ Code – Left Rotate by 1

public class LeftRotateOne {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        for (int num : arr)
            System.out.print(num + " ");
    }
}

⏱ Time → O(n)

---

### 3️⃣ Right Rotation (Basic)

Right rotate by 1:

[1,2,3,4,5]

↓

Save last element

Shift all right

Put saved at start

#### ✅ Code – Right Rotate by 1

public class RightRotateOne {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for (int num : arr)
            System.out.print(num + " ");
    }
}


---

### 4️⃣ Rotate by K (Brute Force – Not Optimal)

Rotate by K means repeat single rotation K times.

O(n × k) ❌

Interviewers don’t like this.

---

### 5️⃣ Rotate by K – Optimal (Reversal Algorithm) 🔥🔥🔥

This is the interview favorite.

#### 🎯 Right Rotate by K Using Reversal

Example:

[1,2,3,4,5,6,7]

Rotate right by 3

#### Step 1 → Reverse whole array

[7,6,5,4,3,2,1]

#### Step 2 → Reverse first K

[5,6,7,4,3,2,1]

#### Step 3 → Reverse remaining

[5,6,7,1,2,3,4]

#### ✅ Code – Right Rotate by K

public class RotateRightK {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}


⏱ Time → O(n)

📦 Space → O(1)

---

### 6️⃣ Left Rotate by K (Reversal Trick)

Example:

[1,2,3,4,5,6,7]

Left rotate by 2

Step 1 → Reverse first K

[2,1,3,4,5,6,7]

Step 2 → Reverse remaining

[2,1,7,6,5,4,3]

Step 3 → Reverse whole array

[3,4,5,6,7,1,2]

#### ✅ Code – Left Rotate by K

public class RotateLeftK {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        for (int num : arr)
            System.out.print(num + " ");
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}


---


### 7️⃣ Interview Questions They May Ask
#### ❓ Why k = k % n ?

Because:
- Rotating by n gives same array
- Rotating by n+1 = rotate by 1

#### ❓ Time complexity?

O(n)

#### ❓ Space complexity?

O(1) — In-place reversal

#### ❓ Why not use extra array?

Because interviewer wants optimized memory.

---

#### 8️⃣ Deep Concept Understanding

Rotation = rearranging array segments.

Reversal algorithm works because:

ABC → CBA (reverse whole)

→ C + BA

→ C + AB

This is segment manipulation logic.

#### 🔥 Why Rotation Is Interview Favorite

Because it tests:
- Index understanding
- Two-pointer control
- Mathematical thinking
- Optimization
- In-place logic

#### 🧠 Expert Summary

| Method      | Time  | Space | Interview Level |
| ----------- | ----- | ----- | --------------- |
| Brute force | O(nk) | O(1)  | ❌ Weak          |
| Extra array | O(n)  | O(n)  | ⚠️ Average      |
| Reversal    | O(n)  | O(1)  | 🔥 Strong       |


---

# Java Arrays – Interview Questions & Answers (Day 9)
## Topic: Rotation Problems (Left, Right, Rotate by K, Reversal Algorithm)

---

## 🔹 Fundamentals

### Q1. What is array rotation?
**Answer:**  
Array rotation means shifting elements circularly to the left or right such that no elements are lost.

---

### Q2. What is the difference between left rotation and right rotation?
**Answer:**  
- Left rotation shifts elements toward lower indices and moves the first element to the end.  
- Right rotation shifts elements toward higher indices and moves the last element to the beginning.

---

### Q3. What happens if you rotate an array by its length (n)?
**Answer:**  
The array remains unchanged because rotating by n positions results in the original configuration.

---

### Q4. Why do we use `k = k % n` before rotation?
**Answer:**  
Because rotating by n or any multiple of n results in the same array. Using modulo avoids unnecessary rotations.

---

## 🔹 Basic Rotation Logic

### Q5. How do you left rotate an array by 1 position?
**Answer:**  
Store the first element, shift all elements one position to the left, and place the stored element at the end.

---

### Q6. How do you right rotate an array by 1 position?
**Answer:**  
Store the last element, shift all elements one position to the right, and place the stored element at index 0.

---

## 🔹 Rotate by K Positions

### Q7. What is the brute-force approach to rotate by K?
**Answer:**  
Perform single rotation K times.  
Time complexity: O(n × k)

---

### Q8. Why is the brute-force method not preferred in interviews?
**Answer:**  
Because it is inefficient for large values of k and large arrays.

---

## 🔹 Reversal Algorithm (Interview Favorite 🔥)

### Q9. Explain the reversal algorithm for right rotation by K.
**Answer:**  
1. Reverse the entire array.  
2. Reverse the first K elements.  
3. Reverse the remaining elements.  

This results in the array rotated right by K positions.

---

### Q10. Explain the reversal algorithm for left rotation by K.
**Answer:**  
1. Reverse the first K elements.  
2. Reverse the remaining elements.  
3. Reverse the entire array.  

This rotates the array left by K positions.

---

### Q11. What is the time complexity of the reversal algorithm?
**Answer:**  
O(n), because each element is reversed at most once.

---

### Q12. What is the space complexity of the reversal algorithm?
**Answer:**  
O(1), since the reversal is done in-place.

---

## 🔹 Conceptual Understanding

### Q13. Why is rotation considered a segment manipulation problem?
**Answer:**  
Because rotation rearranges segments of the array while maintaining relative order within segments.

---

### Q14. Why is the reversal algorithm considered optimal?
**Answer:**  
Because it achieves rotation in O(n) time and O(1) space without using extra arrays.

---

### Q15. Can rotation be done using an extra array?
**Answer:**  
Yes, but it requires O(n) extra space, which is less optimal compared to in-place reversal.

---

### Q16. What are common mistakes in rotation problems?
**Answer:**  
- Forgetting `k = k % n`  
- Incorrect reversal boundaries  
- Off-by-one index errors  
- Using extra space unnecessarily  

---

## 🔹 Advanced Interview Questions

### Q17. How many reversals are required in the reversal algorithm?
**Answer:**  
Three reversals.

---

### Q18. Is rotation possible in O(1) time?
**Answer:**  
No. At least O(n) time is required because elements must be rearranged.

---

### Q19. Why are rotation problems commonly asked in interviews?
**Answer:**  
Because they test index manipulation, in-place logic, optimization skills, and understanding of two-pointer techniques.

---

### Q20. Give a one-line interview summary of array rotation.
**Answer:**  
Array rotation rearranges elements circularly and is optimally implemented using the in-place reversal algorithm with O(n) time and O(1) space.

---






