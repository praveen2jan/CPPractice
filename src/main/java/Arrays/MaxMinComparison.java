package Arrays;

import java.util.Arrays;

public class MaxMinComparison {
    public static void main(String[] args) {
        int num[] = new int[]{3,5,2,5,1,5,7,3,6};
        //streams
        System.out.println(Arrays.stream(num).max().getAsInt());
        System.out.println(Arrays.stream(num).min().getAsInt());

        //Linear search
        int min = num[0];
        int max = num[0];
        for(int i=1;i< num.length;i++){
            if(num[i]>max)
                max=num[i];
            if(num[i]<min)
                min=num[i];
        }
        System.out.println(min+" "+max);
    }
}
