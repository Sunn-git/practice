package Arcade_TheCore;

public class TheCore18_ArrayPacking {
	public static void main(String[] args) {
		TheCore18_ArrayPacking thisClass = new TheCore18_ArrayPacking();
		int[] arr = {24, 85, 0};
		int answer = thisClass.arrayPacking(arr);
		System.out.println(answer);
		
	}
	
	int arrayPacking(int[] a) {
		String result  = "", temp;
		
		for(int i = a.length-1; i >= 0; i--) {
			temp = Integer.toBinaryString(a[i]);
			temp = String.format("%08d", Integer.parseInt(temp));
//			System.out.println(temp);
			result = result.concat(temp);
		}
		
//		System.out.println(result);
		return Integer.parseInt(result, 2);
	}


	
}

/*

처음에는 배열을 정려래줘야 하나 싶었는데
그냥 거꾸로 더하면 되는거였다.

*/