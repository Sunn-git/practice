package Arcade_TheCore;

public class TheCore08_PhoneCall {
	public static void main(String[] args) {
		TheCore08_PhoneCall thisClass = new TheCore08_PhoneCall();
		
		int answer = thisClass.phoneCall(3, 1, 2, 20);
		System.out.println(answer);
	}
	
	int phoneCall(int min1, int min2_10, int min11, int s) {
	    int result = 0, temp = 0;
	    if(s-min1 < 0) return result;
	    result++;
	    s -= min1;
	    
	    if(s/min2_10 < 0) return result;
	    temp = (s/min2_10 <= 9)? s/min2_10 : 9;
	    result += temp;
	    s -= temp*min2_10;
	    
	    if(temp < 9 || s/min11 < 0) return result;
	    result += s/min11;
	    
	    return result;
	}
	
	
//	tungds's solution
	int phoneCall_others(int min1, int min2_10, int min11, int s) {
	    int t1=min1+ min2_10*9;
	    if (s>=t1){ // 11분 이상 통화하는 경우
	        return 10+(s-t1)/min11; // 10은 앞에 통화한 10뷴
	    }
	    if (s>=min1){ // 1분이상 10분이하 통화하는 경우
	        return (s-min1)/min2_10+1;
	    }
	    return 0; // 돈이 최소요금보다 적을 경우
	    //이런식으로 나눠서 보는게 훨씬 효율적이구나
	}
	
	
//	DimaPhil's solution
	int phoneCall_others2(int min1, int min2_10, int min11, int S) {
	    if (S < min1) {
	        return 0;
	    }
	    if (S < min1 + 9 * min2_10) {
	        return 1 + (S - min1) / min2_10;
	    }
	    return 10 + (S - min1 - 9 * min2_10) / min11;
	    //if문에 들어가는 조건만 다른 경우.
	}

	
}

/*


*/