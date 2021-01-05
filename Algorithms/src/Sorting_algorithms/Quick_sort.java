package Sorting_algorithms;

public class Quick_sort { // 작업중
	private static int pre_sort(int[] arr, int i, int j) {
		int temp, pivot = arr[i];
		
		while(i < j) {
			System.out.println(pivot);
			
			System.out.printf("sorting i : %d , j : %d >> ", i, j);
			if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				i++;
				
			}else if(arr[i] == arr[j]) {
				break;
			}else {
				j--;
			}
			
			
			for(int k : arr) {
				System.out.printf("%d ", k);
			}
			System.out.println();
		}
		
		return i;
	}
	
	private static void quick_sort(int[] arr, int i, int j) {
		
		if(i < j) {
			int k = pre_sort(arr, i, j);
			
			quick_sort(arr, i, k-1);
			quick_sort(arr, k+1, j);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2,7,6,8,4,1,3,5,9,0};
		
		System.out.println("before sorting");
		for(int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		quick_sort(arr, 0, 9);
		
		System.out.println("after sorting");
		for(int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
	}
}
