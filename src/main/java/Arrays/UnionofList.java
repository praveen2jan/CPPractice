package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnionofList {
    public static void main(String[] args) {
        int arr1[] = {1, 3, 4, 5, 7};
        int arr2[] = {2, 3, 5, 6};
        List<Integer> integers = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                integers.add(arr1[i]);
                i++;
            } else if (arr1[i] == arr2[j]) {
                integers.add(arr1[i]);
                intersection.add(arr2[j]);
                i++;
                j++;
            } else {
                integers.add(arr2[j]);
                j++;
            }
        }
        System.out.println(integers.stream().map(String::valueOf).collect(Collectors.joining(",")));
        System.out.println(intersection.stream().map(String::valueOf).collect(Collectors.joining(",")));
    }
}
