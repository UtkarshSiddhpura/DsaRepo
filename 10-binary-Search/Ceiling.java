// package com.kunal;
/*at the end two cases possible target=4 arr={2, 3, 5, 9..
    s.....e ans in middle
    case 1) 2 3 5 
            s   e
            mid is 3 so s = m+1 
            3 5
            s e always lowerThanTar -> start) and end -> upperThanTar
            so m is 3 since always lower than tar -> s = m+1
            hence, Start will point the upperThanTar Index

    case 2) 3 5 directly  
*/

public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 15, 16, 18};
        int target = 15;
        // int[] arr = {2, 3, 5, 9, 14, 16, 18};

        int ans = ceilingIndex(arr, target);
        System.out.println(ans);
    }

    // return the index of smallest no >= target
    static int ceilingIndex(int[] arr, int target) {

        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found target itself
                return mid;
            }
        }
        return start;
    }
}
