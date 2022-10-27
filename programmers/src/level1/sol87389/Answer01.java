package level1.sol87389;

// Solution과 동일하지만, 더 간단한 방법
public class Answer01 {
	public int solution(int n) {
		int divisorX = 2;

		// 나머지가 1이 되는 나눈 수 배열 저장?
		while (true) {
			if (n % divisorX == 1) {
				break;
			}
			divisorX++;
		}
		// 그 중, index 0 출력
		return divisorX;
	}
}
