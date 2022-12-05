package level1.kakao_blind_2018.sol17681;

// [1차] 비밀지도

// 주의! 
// answer 배열에 ""로 초기화하지 않으면, null이 기본값으로 존재하므로,
// answer += "#" 시, null#~ 이 된다. 
public class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] binaryStr1 = new String[n];
		String[] binaryStr2 = new String[n];
		String[] answer = new String[n];

		// 두 int 배열을 2진수 String 배열로 변환
		for (int i = 0; i < arr1.length; i++) {
			binaryStr1[i] = Integer.toBinaryString(arr1[i]);
			binaryStr2[i] = Integer.toBinaryString(arr2[i]);
			
			// 주의!
			answer[i] = "";
		}
		// 두 배열 동시에 반복문 돌면서, 2진수 자릿수 빈칸 0 채우기
		for (int i = 0; i < binaryStr1.length; i++) {
			int length1 = binaryStr1[i].length();
			int length2 = binaryStr2[i].length();
			if (length1 < n) {
				for (int j = 0; j < n - length1; j++) {
					binaryStr1[i] = "0" + binaryStr1[i];
				}
			}
			if (length2 < n) {
				for (int j = 0; j < n - length2; j++) {
					binaryStr2[i] = "0" + binaryStr2[i];
				}
			}
		}
		// System.out.println(Arrays.toString(binaryStr1));
		// System.out.println(Arrays.toString(binaryStr2));

		// 둘 다 0일 경우에만 "#", 그 이외에 전부 "공백"
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!(binaryStr1[i].charAt(j) == '0' && binaryStr2[i].charAt(j) == '0')) {
					answer[i] += "#";
				} else {
					answer[i] += " ";
				}
			}
		}
		// System.out.println(Arrays.toString(answer));

		return answer;
	}

	public static void main(String[] args) {
		String a = "";
		String b = " ";
		String c = null;

		a += "2";
		b += "2";
		c += "2";

		System.out.println(a); //2
		System.out.println(b); // 2
		System.out.println(c); //null2
	}
}
