package MockExam;

public class Mock_before {

	class Solution {
	    public int[] solution(int[] answers) {
	        
	        int[] count = new int[3];
	        
	        int[] array1 = new int[answers.length];
	            for(int i = 0; i < answers.length; i++){
	            int j = (i % 5) +1;
	            array1[i] = j;
	            count[0] = (answers[i] == array1[i]) ? count[0]+1 : count[0];
	        }
	        
	        int[] array2 = new int[answers.length];
	            for(int i = 0; i < answers.length; i++){
	                int j = 2;
	                if(i % 2 == 0){
	                    switch( i % 8){
	                        case 2 : j = 1;
	                                break;
	                        case 4 : j = 3;
	                                break;
	                        case 6 : j = 4;
	                                break;
	                        case 0 : j = 5;
	                                break;
	                    }
	                }
	                array2[i] = j;
	                
	            count[1] = (answers[i] == array2[i]) ? count[1]+1 : count[1];
	            }
	        
	        int[] array3 = new int[answers.length];
	            for(int i = 0; i < answers.length; i++){
	                int j = 0;
	                    switch(((i % 2) + (i / 2))){
	                        case 1 : j = 3;
	                                break;
	                        case 2 : j = 1;
	                                break;
	                        case 3 : j = 2;
	                                break;
	                        case 4 : j = 4;
	                                break;
	                        case 5 : j = 5;
	                                break;
	                    }
	                array3[i] = j;
	                
	            count[2] = (answers[i] == array3[i]) ? count[2]+1 : count[2];
	            }

	        int max = 0;
	        int length = 0;
	        for(int i = 0; i < count.length; i++){
	            if(count[i] > max){
	                max = count[i];
	                length = 1;
	            }else if ((count[i] == max) && (max > 0)){
	                length += 1;
	            }
	            
	        }
	        
	        int[] result = new int[length];
	        for(int i = 0; i < length; i++){
	            result[i] = i+1;
	        }
	        
	        
	        
	        
	        
	        
	        
	        return result;
	    }
	}
	
	
}
