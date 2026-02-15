package logic_Array.day6_Remove_Duplicates_Sorted_Array;

/*

PHASE 2 — DAY 6
Remove Duplicates (Sorted Array)

Pattern: Slow–Fast Pointers

First Understand the Most Important Thing

The array is sorted.

That means:

[1,1,2,2,3,4,4]

Duplicates are next to each other.

This is the key reason the problem becomes easy.

Big Idea (Simple Words)

We don’t delete duplicates.

We build a clean zone of unique elements at the beginning.

Think like this:

[ UNIQUE ZONE | UNKNOWN ZONE ]
        ^
        slow pointer (j)


Fast pointer scans everything.
Slow pointer builds the clean zone

What Each Pointer Does
----------------------
Fast Pointer (i)
----------------
   Scans every element
   Checks if it's new or duplicate

Slow Pointer (j)
----------------
  Marks the last unique element
  Expands the clean zone when new element is found

The Logic in One Sentence

If current element is different from last unique element, expand the clean zone.

That’s it.

Step-by-Step Dry Run
--------------------
Array:

[1,1,2,2,3,4,4]

Start:

j = 0   (first element always unique)

Now fast pointer starts from index 1.

i = 1
arr[i] = 1
arr[j] = 1
Same → duplicate → skip

i = 2
arr[i] = 2
arr[j] = 1
Different → new unique

So:

j++
arr[j] = arr[i]

Array becomes:

[1,2,2,2,3,4,4]

Now:

j = 1

i = 3
arr[i] = 2
arr[j] = 2
Same → skip

i = 4
arr[i] = 3
arr[j] = 2
Different → expand zone

Array:

[1,2,3,2,3,4,4]

j = 2

Continue…

Final valid zone:

[1,2,3,4]


Length:

j + 1 = 4

Why It Works (Very Important)

Because the array is sorted:

If arr[i] != arr[j]
→ it must be a new unique value

We never miss anything.
We never need extra memory.

The Master Mental Formula
j = 0

for i from 1 to n-1:
    if arr[i] != arr[j]:
        j++
        arr[j] = arr[i]


That’s the entire algorithm.

Deep Understanding

This is not about duplicates.

This is about:

Comparing current element with last accepted element.

That is index relationship logic.

Common Interview Questions
 Why start i from 1?

Because:

First element is always unique.

We compare every element with the previous unique element.

 Why don’t we use swap?

Because:

Order is already correct.

We only overwrite when needed.


 */


public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 6};

        if (arr.length == 0) {
            System.out.println("Length: 0");
            return;
        }

        int j = 0;   // slow pointer (last unique index)

        for (int i = 1; i < arr.length; i++) {  // fast pointer
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int newlength = j + 1;

        System.out.println("New Length: " + newlength);

        System.out.print("Unique element: ");
        for (int k = 0; k < newlength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

// New Length: 6
// Unique element: 1 2 3 4 5 6