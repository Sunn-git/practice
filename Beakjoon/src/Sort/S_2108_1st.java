package Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class S_2108_1st { // 통계학 진행중.. 런타임 에러 이클립스에선 잘 실행되는데 왜지..
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		double avg = 0;
		HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg += arr[i];
			
			int temp = (frequency.containsKey(arr[i]))? frequency.get(arr[i])+1 : 1;
			frequency.put(arr[i], temp);
		}
		
		Integer[] keys = new Integer[frequency.size()];
		frequency.keySet().toArray(keys);
		
		Arrays.sort(keys, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return frequency.get(o2).compareTo(frequency.get(o1));
			}
		});	
		
		int cnt = 0;
		for(int i = 1; i < keys.length; i++) {
			cnt = i;
			if(frequency.get(keys[0]) != frequency.get(keys[i])) break;
		}
		
		int[] freqArr = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			freqArr[i] = keys[i];
		}
		
		Arrays.sort(freqArr);
		int freqInt = (n == 1) ? keys[0] : freqArr[1];		
		avg /= n;
		Arrays.sort(arr);
		
		sb.append(Math.round(avg)).append("\n")
		  .append(arr[n/2]).append("\n")
		  .append(freqInt).append("\n")
		  .append(arr[n-1]-arr[0]).append("\n");
		
		bw.write(sb.toString());			
		bw.flush();
		bw.close();
		br.close();
	}
}
