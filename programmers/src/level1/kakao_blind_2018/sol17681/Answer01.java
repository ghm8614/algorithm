package level1.kakao_blind_2018.sol17681;

// 출제의도: 비트 논리연산자, String의 format() 메서드
public class Answer01 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			// AND 연산자 (&) : 둘 다 1이어야 1
			// OR 연산자  (|) : 둘 중 하나라도 1이면 1
			result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
		}

		for (int i = 0; i < n; i++) {
			// 빈칸으로 자릿수 채우기
			result[i] = String.format("%" + n + "s", result[i]);
			result[i] = result[i].replaceAll("1", "#");
			result[i] = result[i].replaceAll("0", " ");
		}

		return result;
	}
}
