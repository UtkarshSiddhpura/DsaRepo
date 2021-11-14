import java.util.Arrays;

public class MaxAndReverse {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 9, 18};
        //for each 
        // for (int naam : arr ) {
        //     System.out.println(naam);
        // }

        // for(int[] a : arr) {
        //     System.out.println(Arrays.toString(a));
        // }
        System.out.println("max is " +max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }


  
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


    static void swap(int[] arr, int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
