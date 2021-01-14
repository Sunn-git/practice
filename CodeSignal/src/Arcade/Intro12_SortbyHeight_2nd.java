package Arcade;

public class Intro12_SortbyHeight_2nd { 
	public static void main(String[] args) {
		int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};

		for(int i = 0; i < a.length; i++) {
			if(a[i] == -1) continue;
			for(int j = i+1; j < a.length; j++) {
				if(a[j] == -1) continue;
				int temp = 0;
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp; 
				}
			}
		}

	    for(int i : a) {
	    	System.out.printf("%d ", i);
	    }
	}
}
