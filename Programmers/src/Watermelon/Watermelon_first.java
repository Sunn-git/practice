package Watermelon;

import java.util.Scanner;

public class Watermelon_first { //(45.28ms, 78.5MB)
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer = "";
		
		int n = scanner.nextInt();
		
	      if((n % 2) == 0){
	          for(int i = 1; i <= (n / 2); i++){
	              answer +="수박";
	          }
	      } else{
	          for(int i = 1; i <= (n / 2); i++){
	              answer +="수박";
	          } answer += "수";
	      }
	      
	      System.out.println(answer);
		
	}
}
