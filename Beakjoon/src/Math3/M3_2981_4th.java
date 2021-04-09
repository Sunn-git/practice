package Math3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.Arrays;

public class M3_2981_4th { // 검문 완료 !
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer(),
					 sb2 = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] < min) min = arr[i];
		}
		
//		Arrays.sort(arr); // 이걸 썼더니 오히려 시간이 더 오래걸렸다.
//		int gcd = arr[1] - arr[0];
//		for(int i = 2; i < n; i++) {
//			gcd = euclidean(gcd, arr[i]-arr[i-1]);
//		}
		
		int gcd, a, b;
		a = arr[1]-min;
		b = arr[0]-min;
		gcd = (a > b)? euclidean(a, b) : euclidean(b, a);
		
		for(int i = 2; i < arr.length; i++) {
			a = arr[i]-min;
			gcd = (a > gcd)? euclidean(a, gcd) : euclidean(gcd, a);
		}

//		System.out.println(gcd);
		
//		for(int r = min; r >= 0 ; r--) {
//			a = arr[1]-r;
//			b = arr[0]-r;
//			gcd = (a > b)? euclidean(a, b) : euclidean(b, a);
//			
//			for(int i = 2; i < arr.length; i++) {
//				a = arr[i]-r;
//				gcd = (a > gcd)? euclidean(a, gcd) : euclidean(gcd, a);
//			}
//
//			if(r==min) System.out.println(gcd);
//			if(gcd > maxGcd) {
//				maxGcd = gcd;
//			}
//		}
		
		
//		for(int r = 0; r <= arr[0]; r++) {
//			gcd = (arr[1] > arr[0])? euclidean(arr[1]-r, arr[0]-r)
//									: euclidean(arr[0]-r, arr[1]-r);
//			
//			for(int i = 2; i < arr.length; i++) {
//				gcd = (arr[i]-r > gcd)? euclidean(arr[i]-r, gcd)
//										:euclidean(gcd, arr[i]-r);
//			}
//			
//			if(gcd > maxGcd) maxGcd = gcd;
//		}
		
//		for(int i = 2; i <= gcd; i++) { // 여기가 시간을 엄청나게 잡아먹는 부분이었다.
//			if(gcd % i == 0) sb.append(i).append(" ");
//		}
		
		int sqrt = (int)Math.round(Math.sqrt(gcd));
		if(sqrt == Math.sqrt(gcd)) { // 제곱인 경우 한번만 더해주기
			sb2.append(sqrt).append(" ");
			sqrt--;
		}
		
		for(int i = sqrt; i > 1; i--) {
			if(gcd % i == 0) {
				sb.insert(0, " ").insert(0, i);
				sb2.append(gcd/i).append(" ");
			}
		}
		sb.append(sb2).append(gcd);
		
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static int euclidean(int a, int b) { // 유클리드 호제법으로 최대공약수 구하기(몫)
		if(b == 0) return a;
		int r = a % b;
		
		return euclidean(b, r);
	}
}

/*

계속 4퍼 8퍼에서 시간초과가 났었다.

나머지의 범위가 0 ~ 가장 작은 수 였는데
나머지를 최대로 설정할 때의 최대공약수가 가장 큰 것 같아서
(생각해보니 이렇게 설정해야 가장 작은 수를 뺀 나머지값들 중에 최대공약수를 구하는 방식이라 
  최대공약수가 가장 커질 수 밖에 없다는걸 깨달았다.)
for문으로 반복문을 돌리던걸 그냥 나머지가 배열의 가장 작은 수 인 경우 하나만 돌렸더니 바로 통과됐다 !!!

나는   Arrays.sort가 시간을 많이 잡아먹는다고 생각했는데 다른사람 풀이를 보니 그건 아닌 것 같다.

유클리드 재귀를 반복문으로 바꾸면 시간이 약간 더 오래걸린다.

최대공약수가 엄청나게 커질 수 있었던 것 같다.
sb에 출력내용을 더하는 for문을 수정했더니 1516ms에서 128ms로 시간이 열배 넘게 단축됐다.


*/
