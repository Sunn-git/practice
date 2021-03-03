package Arcade_TheCore;

public class TheCore15_Will_You {
	public static void main(String[] args) {
		TheCore15_Will_You thisClass = new TheCore15_Will_You();
		
//		int answer = thisClass.largestNumber(8);
//		System.out.println(answer);
	}
	

	boolean willYou(boolean young, boolean beautiful, boolean loved) {
	    // 가정대로 만들기
	    // 젊 && 미 >> 사랑
	    // !젊 && 미 >> !사랑
	    // 젊 && !미 >> !사랑
	    // !젊 && !미 >> !사랑
	    return ((young && beautiful) == loved)?  false : true;
	}

	
	boolean willYou_others(boolean young, boolean beautiful, boolean loved) {
	    return !((young&& beautiful)==loved);
	    //굳이 삼항연산자를 쓰지 않아도 됐다
	}

	
}

/*


*/