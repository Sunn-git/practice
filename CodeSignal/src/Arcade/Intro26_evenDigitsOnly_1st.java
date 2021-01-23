package Arcade;

public class Intro26_evenDigitsOnly_1st { 
	public static void main(String[] args) {
		Intro26_evenDigitsOnly_1st thisClass = new Intro26_evenDigitsOnly_1st();
		int n = 642386;
		
		thisClass.evenDigitsOnly(n);
		
		System.out.println(thisClass.evenDigitsOnly_others(n));
		
	}
	
	boolean evenDigitsOnly(int n) {
	    int i;
	    while(n > 0){
	        i = n % 10;
	        if(i%2 != 0) return false;
	        n /= 10;
	    } 
	    return true;
	}
	
	//arychagov's solution
	boolean evenDigitsOnly_others(int n) { 
	    return Integer.toString(n).matches("(0|2|4|6|8)*");

	    
/*
	    return Integer.toString(n).matches("[0|2|4|6|8]*"); : 테스트 통과
	    return Integer.toString(n).matches("/0|2|4|6|8/*"); : 테스트 실패

() : Groups multiple tokens together 
and creates a capture group 
for extracting a substring or using a backreference.
[] : Match any character in the set.	
// : Indicarte the start and end of expression flags.
 
	출처 : https://regexr.com/
 
 */
	}
	
	//manh_linh_p's solution
	boolean evenDigitsOnly_others2(int n) {
	    return (n + "").matches("[02468]+");
	}
}

/*

정규표현식으로 짝수 판별하기 

x|y : 'x' 또는 'y'에 대응됩니다.
예를 들어, /green|red/는 "green apple"의 'green'에 대응되고, 
"red apple."의 'red'에 대응됩니다.



(x) :  'x'에 대응되고, 그것을 기억합니다. 
괄호는 포획 괄호(capturing parentheses)라 불립니다.
패턴 /(foo) (bar) \1 \2/ 안의 '(foo)' 와 '(bar)'는 
문자열"foo bar foo bar"에서 처음의 두 단어에 대응되고 이를 기억합니다. 
패턴 내부의 \1와 \2는 문자열의 마지막 두 단어에 대응됩니다. 
(역주: \n 패턴은 앞의 n번째 포획괄호에 대응된 문자열과 똑같은 문자열에 대응됩니다.) 
\1, \2, \n과 같은 문법은 정규식의 패턴 부분에서 사용됩니다. 
정규식의 치환 부분에서는 $1, $2, $n과 같은 문법이 사용되어야 합니다. 
예를 들어, 'bar foo'.replace( /(...) (...)/, '$2 $1')와 같이 사용되어야 합니다. 
$& 패턴은 앞에서 대응된 전체 문자열을 가리킵니다.



 * : 앞의 표현식이 0회 이상 연속으로 반복되는 부분과 대응됩니다. 
    {0,} 와 같은 의미입니다.
예를 들어, /bo* / 는 "A ghost booooed" 의 'boooo' 와 대응되고, 
"A bird warbled" 의 'b'에 대응되지만 
"A goat grunted" 내의 어느 부분과도 대응되지 않습니다.


출처 : https://developer.mozilla.org/ko/docs/Web/JavaScript/Guide/%EC%A0%95%EA%B7%9C%EC%8B%9D

*/