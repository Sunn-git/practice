package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S_11650_1st { // 좌표 정렬하기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		Integer[][] arr = new Integer[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				return (o1[0].equals(o2[0])) ? 
						// Integer를 사용할 때 == 을 쓰면 주소값을 비교하게 된다
						// 값을 비교하기 위해서는 equals를 써줘야한다
							o1[1].compareTo(o2[1]) : o1[0].compareTo(o2[0]);
			}
		});
		
		for(Integer[] I : arr) {
			for(int i : I) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
		}
		
		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
