package logic_Array.day8_Merge_Two_Sorted_Arrays;


/*

🔹 Merge Two Sorted Arrays

Pattern: Three Pointers
Why: Multiple index control

🧠 Problem Statement (Simple Words)

Given two sorted arrays, merge them into one sorted array.

📌 Example:

arr1 = [1, 3, 5]
arr2 = [2, 4, 6]

Output = [1, 2, 3, 4, 5, 6]
🧠 Big Idea

We compare elements from both arrays and pick the smaller one.

We need:

i → pointer for arr1

j → pointer for arr2

k → pointer for merged array

That’s why it’s called 3-pointer logic.

🧠 Pointer Roles
Pointer	Role
i	Tracks arr1
j	Tracks arr2
k	Builds merged array
🧠 Core Logic
While both arrays have elements:
    Compare arr1[i] and arr2[j]
    Put smaller into merged[k]
    Move that pointer
    Move k

After that:

Copy remaining elements from arr1 (if any)

Copy remaining elements from arr2 (if any)

🧪 Dry Run
arr1 = [1, 3, 5]
arr2 = [2, 4, 6]

Start:

i=0, j=0, k=0
Step 1

1 < 2 → put 1
i++, k++

Merged:

[1]
Step 2

3 > 2 → put 2
j++, k++

Merged:

[1,2]
Step 3

3 < 4 → put 3
i++, k++

Merged:

[1,2,3]

Continue…

Final:

[1,2,3,4,5,6]

 */


public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

            while (i < n2) {
                merged[k++] = arr1[i++];
            }

            while (j < n2) {
                merged[k++] = arr2[j++];
            }

            for (int num : merged) {
                System.out.print(num + " ");  // 1 2 3 4 5 6
            }
       }
}

/*

🧠 Why This Is Important

This is the core of:

Merge Sort

External sorting

Database join logic

Stream merging

Many system design problems

🧠 Mental Formula (Lock This)

Compare → Copy smaller → Move that pointer → Move result pointer
 */