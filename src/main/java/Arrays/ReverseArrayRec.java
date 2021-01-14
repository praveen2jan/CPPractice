package Arrays;

import java.util.Arrays;

public class ReverseArrayRec {
    public static void main(String[] args) {
        int numbers[] = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numbers));
        ReverseArrayRec.recursePrint(numbers,0,numbers.length-1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void recursePrint(int numbers[], int start, int end){
        if(start>end)
            return ;

        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;

        recursePrint(numbers,start+1, end-1);

    }

}
