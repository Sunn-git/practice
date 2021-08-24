package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Adventurers_Guild {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//시작시간 
		long startTime = System.currentTimeMillis(); 

		int n = st.countTokens();
		Queue<Integer> guild = new PriorityQueue<Integer>();
		for(int i = 0; i < n; i++) {
			guild.add(Integer.parseInt(st.nextToken()));
		}
		
		// 결성되는 팀 수, 현재 모인 인원, 모집 인원
		int teams = 0, people = 0, size;
		do {
			size = guild.poll();
			people++;
			
			// 모집 인원을 모두 채운 경우
			if(size == people) {
				teams++;
				people = 0;
				
			} else 
				// 이미 정렬된 상태이기 때문에 이보다 뒤에 나오는 숫자는 모집인원을 채울 수 없다.
				if(size - people > guild.size()) break;
			
		} while(!guild.isEmpty());
		

//		책 답안
//		while(!guild.isEmpty()) {
//			size = guild.poll();
//			people++;
//			
//			if(people >= i) {
//				teams++;
//				people = 0;
//			}
//		}

	
		//완료 시간
		long endTime = System.currentTimeMillis();
		long diffTime = endTime - startTime;
		
		System.out.printf("결과 : %d팀\n", teams);
		System.out.printf("소요시간 : %d ms\n", diffTime);
	}
}
