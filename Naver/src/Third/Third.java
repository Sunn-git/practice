package Third;

public class Third {

	public static void main(String[] args) {
//		int numOfOrder = 2; 
//		String[] orderArr = {"B2(RG)", "3(R2(GB))"};
		//BRGRG
		//RGBGBRGBGBRGBGBRGBGBRGBGBRGBGB
		
		int numOfOrder = 3; 
		String[] orderArr = {"3(BR2(R)", "B(RGB(RG))", "1B2R3G"};
		
		String[] result = trans(orderArr);
		
		for(String s : result) {
			System.out.println(s);
		}
	}
	
	private static String[] trans(String[] orderArr) {
		String[] answer = new String[orderArr.length];
		
		for(int i = 0; i < orderArr.length; i++) {
			String s = orderArr[i];
			
			while(s.contains("(")) {
				
				String result = "";
				
				int startI = s.lastIndexOf("(");
				int endI = s.indexOf(")");
				int numI = startI-1;
				
				result += s.substring(0, startI-1);//�պκ�
				
				if(s.charAt(numI) > '0' && s.charAt(numI) <= '9') {
					
					int num = Character.getNumericValue(s.charAt(numI));
					
					for(int j = 0; j < num; j++) {
						result += s.substring(startI+1, endI);
					}
					
				}
				
				if(endI < (s.length()-1)) {
					result += s.substring(endI+1);//�޺κ�
				}

				answer[i] = result;
				
				s = result;
				
			}// while end
			
			
		}
		
		return answer;
	}

}
