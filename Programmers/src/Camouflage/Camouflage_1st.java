package Camouflage;

import java.util.HashMap;

public class Camouflage_1st { //(0.09ms, 52.1MB)

	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}
							, {"blue_sunglasses", "eyewear"}
							, {"green_turban", "headgear"}}; //5
		
//		String[][] clothes = {{"crow_mask", "face"}
//		, {"blue_sunglasses", "face"}
//		, {"smoky_makeup", "face"}}; //3
		
        int answer = 1;
        
        HashMap<String, Integer> closet = new HashMap<String, Integer>();
        
        for(int i = 0; i < clothes.length; i++) {
        	if(closet.containsKey(clothes[i][1])) {
        		closet.put(clothes[i][1], closet.get(clothes[i][1])+1);	
        	}else {
        		closet.put(clothes[i][1], 1);	
        	}
        	
        }
        
        Object[] keys = closet.keySet().toArray();
        
        for(Object o : keys) {
        	answer *= (closet.get(o)+1);
        }
        
        
        System.out.println(answer -1);
	}

}
