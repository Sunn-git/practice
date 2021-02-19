package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class BT_1339_2nd { // 단어 수학
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int[] cnt = new int[26];
		String s;
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i = 0; i < n; i++) {
			s = br.readLine();
			for(int j = 0; j < s.length(); j++) {
				cnt[s.charAt(j)-'A'] += Math.pow(10, s.length()-j-1); //알파벳이 등장한 자릿수에 맞춰 숫자 더해주기
			}
		}
		
		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i] != 0) queue.offer(cnt[i]); 
		}
		
		int num = 10-queue.size(); //작은 수부터 순서대로 나오기 때문에 이렇게 설정한다
		n = 0;
		while(!queue.isEmpty()) {
//			System.out.println(queue.peek() + " + " + num);
			n += queue.poll()*num++; //작은 수부터 순서대로 나오기 때문에 이렇게 설정한다
		}
		
		bw.write(Integer.toString(n));
		bw.flush();
		br.close();
		bw.close();
	}
}


/*

https://www.acmicpc.net/board/view/58966

 10
ABB
BB
BB
BB
BB
BB
BB
BB
BB
BB

 */
