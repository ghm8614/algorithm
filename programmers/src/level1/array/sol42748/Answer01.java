package level1.array.sol42748;

import java.util.Arrays;

// java.util.Arrays 클래스 
// copyOfRange() 메서드 사용
public class Answer01 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int startIndex = commands[i][0] - 1;
			int endIndex = commands[i][1];
			int num = commands[i][2] - 1;

			int[] temp = Arrays.copyOfRange(array, startIndex, endIndex);
			Arrays.sort(temp);
			answer[i] = temp[num];
		}

		return answer;
	}
}
