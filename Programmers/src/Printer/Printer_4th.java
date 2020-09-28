package Printer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Printer_4th { // 아니 이게 된다고????? 헐...ㅋㅋㅋㅋㅋ
	public static void main(String[] args) { //(1.75ms, 52.6MB)
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2; //1
		
//		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int location = 0; //5
		
		int[] priorities = {3,3,4,1,2,4,3,5,4,1,2,2,1};
		int location = 4; //8

		
		Queue<Integer[]> printer 
			= new LinkedList<Integer[]>();
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < priorities.length; i++) {
			Integer[] temp = new Integer[2];
			temp[0] = priorities[i];
			temp[1] = (i == location) ? 1 : 0;
			
			printer.offer(temp);
			
			if(map.containsKey(priorities[i])) { // 우선순위(key)와 개수(value) 담기
				map.put(priorities[i], map.get(priorities[i])+1);
			}else {
				map.put(priorities[i], 1);
			}
		}
		
		Object[] keys = map.keySet().toArray(); //우선순위
		
//		for(Object o : keys) {
//			System.out.printf("%d, ", o);
//		}
//		System.out.println();
		
		int index = keys.length; // 큰 숫자부터 
		int answer = 0;
		
		loop : do {
			
			int count = map.get(keys[--index]); // 우선순위의 개수. 
												// 반복문이 돌 때마다 index가 작아짐
			
			while(true) {
				
				Integer[] temp = printer.peek();
				
				if(temp[0] == keys[index]) {
					printer.poll();
					answer++;
					count--;
					
					if(temp[1] == 1) break loop; // 내가 출력하고싶은 문서
					
					if(count == 0) { // 해당 우선순위의 문서가 모두 출력된 경우
						break;
					}
	
				}else {
					printer.offer(printer.poll()); // 더 높은 우선순위의 문서가 있는 경우
				}	
				
			}

			System.out.println("====================");
			for(Integer[] temp : printer) { // 반복문이 돌아갈 때마다 순서가 어떻게 바뀌는지 출력
				System.out.printf("%d, ", temp[0]);
			}
			System.out.println();
			
			
		}while(index > 0);
		
		System.out.println("====================");
		System.out.println(answer);
	}
}
