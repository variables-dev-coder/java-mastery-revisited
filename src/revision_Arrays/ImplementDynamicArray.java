package revision_Arrays;

import java.util.Arrays;

public class ImplementDynamicArray {

    static class DynamicArray {

        private int[] data;
        private int size;

        DynamicArray() {
            data = new int[2];
            size = 0;
        }

        void add(int value) {

            // Array is full
            if (size == data.length) {

                int[] newData = new int[data.length * 2];

                for (int i = 0; i < data.length; i++) {
                    newData[i] = data[i];
                }

                data = newData;
            }

            data[size] = value;
            size++;
        }

        int get(int index) {

            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            return data[index];
        }

        int size() {
            return size;
        }

        void print() {

            System.out.println(
                    Arrays.toString(
                            Arrays.copyOf(data, size)
                    )
            );
        }
    }

    public static void main(String[] args) {

        DynamicArray arr = new DynamicArray();

        arr.add(10);
        arr.add(20);

        System.out.println("After adding 2 elements:");
        arr.print();

        arr.add(30);

        System.out.println("After adding 30:");
        arr.print();

        arr.add(40);
        arr.add(50);
        arr.add(60);

        System.out.println("Final array:");
        arr.print();

        System.out.println("Element at index 2: " + arr.get(2));

        System.out.println("Size: " + arr.size());
    }
}
