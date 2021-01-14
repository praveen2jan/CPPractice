package Arrays;

public class DutchFlagProblem {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int l = arr.length;
        sort012(arr,l);
        printArray(arr,l);
    }

    private static void printArray(int[] arr, int l) {
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void sort012(int[] arr, int l) {
        int low=0;
        int high = l-1;
        int mid=0;
        int temp=0;
        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
            }
        }

    }
}
