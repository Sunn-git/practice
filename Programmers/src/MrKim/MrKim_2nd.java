package MrKim;

public class MrKim_2nd {
	  public String solution(String[] seoul) {
	      String answer = "";
	      int index = 0;
	      
	      for(String name : seoul){
	          if( name.equals("Kim")){
					answer = "김서방은 "+index+"에 있다";
	              break;
	          }
	          index++;
	      } 
	      return answer;
	  }

}
