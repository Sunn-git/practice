package Kakao0912;

public class Cote03 { // 효율성 시간초과

	public static void main(String[] args) {
		//개발언어 직군 경력 소울푸드 점수
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		
		int[] answer = new int[query.length];
		
		String[][] splitInfo = new String[info.length][];
		String[][] splitQuery = new String[query.length][];
		
		int[] applicants = new int[info.length];
		
		
		for(int i = 0; i < info.length; i++) {
		 splitInfo[i] = info[i].split(" ");
		}
		
		for(int i = 0; i < query.length; i++) {
			splitQuery[i] = query[i].replace(" and ", " ").split(" ");
		}
		
		
		for(int i = 0; i < query.length; i++) {
			
			
			for(int c = 0; c < info.length; c++) {
				applicants[c] = 1;
				}
			
			for(int j = 0; j < info.length; j++) {
				if(applicants[j] == 0) continue;
				if(Integer.parseInt(splitInfo[j][4]) < Integer.parseInt(splitQuery[i][4])) applicants[j] = 0;
				if(applicants[j] == 0) continue;
				for(int k = 0; k < 4; k++) {
					if(!splitInfo[j][k].equals(splitQuery[i][k])) {
						if(!splitQuery[i][k].equals("-")) applicants[j] = 0;
						if(applicants[j] == 0) break;
					}
				}
			}

			int cnt = 0;
			
			for(int n : applicants) {
				if(n == 1) cnt++;
			}
			
			answer[i] = cnt;
		}
		
		

		for(int r : answer) {
			System.out.println(r);
		}
		
		
		
//		System.out.println(answer);

	}

}
