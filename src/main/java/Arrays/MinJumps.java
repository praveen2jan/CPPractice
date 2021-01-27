package Arrays;

public class MinJumps {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 6, 1, 0, 9 };

        System.out.println("Minimum number of jumps to reach end is : "
                + minJumps(arr, arr.length));
    }

    private static int minJumps(int[] arr, int n) {
        int jumps[] = new int[n];

        int i,j;

        if(n==0 || arr[0] == 0)
            return Integer.MAX_VALUE;

        jumps[0]=0;

        for(i=1;i<n;i++){
            jumps[i] = Integer.MAX_VALUE;
            for(j=0;j<i;j++){
                if(i<=j+arr[j] && jumps[j]!= Integer.MAX_VALUE){
                    jumps[i] = Math.min(jumps[i],jumps[j]+1);
                }
            }
        }
        return jumps[n-1];

    }
}
