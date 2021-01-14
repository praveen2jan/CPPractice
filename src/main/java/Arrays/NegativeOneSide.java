package Arrays;

public class NegativeOneSide {
    public static void main(String[] args) {
        int arr[] = {-12, 11, -13, -5,
                6, -7, 5, -3, 11};
        rearrange(arr,arr.length-1);
        display(arr, arr.length-1);
    }

    static void display(int[] arr, int right)
    {

        // Loop to iterate over the element
        // of the given array
        for(int i = 0; i <= right; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    private static void rearrange(int[] arr, int right) {
        int left =0;
        while(left<=right){
            if(arr[left]< 0 && arr[right]<0)
                left++;
            else if(arr[left]>0 && arr[right]<0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(arr[left]>0 && arr[right]>0)
                right--;
            else {
                left++; right--;
            }
        }
    }
}
