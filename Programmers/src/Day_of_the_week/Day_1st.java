package Day_of_the_week;

import java.util.Scanner;

public class Day_1st {
	public static void main(String[] args) { // (0.05ms, 69.4MB)
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		String answer = "";
		String[] weeks = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		//5,6,0,1,2,3,4,5,6,0
		int index = 5;
		int countIndex = 0;
		
		
		// 1,3,5,7,8,10,12 : 31일
		// 4,6,9,11 : 30일
		// 2 : 28/29일
		
		//31+29+ 31+30+31+30+31 +31+30+31+30+31
		//1,2  3,4,5,6,7  ,8,9,10,11,12
		
		int[] days = new int[365];
		
		for(int i = 0; i < days.length; i++) {
			days[i] = index++ % 7;
		}
		
		/*
		 a = 1 >> b = 30*0+b+0
		 a = 2 >> 30+1+b = 30*1+1+b
 		 a = 3 >> 30+1+30-1+b = 30*2+b
		 a = 4 >> 30+1+30-1+30+1+b = 30*3+1+b
		 a = 5 >> 30+1+30-1+30+1+30+b = 30*4+1+b
		 a = 6 >> 30+1+30-1+30+1+30+30+1+b = 30*5+2+b
		 a = 7 >> 30+1+30-1+30+1+30+30+1+30+b = 30*6+2+b
		 a = 8 >> 30+1+30-1+30+1+30+30+1+30+30+1+b = 30*7+3+b
		 a = 9 >> 30+1+30-1+30+1+30+30+1+30+30+1+30+1+b = 30*8+4+b
		 a = 10 >> 30+1+30-1+30+1+30+30+1+30+30+1+30+1+30+b = 30*9+4+b
		 a = 11 >> 30+1+30-1+30+1+30+30+1+30+30+1+30+1+30+30+1+b = 30*10+5+b
		 a = 12 >> 30+1+30-1+30+1+30+30+1+30+30+1+30+1+30+30+1+30+b = 30*11+5+b
		 */
		
		switch(a) {
		case 12: countIndex+=30;
		case 11: countIndex+=31;
		case 10: countIndex+=30;
		case 9: countIndex+=31;
		case 8: countIndex+=31;
		case 7: countIndex+=30;
		case 6: countIndex+=31;
		case 5: countIndex+=30;
		case 4: countIndex+=31;
		case 3: countIndex+=29;
		case 2: countIndex+=31;
		case 1:  countIndex+=(b-1);
		}
		
		answer = weeks[days[countIndex]];

		System.out.println(countIndex);
		System.out.println(days[countIndex]);
		System.out.println(answer);
	}
}