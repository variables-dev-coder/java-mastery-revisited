package logic_Array.day4_Second_LargestElement;

/*
Variations on Second Largest Element

Variation 1 — Handle Edge Cases (MOST IMPORTANT)

Problem
What if:
Array size < 2?
All elements are same?

Thinking
Second largest does not exist
Must detect this condition

Rule
If secondLargest == Integer.MIN_VALUE
OR no value updated
→ print "No second largest"

Code (Safe Version)
if (secondLargest == Integer.MIN_VALUE) {
    System.out.println("Second largest does not exist");
} else {
    System.out.println("Second Largest: " + secondLargest);
}

In interview, say:

“I’ll return -1 or throw exception based on requirement.”

Variation 2 — Second Smallest Element
Logic Change

Just reverse comparisons.

Mental Formula
if current < smallest:
    secondSmallest = smallest
    smallest = current
else if current > smallest AND current < secondSmallest:
    secondSmallest = current

Code Snippet
int smallest = Integer.MAX_VALUE;
int secondSmallest = Integer.MAX_VALUE;

(Rest logic same)

 */
public class SecondSmallest {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 1, 7, 12};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest Element : " + secondSmallest); // 7
    }
}
