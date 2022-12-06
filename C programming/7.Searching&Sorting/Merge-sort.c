#include <stdio.h>
#include <stdlib.h>

void printArr(int *arr, int size) {
	int i;
	printf("\n[");	
	for (i = 0; i < size-1; i++) {
		printf("%d, ", arr[i]);
	}
	if (size != 0) printf("%d", arr[size-1]); 
	printf("]");	
}

int getSizeOfArr() {
	int n = 0;
	printf("\nEnter the size of the arr: ");
	scanf("%d", &n);
	return n;
}

int *getArrBySize(int size) {
    int i;
	int *arr = (int *)malloc(sizeof(int)*size);
	printf("\nEnter all the values with space between Max= %d: ", size);
	for (i = 0; i < size; i++) {
		scanf("%d", &arr[i]);
	}
	printf("\n");
	return arr;
}

void merge(int *, int, int, int);
void mergeSort(int *arr, int s, int e) {
	if (s >= e) return;

	int mid = s + ((e-s) / 2);
	mergeSort(arr, s, mid);
	mergeSort(arr, mid+1, e);
	merge(arr, s, mid, e);	
}

void merge(int *arr, int s, int m, int e) {
	int *mix = (int*)malloc(sizeof(int)*(e-s)+1);
	int s1 = s; int s2 = m+1;
	int e1 = m; int e2 = e;
	int k = 0;	
	while ( s1 <= e1 && s2 <= e2 ) {
		if (arr[s1] <= arr[s2]) {
			mix[k++] = arr[s1++];
		} else {
			mix[k++] = arr[s2++];
		}
	}

	while( s1 <= e1 ) {
		mix[k++] = arr[s1++];
	}

	while ( s2 <= e2 ) {
		mix[k++] = arr[s2++];
	}

	// Modifying Actual array
	s1 = 0;
	for (k = s; k <= e; k++) {
		arr[k] = mix[s1++];
	}
}


int main()
{
	int size = getSizeOfArr();
	int *arr = getArrBySize(size);
	printArr(arr, size);
	mergeSort(arr, 0, size-1);
	printArr(arr, size);
	free(arr);
}
