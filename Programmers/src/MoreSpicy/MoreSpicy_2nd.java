package MoreSpicy;

import java.util.PriorityQueue;
import java.util.Queue;

public class MoreSpicy_2nd { // 
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;

		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for(int i : scoville) {
			queue.offer(i);
		}
		
//		System.out.println(queue);
//		System.out.println(queue.peek());
		
		int size = 0;
		while(queue.peek() < K) {
			size = queue.size();
			int temp = queue.poll()+queue.poll()*2;
//			if(size == 2 && temp < K) return -1;
			
			queue.offer(temp);
		};
		
		
		System.out.println(scoville.length - size);
	}
}

/*
2nd PriorityQueue 사용. 런타임 에러 4개. 효율성 모두 통과

런타임에러 원인 >> while문 : 아무리 섞어도 K를 넘을 수 없는 경우에 while에 갇히게 된다.
					   길이가 2인데 섞은 결과가 K를 넘기지 못하는 경우 return -1;
					   
					   
정렬이 필요한 문제에 PriorityQueue를 사용하니 엄청 편하다

*/