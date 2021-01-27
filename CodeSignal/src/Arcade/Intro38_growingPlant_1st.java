package Arcade;

public class Intro38_growingPlant_1st { 
	public static void main(String[] args) {
		Intro38_growingPlant_1st thisClass = new Intro38_growingPlant_1st();
		
		int upSpeed = 5;
		int downSpeed = 3;
		int desiredHeight = 10;
		
		System.out.println(thisClass.growingPlant(upSpeed, downSpeed, desiredHeight));
	}
	
	int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
	    int oneDay = upSpeed - downSpeed;
	    if(upSpeed >= desiredHeight) return 1;
	    
//	    return (desiredHeight-downSpeed)/oneDay + (((desiredHeight-downSpeed)%oneDay != 0)? 1 : 0);

	    return (desiredHeight-downSpeed)/oneDay + 1;
	}
	
	
	
//	ben_w6's solution
	int growingPlant_others(int upSpeed, int downSpeed, int desiredHeight)
	{
	    // The height after x days (up - down) * (x - 1) + up
	    // We want dh <= (u - d) * (x - 1) + u
	    // (dh - u) / (u - d) + 1 <= x
	    return Math.max(0, (int) Math.ceil((double) (desiredHeight - upSpeed) / (upSpeed - downSpeed))) + 1;
//	    하루만에  갈 수 있는 거리의 처리를 이렇게 해줄 수 있구나
	}
	
//	bandorthild's solution
	int growingPlant_others2(int u, int d, int h) {
	    return h<=u?1:(int)(h-u-1)/(u-d)+2;
	}
}

/*

백준 달팽이 문제와 똑같다. 근데 다시 푸는데 한참 걸렸음..

*/