# 🟢 Java Revision – Array Day 22
# 📅 Day 8 – Reversal Techniques (Expert Level)
### 1️⃣ Reverse Array – Core Concept
#### 🎯 Problem

Given an array:

[10, 20, 30, 40, 50]

Reverse it:

[50, 40, 30, 20, 10]

#### 🧠 Beginner Thinking (Wrong Way)
- Create new array
- Copy elements from back
- Return new array

✔ Works

❌ Uses extra space

❌ Not optimal

### 2️⃣ Expert Thinking – Two Pointer Technique 🔥

Instead of copying, we:
- Use two pointers
- One from start
- One from end
- Swap elements
- Move inward

#### 🔥 Core Idea

If:

left = 0

right = n - 1

Swap:

arr[left] ↔ arr[right]


Then:

left++

right--


Repeat until:

left >= right

### 3️⃣ Why Two-Pointer Works (Deep Understanding)

Because:
- First element ↔ Last
- Second ↔ Second last
- Third ↔ Third last
- etc.

We reduce the problem size from both sides.

📌 Time Complexity → O(n)

📌 Space Complexity → O(1)

### 4️⃣ In-Place Reversal (Very Important 🔥)
#### ❓ What does "in-place" mean?

Modify the original array without using extra memory.

No new array.

No extra storage.

Only swap operations.

#### ✅ Java Code – In-Place Reversal

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

### 5️⃣ Interview Explanation (Whiteboard Style)

You should say:
> I use two pointers, one at the beginning and one at the end.
> 
> I swap elements at both pointers and move them towards the center.
> 
> This continues until they meet.
> 
> The reversal is done in-place with O(n) time and O(1) space.

### 6️⃣ Common Interview Traps 🚨
❌ Using extra array unnecessarily

❌ Wrong loop condition (<= instead of <)

❌ Forgetting to move both pointers

❌ Index out of bounds

Correct condition:

while (left < right)

### 7️⃣ Why This Pattern Is Powerful

Two-pointer reversal is used in:
- Array rotation
- Palindrome check
- Reverse string
- Reverse words in sentence
- LinkedList reversal
- Trapping rain water
- Container with most water

This is not just reversal.

This is a pattern.

### 8️⃣ Mental Model (Very Important)

Think like this:

[ L ......... R ]

Each iteration:
- Fix outer elements
- Shrink problem size

This is divide from both ends strategy.

### 9️⃣ Advanced Variation – Reverse Subarray

Reverse from index i to j.

Same logic:

left = i

right = j

Used in:
- Array rotation
- Segment reversal problems

### 🔥 Final Expert-Level Summary

Reversal using two-pointer is:
- O(n) time
- O(1) space
- In-place
- Foundational DSA pattern
- Required for rotations and advanced problems

#### ✅ Day 8 Mastery Checklist

✔ Can explain two-pointer clearly

✔ Can write reversal without IDE

✔ Can state time & space complexity

✔ Understand pattern reuse









