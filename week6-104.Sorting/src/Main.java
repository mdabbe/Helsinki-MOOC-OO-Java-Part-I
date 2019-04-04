import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest)
                smallest = i;
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallest = smallest(array);
        int index = -1;
        for (int i=0;i<array.length;i++) {
            if (array[i]==smallest) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
//        int[] newArray = Arrays.copyOfRange(array, index, array.length);
//        return indexOfTheSmallest(newArray);
        int smallest = array[index];
        int j = index;
        for (int i=index;i<array.length;i++) {
            if (array[i]<smallest) {
                smallest = array[i];
                j = i;
            }
        }
        return j;
    }
    public static void swap(int[] array, int index1, int index2) {
        // code goes here
//        int temp = array[index1];
//        array[index1] = array[index2];
//        array[index2] = temp;
        int swap1;
        int swap2;
        swap1 = array[index2];
        swap2 = array[index1];
        array[index1] = swap1;
        array[index2] = swap2;

    }

    public static void sort(int[] array) {
//        for(int i=0;i<array.length;i++) {
//            swap(array,i,indexOfTheSmallestStartingFrom(array,i));
//            System.out.println(Arrays.toString(array));
//        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }

    }






}
