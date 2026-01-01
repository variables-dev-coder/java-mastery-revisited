package day02_Core_Java_Fundamentals;


public class ArrayDemo {
    public static void main(String[] args) {

        int[][] data = new int[2][];
        data[0] = new int[]{1, 2, 3};
        data[1] = new int[]{4, 5};

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*

STEP 1: JVM starts main()
Stack frame for main() is created
Local variable data is created on stack

Stack:
data → reference

STEP 2: int[][] data = new int[2][];
This line is VERY IMPORTANT.
What it means:
Create an array of size 2
Each element can hold int[]
But inner arrays are NOT created yet
Heap:
data → [ null , null ]
This is called a jagged array structure

STEP 3: data[0] = new int[]{1, 2, 3};
Creates an int[] of size 3
Assigns its reference to data[0]
Heap:
data → [ [1,2,3] , null ]

STEP 4: data[1] = new int[]{4, 5};
Creates another int[] of size 2
Assigns it to data[1]
Heap:
data → [ [1,2,3] , [4,5] ]
Rows have different lengths → jagged array

STEP 5: Outer Loop
for (int i = 0; i < data.length; i++)
data.length = 2
Loop runs 2 times
i = 0, then i = 1

STEP 6: Inner Loop
for (int j = 0; j < data[i].length; j++)
When i = 0
data[0].length = 3
Prints:
1 2 3
When i = 1
data[1].length = 2
Prints:
4 5

FINAL OUTPUT
1 2 3
4 5

 */