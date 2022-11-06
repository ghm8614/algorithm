package level1.s_w_coding.sol12977;

// 소수 만들기
public class Solution {
	public int solution(int[] nums) {
		int sum = 0;
		int prime = 0;

		// 배열에서 임의의 세 수를 더한다.
		// 더한 값이 소수인지 아닌지 판별한다.
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					if (isPrime(sum))
						prime++;
				}
			}
		}
		// 소수가 되는 경우의 개수를 구한다.
		return prime;
	}

	// 소수 판별 메서드
	public boolean isPrime(int sum) {
		// 2부터 sum 미만까지 반복문 돌았을때, 나누어 떨어지는 경우가 하나라도 있으면 소수아님.
		for (int i = 2; i < sum; i++) {
			if (sum % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(new int[] { 1, 2, 7, 6, 4 }));
	}
}
