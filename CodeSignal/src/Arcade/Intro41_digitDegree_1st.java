package Arcade;

import java.util.Arrays;

public class Intro41_digitDegree_1st { 
	public static void main(String[] args) {
		Intro41_digitDegree_1st thisClass = new Intro41_digitDegree_1st();
		
		
	}
	
	int digitDegree(int n) {
	    String s = Integer.toString(n);
	    int cnt = 0;
	    while(s.length() > 1){
	        cnt++;
	        int sum = 0;
	        char[] arr = s.toCharArray();
	     
	        for(int i = 0; i < arr.length; i++){
	            sum += arr[i]-'0';
	        }
	        
	        if(sum < 10) break;
	        if(sum > 9) s = Integer.toString(sum);
	    }

	    return cnt;
	}
	
	int digitDegree2(int n) {
	    int cnt = 0, sum;
	    while(n > 9){
	        cnt++;
	        sum = 0;
	        while(n > 0){
	            sum += n%10;
	            n /= 10;
	        } 
	        n = sum;
	    }
	    return cnt;
	}

	
	
//	seandunn92's solution
	int digitDegree_others(int n) {
        if(n/10==0)
            return 0;
        int num =0;
        while (n!=0){
            num+=n%10;
            n/=10;
        }
        return 1 + digitDegree(num);
        
        /* 재귀함수를 이용한 깔끔한 풀이  */
    }
	  
//	bandorthild's solution
	int digitDegree_others2(int n) {
	  int c = 0;
	  while (Integer.toString(n).length()>1) {
	      n = Arrays.stream(Integer.toString(n).split(""))
	      		.mapToInt(i->Integer.parseInt(i))
	       		.sum();
	       c++;
	  }
      return c;
      
      /*  역시 stream을 이용한 풀이가 있을 것 같았다 !  */
	}
	
	
}

/*



*/