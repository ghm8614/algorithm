package level1.s_w_coding.sol12977;

// 소수 판별 메서드 수정
public class Answer01 {
	
	public int solution(int[] nums) {
		int sum = 0;
		int prime = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					sum = nums[i] + nums[j] + nums[k];
					if (isPrime(sum))
						prime++;
				}
			}
		}
		return prime;
	}

	// 제곱근까지만 반복문을 돌면된다.
	// 4,6 은 각각 2,3이 곱해져서 만들어지므로,
	// 제곱근 전에 나누어 떨어지는 수가 없으면 소수이다.
	public boolean isPrime(int sum) {
		for (int i = 2; i <= Math.sqrt(sum); i++) {
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
