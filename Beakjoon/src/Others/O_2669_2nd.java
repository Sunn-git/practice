package Others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class O_2669_2nd { // 구글링 예시대로 코드 수정 14432KB	132ms
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		boolean[][] occupied = new boolean[101][101];
		int cnt = 0;
		
		for(int i = 0; i < 4; i++) { 
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken()), 
				y1 = Integer.parseInt(st.nextToken()),
				x2 = Integer.parseInt(st.nextToken()),
				y2 = Integer.parseInt(st.nextToken());
			
			for(int x = x1; x < x2; x++) {
				for(int y = y1; y < y2; y++) {
					if(!occupied[x][y]) {
						occupied[x][y] = true;
						cnt++;
					}
				}
			}
		}
		
		bw.write(Integer.toString(cnt));
		bw.flush();
		
		br.close();
		bw.close();
	}
	
}

/*

인터넷에 올라오는 풀이들은 입력값의 최대+1로 이차원 배열을 만들어두고 시작하기 때문에
굳이 최소값과 최대값을 구할 필요가 없다. 그래서 입력값을 가져오는 for문을 돌 때 바로 비교 가능.

*/
