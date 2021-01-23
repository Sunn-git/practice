package Arcade;

public class Intro27_variableName_1st { 
	public static void main(String[] args) {
		Intro27_variableName_1st thisClass = new Intro27_variableName_1st();
		
		String name = "_Aas_23";
		System.out.println(thisClass.variableName(name));

		System.out.println(thisClass.variableName_others(name));
		
	}
	
	boolean variableName(String name) {
	    return (name.matches("[a-zA-Z|_][a-zA-Z0-9|_]*"))? true : false;
	}
	
	//simonpiano's solution
	boolean variableName_others(String name) {
	    return name.matches("[a-zA-Z_][a-zA-Z0-9_]*");
	}
}

/*

문제 조건좀 자세히 보기 !!!!!!!!
"_Aas_23" 이 테스트케이스가 왜 통과안되는지 몰랐는데 언더스코어도 첫글자에 사용가능이었다..
그리고 matches return값이 에초에 boolean인데 왜 삼항연산자를 썼지? 
생각좀 하면서 풀자 ..
그리고 or 표시는 안넣어줘도 괜찮은가보다

*/