import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        // System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }



    static void mergeSortInPlace(int[] arr, int s, int e) {
        int mid = (s + e) / 2;

        if (e - s == 1 && s == mid) {
            return;
        }


        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
            
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

    static void mergeSort2(int[] arr, int s, int e){
        int m = (e+s)/2;
        if(e == s ){//problem founded: e == s so it can go back in correct session 
            return;
        }
        mergeSort2(arr, s, m);
        mergeSort2(arr, m+1, e);
        merge2(arr, s, m, e);
    }

    static void merge2(int[] arr, int s, int m, int e){
        int i = s;
        int j = m+1;    
        int k = 0;
        int[] newArr = new int[e-s+1];

        while(i <= m && j <= e){
            if(arr[i] <= arr[j]){
                newArr[k] = arr[i];
                i++;
                k++;
            }else{
                newArr[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i <= m){
            newArr[k] = arr[i];
            k++;
            i++;
        }
        while(j <= e){
            newArr[k] = arr[j];
            k++;
            j++;
        }
        for(int p = 0; p<newArr.length; p++){
            arr[p+s] = newArr[p];
        }

    }
}
