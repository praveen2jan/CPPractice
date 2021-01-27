package Arrays;

import static java.lang.Math.abs;

public class DuplicateNo {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4 ,3};
        checkDuplicate(num, num.length);
    }





    private static void checkDuplicate(int[] arr, int size) {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }
}
