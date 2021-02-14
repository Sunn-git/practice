package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BT_1405_1st { // 미친로봇
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int[] odds = new int[4];
		for(int i = 0; i < 4; i ++) {
			odds[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean[][] check = new boolean[n*2+1][n*2+1];
		
//		for(int i : odds) {
//			System.out.println(i);
//		}
		
		dfs(n, odds, check, n, n, 0, 1);
		
		bw.write(String.valueOf(percentage*Math.pow(0.01, n)));
		bw.flush();
		br.close();
		bw.close();
	}
	static double percentage = 0;
	
	static void dfs(int n, int[] odds, boolean[][] check, int x, int y, int depth, double percent) {
		if(depth == n && !check[x][y]) {
//				for(boolean[] arr : check) {
//					for(boolean b : arr) {
//						System.out.print(b? "O":"X");
//					}
//					System.out.println();
//				}
			
			System.out.println(percent);
//				System.out.println("==================");
			percentage += percent;
			return;
		}
		
		
		if(!check[x][y]) {
			check[x][y] = true;	

			//동
			if(odds[0] != 0) dfs(n, odds, check, x-1, y, depth+1, percent*odds[0]);	
			//서
			if(odds[1] != 0) dfs(n, odds, check, x+1, y, depth+1, percent*odds[1]);				
			//남
			if(odds[2] != 0) dfs(n, odds, check, x, y-1, depth+1, percent*odds[2]);
			//북
			if(odds[3] != 0) dfs(n, odds, check, x, y+1, depth+1, percent*odds[3]);
			
			check[x][y] = false;
			return; // 여기 return이 있는게 시간이 아주 조금 덜걸린다.
		}
		
		return;
	}
	

}


/*
 
 똑같은 코드를 long으로 계산하면 틀린다.
 long은 정수형! 실수형을 쓰려면 double을 사용해야 한다;;
 근데 왜 이클립스에서는 숫자가 나오지?
 

= 놓친 부분 =
1. 확률이 0인 경우 처리 안함
2. dfs 종료조건에 depth == n만 설정 (내 코드에서 이렇게 설정하면 모든 경우의 수가 다 나옴)
3. return해서 나왔을때 check를 false로 되돌려주는 처리 안함

 */
