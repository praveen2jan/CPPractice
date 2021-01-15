package Arrays;

public class IMPLargestSumContiguousArray {
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Sum Contiguous Array + "+ maxSubArray(a,a.length));
        maxSubArrayIndices(a,a.length);
    }

    private static void maxSubArrayIndices(int a[], int length){
        int maxEndingHere = 0;
        int maxSoFar = Integer.MIN_VALUE;
        int start =0, end =0, temp=0;
        for(int i=0;i<length;i++){
            maxEndingHere = maxEndingHere + a[i];

            if(maxSoFar<maxEndingHere){
                maxSoFar=maxEndingHere;
                start=temp;
                end =i;
            }

            if(maxEndingHere<0){
                maxEndingHere=0;
                temp=i+1;
            }

        }

        System.out.println("Sum "+ maxSoFar+" start "+start+" end "+end);


    }

    private static int maxSubArray(int[] a, int length) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for(int i=0;i<length-1;i++){
            maxEndingHere = maxEndingHere + a[i];
            if(maxSoFar<maxEndingHere)
                maxSoFar=maxEndingHere;

            if(maxEndingHere<0)
                maxEndingHere=0;
        }
        return maxSoFar;
    }
}
