package Arcade;

public class Intro15_AddBorder_3rd_others {  //bartek_p1's solution
	public static void main(String[] args) {
		String[] picture = {"abc", 
				 			"ded"};
		
		String[] result = new String[picture.length+2];
		
		for(int i = 0 ; i < picture.length ; i++) {
			result[i+1] = '*' + picture[i] + '*'; // 앞 뒤로 * 붙여주기
	    }
		
		result[0] = result[picture.length + 1] // 이렇게 여러개를 한번에 정의할 수도 있구나
				  = result[1].replaceAll(".","*"); // 모든 문자를 *로 치환하기
		
		for(String s : result) {
			System.out.println(s);
		}
	}
}
