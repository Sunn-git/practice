package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class G_1931_1st { // 회의실 배정
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine()),
			end = 0, mCnt = 0;
		Integer[][] meeting = new Integer[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			meeting[i][0] = Integer.parseInt(st.nextToken());
			meeting[i][1] = Integer.parseInt(st.nextToken());	
		}
		
		Arrays.sort(meeting, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return (o1[1] == o2[1]) ? 
							o1[0].compareTo(o2[0]) : o1[1].compareTo(o2[1]);
			}
		});
		
		
		for(Integer[] a : meeting) { // 정렬된 배열 확인용 출력문
			for(int i : a) {
				System.out.printf("%d ", i);
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < n; i++) {
			if(i == 0 || meeting[i][0] >= end) {
				end = meeting[i][1];
				mCnt++;
			}
		}
		
		bw.write(Integer.toString(mCnt));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
회의 시작시간은 정렬할 때 말고는 쓰지이 않으므로 변수로 설정할 필요가 없다.

 */
