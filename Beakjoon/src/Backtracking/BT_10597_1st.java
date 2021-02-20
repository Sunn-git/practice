package Backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BT_10597_1st { // 순열장난
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		for(int i = 1;i < 12;i++) {
			input = input.replaceFirst(String.valueOf(i), i+" ");
			System.out.println(input);
		}
		
		System.out.println("========");
		System.out.println(input);
		
		bw.write(Integer.toString(0));
		bw.flush();
		br.close();
		bw.close();
	}
	
	static void dfs(String input, int depth) {
		
	}
	
	
}


/*

 

 */
