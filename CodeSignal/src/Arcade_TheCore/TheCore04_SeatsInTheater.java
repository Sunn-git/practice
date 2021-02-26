package Arcade_TheCore;

public class TheCore04_SeatsInTheater {
	public static void main(String[] args) {
		TheCore04_SeatsInTheater thisClass = new TheCore04_SeatsInTheater();
		
		int answer = thisClass.seatsInTheater(16, 11, 5, 3);
		System.out.println(answer);
	}
	
	int seatsInTheater(int nCols, int nRows, int col, int row) {
	    return (nCols-col+1)*(nRows-row);
	} // col은 내가 앉은 자리를 포함하지만 row는 아님


	
	
}

/*


*/