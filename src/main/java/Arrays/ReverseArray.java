package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int reverseArray[] = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverseArray));

        for(int i=0;i<reverseArray.length/2;i++){
            int temp =reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length-i-1];
            reverseArray[reverseArray.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(reverseArray));

    }
}


