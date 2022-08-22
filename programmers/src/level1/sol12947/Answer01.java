package level1.sol12947;

// 하샤드 수
public class Answer01 {
	public boolean solution(int x) {
		int sum = 0;
		int num = x;

		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		return x % sum == 0 ? true : false;
	}
}
