package Arcade;

import java.math.BigInteger;
import java.util.Arrays;

public class Intro58_messageFromBinaryCode_1st { 
	public static void main(String[] args) {
		Intro58_messageFromBinaryCode_1st thisClass = new Intro58_messageFromBinaryCode_1st();
		
		String code = "010010000110010101101100011011000110111100100001";
		
		thisClass.messageFromBinaryCode(code);
		
	}
	
	String messageFromBinaryCode(String code) {
		String result = "";
		
		while(code.length() > 0) {
			String temp = code.substring(0, (code.length() > 8)? 8 : code.length());
			code = code.substring((code.length() > 8)? 8 : code.length());
			result  += (char) Integer.parseInt(temp, 2);
		}
		
//		System.out.println(result);
		return result;
	}

	
//	helfper's solution
	String messageFromBinaryCode_others(String code) {
	    return new String(new BigInteger(code, 2).toByteArray());
	    /*

	    BigInteger : 숫자의 범위가 무한인 클래스(문자열 형태)
	    https://coding-factory.tistory.com/604

	    Translates the String representation of a BigInteger 
	    in thespecified radix(기수, 밑, 진법의 기준 수) into a BigInteger.

	    */
	}
	
	
//	https://greenhelix.tistory.com/126
	String messageFromBinaryCode_others2(String code) {
		StringBuilder sb = new StringBuilder();
		Arrays.stream(code.split("?<=\\G.{8}"))
			  .forEach(s -> sb.append((char)Integer.parseInt(s,2)));
	    return sb.toString();
	    /*

		"?<=\\G.{8}" :  해당 문자열을 8글자씩 끊는 정규식
						? > 해당 문자열(code)
						\G > 이전 매치의 끝
	    */
	}
}

/*



*/