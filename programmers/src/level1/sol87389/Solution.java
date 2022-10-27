package level1.sol87389;

// 나머지가 1이 되는 수 찾기
public class Solution {
	public int solution(int n) {
		int divisorX = 2;

		while (true) {
			if (n % divisorX != 1) {
				divisorX++;
				continue;
			}
			break;
		}
		return divisorX;
	}
}
