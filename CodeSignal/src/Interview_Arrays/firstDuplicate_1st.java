package Interview_Arrays;

public class firstDuplicate_1st {
	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 3, 2};
		
		int duplicate = -1;
		int idx = a.length;

	     for(int i = 0; i < a.length-1; i++){
	         if(a[i] == 0) continue;
	         int num = a[i];
	         a[i] = 0;
	         for(int j = i+1; j < a.length; j++){
	             if(num != a[j]) continue;
	             a[j] = 0;
	             if(j < idx){
	                 duplicate = num;
	                 idx = j;
	             }
	         }
	     }

//		boolean[] check = new boolean[a.length];
//	    
//	     for(int i = 0; i < a.length-1; i++){
//	         if(check[i] == true) continue;
//	         check[i] = true;
//	         for(int j = i+1; j < a.length; j++){
//	             if(a[i] != a[j]) continue;
//	             check[j] = true;
//	             if(j < idx){
//	                 duplicate = a[i];
//	                 idx = j;
//	             }
//	         }
//	     }

	}
}

/* 
 처음에 이중 for문으로  풀려고 했던 문제.
 23번 테스트케이스가 시간초과로 자꾸 걸려서 통과를 못하고 있었음. 
*/