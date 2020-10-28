package StrangerWords;

public class StrangerWords_3rd_others {

	public static void main(String[] args) { // (8.78ms, 54MB) 진짜빠름..
		String s = "try hello world";

		String answer = change(s);
		
		System.out.println(answer);
	}

	private static String change(String s) {
				
		String result = "";
		int index = 0;
		String[] array = s.split("");
		
		
		for(String ss : array) {
			index = ss.contains(" ") ? 0 : index + 1;
			result += (index % 2 == 0) ? 
					ss.toLowerCase() : ss.toUpperCase();
//					공백부터 index를 세기 시작하기 때문에 홀수일 때, 대문자로 설정
		}
		
		return result;
	}
	
	private static String change2(String s) {
		//응용해봄. contains대신 equals를 사용했더니 시간이 거의 반절 줄어듦
		//(4.96ms, 52.5MB)
		String result = "";
		String[] split = s.split("");
		int index = 0;
		
		for(String string : split) {
			index = (string.equals(" ")) ? 0 : index + 1;
			result += (index % 2 == 0) ? string.toLowerCase() : string.toUpperCase();
		}
		
		return result;
	}

}

/*
 * 이 코드가 훨씬 빠른 이유 ? : 형변환이 없다. for문을 한 번만 사용한다.
 * 경우에 따라 다르겠지만 삼항연산자, if문, switch문의 속도차이는 거의 없다고 한다.
 */
