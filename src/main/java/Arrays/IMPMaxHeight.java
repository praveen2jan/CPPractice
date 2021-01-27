package Arrays;

import java.util.Arrays;

public class IMPMaxHeight {
    public static void main(String[] args) {
        int num[] = {2 ,6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 5;
        
        getMinDifference(num,k);
    }

    private static void getMinDifference(int[] num, int k) {
        /*int min=num[0];
        int max = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min = num[i];
            }
            if(num[i]>max)
                max = num[i];
        }
        System.out.println(max+" "+min);
        System.out.println(max-min-(2*k));*/

        Arrays.sort(num);
        int ans = num[num.length-1] - num[0];

        int small = num[0] + k;
        int big = num[num.length -1 ] -k;

        int temp =0;

        if(small>big){
            temp = small;
            small = big;
            big = temp;
        }

        for(int i=1;i<num.length-1;i++){
           int substract = num[i]-k;
           int add = num[i]+k;

           if(substract>=small || add<=big)
               continue;

           if(big-substract <= add-small)
               small=substract;
           else
               big=add;

        }

        System.out.println(Math.min(ans,big-small));

    }
}
