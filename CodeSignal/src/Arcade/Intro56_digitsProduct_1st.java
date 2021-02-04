package Arcade;

public class Intro56_digitsProduct_1st { 
	public static void main(String[] args) {
		Intro56_digitsProduct_1st thisClass = new Intro56_digitsProduct_1st();
		
		for(int i = 0; i <= 600; i++) {
			thisClass.digitsProduct(i);			
		}
		
	}
	
	int digitsProduct(int product) {
	    if(product == 0) return 10;
	    if(product < 10) return product;
	    
	    String temp = "";
	    for(int i = 9; i > 1; i--) {
	        if(product % i == 0) {
	            temp = i + temp;
	            product /= i++;
	        }
	    }
	    
	    
//	    if(temp.equals("")) {
//	    	System.out.println(product + " :p");	    	
//	    }
//	    if(product != 1) {
//	    	System.out.println(product);
//	    }
//	    System.out.println("========");
	    
	    
	    return (product == 1)? Integer.parseInt(temp) : -1;
	    
	    /*
	     https://greenhelix.tistory.com/124 블로그 참고
	     
	    9부터 2까지 나눠주기 && (product == 1) 이 두가지가 결론내는 포인트.
      	나는 temp가 ""인 경우에 -1을 걸었었는데 히든테스트 두개를 계속 통과하지 못했었다.
      	10이상인 소수를 약수로 가지는 수가 반례였다..........
      	그렇지 그러면 product가 1이어야 모든 약수를 다 구한게 되니까 내가 만든 if문이 틀렸다.
	      
	      
	     */
	}
	
//	int digitsProduct(int product) { 처음에 약수를 구해서 풀려고 했었지만 접근법이 틀렸다.
//		if(product == 0) return 10;
//		if(product == 1) return 1;
//		
//		ArrayList<Integer> arrlist = new ArrayList<Integer>();
//		for(int i = 2; product > 1; i++) {
//			if(product%i == 0) {
//				arrlist.add(i);
//				product /= i--;
//			}
//		}
//		if(arrlist.size() == 1) return -1;
//		
//		
////		System.out.println(arrlist);
//		
//		int multi = 1;	
//		String temp = "";
//		for(int i = arrlist.size()-1; i >= 0; i--) {
//			if(multi*arrlist.get(i) > 9) {
//				temp = multi + temp; 
//				multi = arrlist.get(i);
//			}else {
//				multi *= arrlist.get(i);
//			}
//			
//			if(i == 0) temp = multi + temp;
//		}
//		
//		char[] cArr = temp.toCharArray();
//		Arrays.sort(cArr);
//		
//
//		return Integer.parseInt(String.valueOf(cArr));
//	}

	
}

/*



*/