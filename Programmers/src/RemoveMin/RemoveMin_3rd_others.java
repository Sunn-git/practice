package RemoveMin;

import java.util.Arrays;

public class RemoveMin_3rd_others {

	public static void main(String[] args) { //(16.75ms, 62.3MB) 코드가 간결한 대신 실행시간이 훨씬 늘어남
		int[] arr = {4,3,2,1};
		
		removeMin(arr);
	}
	
	private static int[] removeMin(int[] arr) {
		
		if(arr.length <= 1) {
			return new int[] {-1}; // 이렇게도 가능한걸 까먹고 있었음;
		}
		
		int min = Arrays.stream(arr).min().getAsInt(); // 최소값을 바로 구하는 방법
		/* stream 관련 링크 
		 * https://futurecreator.github.io/2018/08/26/java-8-streams/
		 * 스트림은 '데이터의 흐름', 배열과 컬렉션을 함수형으로 처리할 수 있게 해준다.
		 */
		
		return Arrays.stream(arr).filter(i -> i != min).toArray();
	}

}
