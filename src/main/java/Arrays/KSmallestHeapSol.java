package Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class KSmallestHeapSol {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,55,3,22,1,66,33);
        int k=3;
        System.out.println(findKSmallest(nums,k));
        System.out.println(findKLargest(nums,k));
        Collections.sort(nums);
        System.out.println(nums.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }

    private static int findKLargest(List<Integer> nums, int k) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Comparator.naturalOrder());
        integers.addAll(nums.subList(0,k));
        for(int i=k;i<nums.size();i++){
            if(nums.get(i)>integers.peek()){
                integers.poll();
                integers.add(nums.get(i));
            }
        }
        return integers.peek();
    }


    private static Integer findKSmallest(List<Integer> nums, int k) {
        PriorityQueue<Integer> integers = new PriorityQueue<>(Comparator.reverseOrder());
        integers.addAll(nums.subList(0,k));

        for(int i=k;i<nums.size();i++){
            if(nums.get(i)<integers.peek()){
                integers.poll();
                integers.add(nums.get(i));
            }
        }
        return integers.peek();
    }
}
