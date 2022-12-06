#include <stdio.h>

void printArr(int *arr, int size) {
	int i;
	printf("\n[");	
	for (i = 0; i < size-1; i++) {
		printf("%d, ", arr[i]);
	}
	if (size != 0) printf("%d", arr[size-1]); 
	printf("]");	
}

void swap(int *arr, int f, int s) {
    int tmp = arr[f];
    arr[f] = arr[s];
    arr[s] = tmp;
}

void quickSort(int *arr, int s, int e) {
    int p = (s+e)/2;
    int sOriginal = s;
    int eOriginal = e;
    if (s >= e) {
        return;
    }
    while (s <= e) {
        while(arr[s] < arr[p]) {
            s++;
        }
        while(arr[e] > arr[p]) {
            e--;
        }
        if (s <= e) {
            if (s==p) {
                p = e;
            }else if (e == p){
                p = s;
            }
            swap(arr, s, e);
            s++; e--;
        }
    }
    quickSort(arr, sOriginal, p-1); 
    quickSort(arr, p+1, eOriginal); 
}

int main()
{
    int arr[] = {5, 4, 2, 1, 0, 10, 1};
    int size = sizeof(arr) / sizeof(int);
    quickSort(arr, 0, size-1);
    printArr(arr, size);
    return 0;
}
