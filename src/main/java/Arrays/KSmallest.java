package Arrays;

import java.util.Arrays;

public class KSmallest {
    public static void main(String[] args) {
        int num[] = new int[]{123,343,53,5,2,4,5};
        System.out.println(smallestK(num,0,num.length-1,2));
    }

    private static int smallestK(int[] num, int start, int end, int k) {
       /* for(int i=start;i<=end;i++){

        }*/
        Arrays.sort(num);
        return num[k-1];
    }
}
