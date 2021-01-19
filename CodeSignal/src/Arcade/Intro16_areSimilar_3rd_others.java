package Arcade;

public class Intro16_areSimilar_3rd_others { // Arrays.sort 사용하지 않은 풀이
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = {3, 2, 1};
		
		System.out.println(areSimilar(a, b));
	}
	
	static boolean areSimilar(int[] a, int[] b) {
		int falseCnt = 0;
	    int idx = 0;
	    boolean result = true;

	    for(int i = 0; i < a.length; i++){        
	        if(a[i] != b[i]) {
	            falseCnt++; //같은 인덱스의 숫자가 서로 다를경우 cnt 증가
	            if(falseCnt == 1) {
	                idx = i; //처음 서로 달랐던 경우의 인덱스를 저장
	            }else if(falseCnt == 2) {
	            	// 두번째로 다른 경우일 때, 첫번째 값과 서로 교차되는지 확인. 하나라도 일치하지 않으면 false 처리
	                if(a[idx] != b[i] || b[idx] != a[i]) result = false;
	                /*	여기에 break 들어가면 안됨 
	                	위치를 바꿀 수 있는 한 쌍이 발견되고 난 후 다음 수를 검사하면서 
	                	if문에 걸려 result가 false로 바뀌고  break가 작동하면서 오답이 리턴된다
	            	*/
	            }
	            
	            if(falseCnt > 2){ // 이 if문의 위치는 큰 if문 밖에 있어도 상관없음
	                result = false;
	                break;
	            }
	        }        
	    }
	    
	    return result;
	}
}
