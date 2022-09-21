import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3};
        List<List<Integer>> ans = subsetDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            //length of outer List<List<>>
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static void subset1(int[] arr, int i, ArrayList<Integer> ans){

        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        ArrayList<Integer> store = new ArrayList<>();
        store.addAll(ans);
        store.add(arr[i]);
        subset1(arr, i+1, ans);
        subset1(arr, i+1, store);
    }


    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i-1]) {
                start = end + 1;//previous end
            }
            end = outer.size() - 1;//updated end
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> subsetDuplicate2(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;

        for (int p = 0; p < arr.length; p++) {
            s = 0;
            e = outer.size();
            if(p > 0 && arr[p] == arr[p-1]){
                s = e-1;
            }

            for (int i = s; i < e; i++ ) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(arr[p]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
