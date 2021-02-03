package Arrays;

public class KadaneAlgo {
    public static void main(String[] args) {
        int num[] = {1,2,3,-2,5};

        int maxSoFar=0;
        int maxEndingHere =0;
        for(int i=0;i<num.length;i++){
            maxEndingHere = maxEndingHere + num[i];
            if(maxSoFar<maxEndingHere)
                maxSoFar=maxEndingHere;
            if(maxEndingHere<0)
                maxEndingHere=0;
        }
        System.out.println(maxSoFar);
    }
}
