// Array actual values aren't stored in continous manner but their reference are.
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        list.add(67);

//        System.out.println(list.contains(765432));
//        System.out.println(list);
        //SET 0 index to 99
        list.set(0, 99); 
//      index 2 will be removed
//        list.remove(2);
//
//        System.out.println(list);


        // get item at any index
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        // }
        // System.out.println(list);

        // to remove element from array 
        // for (int i = 0; int j = 0; i<arr.length; i++){
        //     if(i != valRemoveIndex){
        //     copyArr[j++] = arr[i];
        //     }
        // }
        // arr = ArrayUtils.remove(arr, index); requires apache commons library
        int[] arr=  {4,34,4344,44,444};
        int index = 0;
        System.arraycopy(arr, index+1, arr, index, arr.length-index-1);
        System.out.println(Arrays.toString(arr));
    }
}
