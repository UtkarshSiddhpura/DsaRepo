import java.util.Arrays;


public class RecursiveSelection{
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1, -6, -2};
		rBubble(arr, 0, 0);
		System.out.println(Arrays.toString(arr));
	}
	static void rSelection(int[] arr, int i, int j, int max){
		if(i > arr.length-2){
			return;
		}
		//can be mistaken here if(j==arr.length-i) we have to swap here as lst element should get checked with max
		if(j < arr.length -1-i){
			if(arr[j+1] > arr[max]){
				rSelection(arr, i, j+1, j+1);
			}else{
				rSelection(arr, i, j+1, max);
			}
		}else{
			swap(arr, max, arr.length-1-i);
			rSelection(arr, i+1, 0, 0);	
		}
	}
	static void rBubble(int[] arr, int i, int j){
		if(i > arr.length - 2){
			return;
		}

		if(j == arr.length-1){
			rBubble(arr, i+1, 0);	
		}else{
			if(arr[j] > arr[j+1]){
				swap(arr, j, j+1);
				rBubble(arr, i, j+1);
			}else{
				rBubble(arr, i, j+1);
			}
		}

	}
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}