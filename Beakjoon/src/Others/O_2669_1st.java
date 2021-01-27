package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class O_2669_1st { // 어마어마하게 길지만 통과 ! 14540KB	132ms
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int[][] input = new int[4][4];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < 4; i++) { // input을 int[][]로 만들기 
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 4; j++) {
				input[i][j] = Integer.parseInt(st.nextToken());
				if(input[i][j] < min) min = input[i][j];
				if(input[i][j] > max) max = input[i][j];	
			}
		}
		
//		System.out.printf("max : %d / min : %d \n", max, min);
		
		int gap = max-min;
		
		boolean[][] occupied = new boolean[gap][gap];
		
		for(int i = 0; i < gap; i++) {
			for(int j = 0; j < gap; j++) {
				if(occupied[i][j] == true) continue;
				
				for(int k = 0; k < 4; k++) {
					//인덱스와 실제 숫자간의 차이 때문에 +1해준다
					boolean x = input[k][0] < i+min+1 && i+min+1 <= input[k][2];
					boolean y = input[k][1] < j+min+1 && j+min+1 <= input[k][3];
					
					if(x && y) {
//						System.out.printf("x : %d / y : %d \n", i+min, j+min);
						occupied[i][j] = true;
						break;
					}
				}
			}
		}
		
		int cnt = 0;
		for(boolean[] arr : occupied) {
			for(boolean b : arr) {
				if(b) cnt++;
			}
		}
		
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		
		br.close();
		bw.close();
	}
	
}

/*

boolean[][]을 만들어서  x,y가 주어진 직사각형의 범위에 들어갈 때 true로 바꾸고 
for문으로 true의 갯수를 세주면 될 것 같다.


*/
