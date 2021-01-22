package Arcade;

public class Intro23_BoxBlur_1st { 
	public static void main(String[] args) {
		Intro23_BoxBlur_1st thisClass = new Intro23_BoxBlur_1st();
		
		int[][] image = {{36,0,18,9}, 
						 {27,54,9,0}, 
						 {81,63,72,45}};
	
		thisClass.boxBlur(image);
	}
	
	int[][] boxBlur(int[][] image) {
		int a = image.length-2; 
	    int b = image[0].length-2; // image[0] 이부분을 설정 안해줘서 한번 실패했었다.
	    
	    int[][] result = new int[a][b];
	    
	    for(int i = 0; i < a; i++){
	        for(int j = 0; j < b; j++){
	            int sum = 0;
	            for(int k = 0; k < 3; k++){
	                for(int l = 0; l < 3; l++){
	                    sum += image[k+i][l+j];
	                }
	            }
	            result[i][j] = sum / 9;
	        }
	    }
	    return result;
	}
}

/*



*/