package Revision;

public class bubble_sort {
    public static void main(String[] args) {
        int[] nums = {10,8,7,9,2,4,5,1,6,3};
        bubble(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");

        }

    }
    public static void bubble(int[] n){

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length-1; j++) {
                if(n[j]>n[j+1]){
                    //swap
                    int temp = n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }


            }

        }
    }
}
