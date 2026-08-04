package Revision;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {10,5,3,8,2,9};
        selection(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection(int[] n){
        for (int lastIndex = n.length-1 ; lastIndex>0; lastIndex--) {
            int max = 0;
            for (int j = 0; j <= lastIndex; j++) {
                if(n[j]>n[max]){
                    max = j;
                }
            }
            //            swap with last
            int temp = n[max];
            n[max] = n[lastIndex];
            n[lastIndex] = temp;

        }
    }
}
