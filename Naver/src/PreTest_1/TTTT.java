package PreTest_1;

public class TTTT {
	public static void main(String[] args) {
//		System.out.println(f(5));
		
//		int num = 77;
		
//		String a2 = Integer.toBinaryString(num);
//		String a8 = Integer.toOctalString(num);
//		String a16 = Integer.toHexString(num);
//		
		
//		System.out.println(decimal(num, 8));
		
//		System.out.println(a2);
//		System.out.println(a8);
//		System.out.println(a16);
		
		
//		String str = "�Ųٷ� ����ϱ�";
//		StringBuffer strBuffer = new StringBuffer(str);
//		System.out.println(strBuffer.reverse());
		
//		System.out.println(reverseStr(str));
		
//		String num = "1999999999";
//		System.out.println(digitSum(num));
		
		System.out.println(fibo(7));
		
		
	}
	
	//n���� ������ �� ���ϱ�
	private static int f(int n) {
		if(n <= 1) { // ���������� ������ ���ѹݺ���
			return 1;
		}
		return n * f(n-1);
	}
	
	//���� ��ȯ�ϱ� (9���� ������)
	private static String decimal(int num, int dec) {
		String result = "";
		int x = num;
		
		if( x >= 0 && x < dec) {
			return result += x;
		}
		
		return decimal(x / dec, dec) + Integer.toString(x % dec);
	}
	
	//���ڿ� �Ųٷ� ����ϱ�
	private static String reverseStr(String str) {
		String[] strArr = str.split("");
		
		if(str.length() == 1) {
			return str;
		}
		
		return strArr[str.length()-1] + reverseStr(str.substring(0, str.length()-1));
	}
	
	//���ڿ� �� �ڸ����� �� ���ϱ�
	private static int digitSum(String num) {
		
		if(num.length() == 1) {
			return Integer.parseInt(num);
		}
		
		return (Integer.parseInt(num) % 10) + digitSum(num.substring(0, num.length()-1));
	}
	
	//�Ǻ���ġ ������ n��° �� ���ϱ�
	private static int fibo(int num) {
		
		if(num == 1 || num == 2) {
			return 1;
		}
		
		return fibo(num-1) + fibo(num-2);
	}

	 
}
