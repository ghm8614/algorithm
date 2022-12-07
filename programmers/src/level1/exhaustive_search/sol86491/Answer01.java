package level1.exhaustive_search.sol86491;

// Math 클래스의 max() 사용
public class Answer01 {
	public int solution(int[][] sizes) {
		int wMax = 0;
		int hMax = 0;

		for (int[] size : sizes) {
			wMax = Math.max(wMax, Math.max(size[0], size[1]));
			hMax = Math.max(hMax, Math.min(size[0], size[1]));
		}

		return wMax * hMax;
	}
}
