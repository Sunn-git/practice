package Printer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Printer_5th { // 다른사람의 풀이 진짜 간단하다..
	public static void main(String[] args) {
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2; //1
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0; //5
		
//		int[] priorities = {3,3,4,2};
//		int location = 3; //4
		
		int answer = 0;
		int l = location;
		
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i : priorities) que.offer(i);
		
		Arrays.sort(priorities); 
		
		int size = priorities.length-1;
		
		
		while(!que.isEmpty()) {
			
//			System.out.println(que);
//			System.out.printf("%d, %d\n", l, answer);

			int i = que.poll();
//			System.out.println("i : "+i);
//			System.out.println(priorities[size - answer]);
			
			if( i == priorities[size - answer]) { 
				// 뽑은 숫자가 que에서 가장 높은 우선순위이며 출력차례인 경우
				// 이렇게 비교하면 일부러 우선순위들의 개수를 따로 셀 필요가 없다...
				answer++;
				l--;
				if(l < 0) break; //내 문서가 출력차례인 경우
				//이런식으로 location만 줄여가도 내 문서의 출력순서를 알 수 있다.
			}else {
				//우선순위가 낮은 문서인 경우
				que.offer(i);
				l--;
				if(l < 0) l = que.size()-1;
			}
//			System.out.println(que);
//			System.out.printf("%d, %d\n", l, answer);
//			System.out.println();
		}
		
		System.out.println(answer);
	}
}
