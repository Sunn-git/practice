package Arcade;

public class Intro44_findEmailDomain_1st { 
	public static void main(String[] args) {
		Intro44_findEmailDomain_1st thisClass = new Intro44_findEmailDomain_1st();
		
		System.out.println(thisClass.findEmailDomain("John.Smith@example.com"));
		
	}
	
	String findEmailDomain(String address) {
	    return address.replaceAll(".+@(.+)", "$1");
	}
	
//	jocke93's solution
	String findEmailDomain_others(String address) {
	    int ind = address.lastIndexOf("@");
	    return address.substring(ind+1);
	}
	
//	thucnguyen's solution
	String findEmailDomain_others2(String address) {
	    return address.substring(address.lastIndexOf("@") + 1);
	}
	
//	ben_w6's solution
	String findEmailDomain_others3(String address){
	    return address.replaceAll(".*@", "");
	}

}

/*

간단하지만 다양한 풀이가 나올 수 있는 문제

*/