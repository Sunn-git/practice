package Arcade;

public class Intro17_arrayChange_2nd_others { //jocke93's solution
	public static void main(String[] args) {
		int[] inputArray = {1, 1, 1};
		
		System.out.println(arrayChange(inputArray));
	}
	
	static int arrayChange(int[] inputArray) {
		int cnt=0, t;
	    
	    for(int i=0; i<inputArray.length-1; i++)
	        if(inputArray[i] >= inputArray[i+1]) {
	            t = inputArray[i] - inputArray[i+1] +1;
	            //inputArray[i] 보다 큰 수를 만들어야 하기 때문에 두 수 의 차보다 1 크게 만들어준다
	            inputArray[i+1] += t;
	            cnt += t;
	        }
	    return cnt;
	}
}

/*

맞지.. 굳이 1씩 올리면서 세지 않아도 되지...

*/