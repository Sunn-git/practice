package Arcade;

public class Intro11_isLucky_1st { 
	public static void main(String[] args) {
		int n = 1230;
		
		String s = Integer.toString(n);
	    int half = s.length() / 2;
	    
	    int front = 0;
	    int back = 0;
	    
	    for(int i = 0; i < half; i++){
	        front += s.charAt(i) - '0';
	        back += s.charAt(half+i) - '0';
	    }
		
		System.out.println(front == back);
	}
}
