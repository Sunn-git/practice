package Arcade;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Intro49_lineEncoding_1st { 
	public static void main(String[] args) {
		Intro49_lineEncoding_1st thisClass = new Intro49_lineEncoding_1st();
		
		
	}
	
	String lineEncoding(String s) {
	    String result = "";
	    int cnt = 1;
	    char c = s.charAt(0);
	    
	    for(int i = 1; i < s.length(); i++){
	        if(s.charAt(i) != c){
	            result = result.concat((cnt == 1)? "" : String.valueOf(cnt)).concat(String.valueOf(c));
	            c = s.charAt(i);
	            cnt = 1;
	        }else{
	            cnt++;
	        }
	        
	        if(i == s.length()-1){ // 이렇게 처리를 안하고 s += " ";처럼 마지막에 공백을 덧붙여서 처리해줘도 된다
	            result = result.concat((cnt == 1)? "" : String.valueOf(cnt)).concat(String.valueOf(c));                
	        }
	    }
	    
	    return result;
	}
	
//	pixelstorm's solution
	String lineEncoding_others(String s) {
	    Matcher m = Pattern.compile("([a-z])\\1*").matcher(s);
	    String result = "";
	    while(m.find()){
	        int len = m.group(0).length();
	        char cha = m.group(0).charAt(0);
	        result += (len==1?"":len) + "" + cha;
	    }
	    return result;
	    
    /*
	Matcher 클래스는 처음본다
	https://coding-factory.tistory.com/529
	
	*/
	}

	
}

/*



*/