package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CyclicRotateArray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        rotate(num,num.length);
    }

    private static void rotate(int[] num, int length) {
        int temp = num[num.length -1];
        System.out.println(temp);
        for(int i=length-1;i>0;i--)
            num[i]= num[i-1];
        num[0] = temp;

        System.out.println(Arrays.toString(num));
    }
}
