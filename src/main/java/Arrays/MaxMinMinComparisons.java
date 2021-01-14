package Arrays;

public class MaxMinMinComparisons {

    static class Pair{
        int min;
        int max;

        @Override
        public String toString() {
            return "Pair{" +
                    "min=" + min +
                    ", max=" + max +
                    '}';
        }
    }

    public static void main(String[] args) {
        int num[] = new int[]{3434,2,5,454,35,6};
        Pair minMax = computeMinMax(num,num.length);
        System.out.println(minMax.toString());
    }

    private static Pair computeMinMax(int[] num, int n) {
        Pair pair = new Pair();
        int i=0;
        if(n%2==0){
            //even
            if(num[0]>num[1]){
                pair.max = num[0];
                pair.min = num[1];
            }
            else{
                pair.min = num[0];
                pair.max = num[1];
            }
            i+=2;
        }else{
            //odd
            pair.min=num[0];
            pair.max=num[0];
            i+=1;
        }
        while(i<n){
            if(num[i]>num[i+1]){
                if(num[i]> pair.max)
                    pair.max = num[i];
                if(num[i+1] < pair.min)
                    pair.min = num[i+1];
            }else{
                if(num[i+1]> pair.max)
                    pair.max = num[i+1];
                if(num[i] < pair.min)
                    pair.min = num[i];
            }
            i=i+2;
        }
        return pair;
    }
}
