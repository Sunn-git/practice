package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BT_1541_1st { // 잃어버린 괄호
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().split("\\-"), temp;
		int sum = 0, num;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains("+")) {
				num = 0;
				temp = arr[i].split("\\+");
				for(String t : temp) {
					num += Integer.parseInt(t);
				}
				
			}else {
				num = Integer.parseInt(arr[i]);
			}
			
			if(i == 0) num *= -1;
			sum -= num;
		}
		
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}	
}


/*
 
 가정 : -부호 뒤에 등장하는 숫자를 최대로 만들면 총 합을 최소로 만들 수 있다.
 
 < 내가 놓친 부분들 >
 
	String.contains("+") 에는 "\\+"로 하면 안된다
 
 	+부호만 나올 수도 있다.
 	
 	제일 처음 등장하는 숫자는 무조건 양수이다.
 

 */
