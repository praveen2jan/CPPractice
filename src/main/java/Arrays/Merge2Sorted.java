package Arrays;

import java.util.Arrays;

public class Merge2Sorted {

    public static void main(String[] args) {
        int a[] = {1,3,5,7,8};
        int b[] = {2,4,6,9,10};
        int i=0,j=0,k=0;
        int c[] = new int[10];
        while(i<a.length && j < b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++; k++;
            }else if(a[i]>b[j]){
                c[k]=b[j];
                k++; j++;
            }else{
                c[k]=a[i];
                k++;i++;j++;
            }
        }
        while(i<a.length){
            c[k]=a[i];
            k++;i++;
        }
        while(j<b.length){
            c[k]=b[j];
            k++;j++;
        }
        System.out.println(Arrays.toString(c));
        withoutExtraSpace(a,b,a.length,b.length);
    }

    private static void withoutExtraSpace(int[] a, int[] b, int m, int n) {
        for(int i=n-1;i>=0;i--){
            int j;
            int last = a[m-1];
            for(j=m-2; j>=0 && a[j]>b[i] ; j--)
                a[j+1] = a[j];

            if(j!=m-2 || last > b[i]){
                a[j+1] = b[i];
                b[i] = last;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
