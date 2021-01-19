package Arcade;

public class Intro15_AddBorder_1st { 
	public static void main(String[] args) {
		String[] picture = {"abc", 
				 			"ded"};
		
		int length = picture.length+2;
	    int stringLength = picture[0].length()+2;
	    String[] result = new String[length];
	    
	    
	    for(int i = 0; i < length; i++){
	        result[i] = "";
	        if(i == 0 || i == length-1){
	            for(int j = 0; j < stringLength; j++){
	                result[i] += "*";
	            }
	        }else{
	            for(int j = 0; j < 3; j++){
	                if(j == 0 || j == 2){
	                    result[i] += "*";
	                }else{
	                    result[i] += picture[i-1];
	                }
	                
	            }
	        }
	    }
		
		for(String s : result) {
			System.out.println(s);
		}
	}
}
