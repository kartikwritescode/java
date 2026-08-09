package dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequences{

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // printSubseq(arr);
        printSubseq2(arr);
    }
    public static void printSubseq(int[] nums){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            list.add(new ArrayList<>(Arrays.asList(nums[i])));
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]!=nums[j]){
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j])));
                }
                for (int j2 = j+1; j2 < nums.length; j2++) {
                    list.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[j2])));
                }
            }
        }
        for (ArrayList<Integer> sub : list) {System.out.println(sub);}

        
    }



    
  public static List<List<Integer>> printSubseq2(int[] arr) {

    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());

    for (int num : arr) {

        int n = outer.size();

        for (int i = 0; i < n; i++) {

            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }

    for (List<Integer> subset : outer) {
        System.out.println(subset);


        
    }

    return outer;
}
}