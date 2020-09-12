package Kakao0912;

//import java.util.Scanner;

public class Cote01 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
		String new_id = "";
//		"...!@BaT#*..y.abcdefghijklm";
		
        String answer = "";
        
//        String reg3 = ;
		
        new_id = new_id.toLowerCase()
        		.replaceAll("[^a-z0-9-_.]", "")
        		.replaceAll("[.]+", ".")
        		.replaceAll("^[.]", "").replaceAll("[.]$", "");
        
        new_id = (new_id.length() == 0) ? "a" : new_id;
        new_id = (new_id.length() >= 16) ? 
        		new_id.substring(0, 15).replaceAll("[.]$", "") : new_id;
        if(new_id.length() <= 2) {
        	for(int i = new_id.length(); i < 3; i++) {
        		new_id += Character.toString(new_id.charAt(i-1));
        	}
        }
        
        answer = new_id;
        
        
        System.out.println(answer);
	}

}
