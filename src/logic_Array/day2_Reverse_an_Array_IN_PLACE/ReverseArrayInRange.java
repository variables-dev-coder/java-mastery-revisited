package logic_Array.day2_Reverse_an_Array_IN_PLACE;
/*
Your Logic (Confirmed)

What you said is right:

swap start & end → move inward → stop when pointers meet

That’s the essence of two pointers

Now let me tighten it so it sounds precise and confident.

Day 2 – Variation 1
Reverse Array in a Given Range (Thinking Only)
Pointer Initialization (MOST IMPORTANT PART)

left starts at range start index

right starts at range end index

Example:

Array: [1, 2, 3, 4, 5]
Range: 1 to 3

left = 1
right = 3

Swap Logic

Swap arr[left] and arr[right]

This puts correct elements at both ends of the range

Pointer Movement

After each swap:

left++
right--


Why?

Left moves forward

Right moves backward

Range shrinks from both sides

Stop Condition (VERY IMPORTANT)

Stop when:

left >= right


Because:

If they meet → middle element (already correct)

If they cross → all required swaps done

One-Line Mental Model (MEMORIZE THIS)

For range reverse: start pointers at range boundaries, not array boundaries

This line alone separates confident candidates from average ones.

Day 2 STATUS

Pointer thinking is correct
top condition understood
No confusion between full array vs range
Ready for code implementation
 */
public class ReverseArrayInRange {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int left = 2;
        int right = 5;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // pring array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // 1 2 6 5 4 3 7
        }
    }
}
