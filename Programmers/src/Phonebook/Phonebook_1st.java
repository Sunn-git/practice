package Phonebook;

public class Phonebook_1st { // (1.68ms, 55.8MB)

	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		
        boolean answer = true;
        
        loop : for(int i = 0; i < phone_book.length; i++) {
        	for(int j = 0; j < phone_book.length; j++) {
        		
        		if( i != j  && phone_book[j].startsWith(phone_book[i])){
        			answer = false;
        			break loop;
        		}
        		
        	}
        }
        
        System.out.println(answer);

	}
}
