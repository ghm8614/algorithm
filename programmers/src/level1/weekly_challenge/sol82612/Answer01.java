package level1.weekly_challenge.sol82612;

// Solution에서 변수 하나 줄이기
public class Answer01 {
	public long solution(int price, int money, int count) {
		long answer = money;

		for (int i = 1; i <= count; i++) {
			answer -= price * i;
		}

		return answer < 0 ? -answer : 0;
	}
}
