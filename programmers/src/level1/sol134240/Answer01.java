package level1.sol134240;

// 불필요한 하드코딩 줄이기
// 변수 선언 개수 줄이기
public class Answer01 {
	public String solution(int[] food) {
		StringBuilder sb = new StringBuilder();

		int length = food.length;
		for (int i = 1; i < length; i++) {
			for (int j = 0; j < food[i] / 2; j++) {
				sb.append(i);
			}
		}

		// 0 붙이고, 뒤집어서 붙이기
		return sb.toString() + "0" + sb.reverse().toString();
	}
}
