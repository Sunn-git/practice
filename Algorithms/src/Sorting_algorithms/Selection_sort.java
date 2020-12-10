package Sorting_algorithms;

public class Selection_sort {
	public static void main(String[] args) {
		int[] arr = {2,6,4,8,7,5,9,0,3,1};
		int temp = 0;
		
		System.out.println("before sorting");
		for(int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		for(int i = 0; i < arr.length-1; i++) {
			int min_idx = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min_idx]) {
					min_idx = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		
		System.out.println("after sorting");
		for(int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
	}
}
