package level1.sol12943;

// 콜라츠 추측
public class Solution {
	public int solution(int num) {
		if (num == 1)
			return 0;

		// 형변환하지 않을시, int 범위 벗어난다(오버 플로우)
		long number = num;
		int count = 0;

		while (number != 1) {
			if (number % 2 == 0)
				number /= 2;
			else
				number = number * 3 + 1;

			++count;

			if (count == 500)
				return -1;
		}

		return count;
	}
}
