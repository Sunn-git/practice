package MrKim;

public class MrKim_2nd {
	  public String solution(String[] seoul) {
	      String answer = "";
	      int index = 0;
	      
	      for(String name : seoul){
	          if( name.equals("Kim")){
					answer = "�輭���� "+index+"�� �ִ�";
	              break;
	          }
	          index++;
	      } 
	      return answer;
	  }

}
