package Cote_1008;

public class Beauty {

	public static void main(String[] args) {
		String s = "baby"; // 9
//		String s = "abbca"; //3
//		String s = "oo" // 0
		
		long answer = -1;
		long beauty = 0;
		
		char[] temp = s.toCharArray();
		
//		Arrays.sort(temp);
		
		for(int i = 0; i < temp.length; i++) {
			int b = 0;
			for(int j = i; j < temp.length; j++) {
				if(temp[i] == temp[j]) {
					
					System.out.println(0);
					b = 0;
				}else {
					if(b < j - i) {
						System.out.println(j - i);
						b = (j-i);
					}
				}
			}
			beauty += b;
		}
		
		
		
		System.out.println(beauty);
	}

}
