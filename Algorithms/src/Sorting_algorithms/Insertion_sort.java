package Sorting_algorithms;

public class Insertion_sort {
	public static void main(String[] args) {
		int[] arr = {2,6,4,8,7,5,9,0,3,1};
		int temp = 0;
		
		System.out.println("before sorting");
		for(int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		for(int i = 1; i <= arr.length-1; i++) {
			for(int j = i-1; j >= 0; j--) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("after sorting");
		for(int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		
	}
}
