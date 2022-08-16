package level1.sol12944;

// 평균 구하기
public class Solution {
	public double solution(int[] arr) {
		int size = arr.length;
		double sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum / size;
	}
}
