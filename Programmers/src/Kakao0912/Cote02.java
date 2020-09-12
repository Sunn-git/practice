package Kakao0912;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Cote02 {

	public static void main(String[] args) {

		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		
		String[] answer = {};
		
		HashMap<String, Integer> orderCnt = new HashMap<String, Integer>();
		
		for(int i = 0; i < orders.length; i++) {
			for(int j = 0; j < orders[i].length(); j++) {
				String s = Character.toString(orders[i].charAt(j));
				int value = 0;
				orderCnt.put(s,
							 value = (orderCnt.get(s) != null) ?
								orderCnt.get(s)+1 : 1
								);
			}
		}
		
		Object[] keys = orderCnt.keySet().toArray();
		
		for(Object o : keys) {
			if(orderCnt.get(o) < 2) orderCnt.remove(o);
		}
		
		keys = orderCnt.keySet().toArray();
		
		for(Object o : keys) {
			System.out.printf("%s : %d\n", o,orderCnt.get(o));
		}
		
		
		
//		System.out.println(answer);
	}

}
