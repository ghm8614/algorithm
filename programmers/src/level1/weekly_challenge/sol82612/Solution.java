package level1.weekly_challenge.sol82612;

// 부족한 금액 계산하기
public class Solution {
	public long solution(int price, int money, int count) {
		long totalPrice = 0;
		
		for (int i = 1; i <= count; i++) {
			totalPrice += price * i;
		}
		if (totalPrice <= money) return 0;
		
		return totalPrice - money;
	}
}
