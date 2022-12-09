package level1.hash.sol1845;

import java.util.HashSet;
import java.util.Set;

// 포켓몬
// 가져올 수 있는 최대 포켓몬 종류의 개수 구하기
public class Answer01 {
	public int solution(int[] nums) {
		// 가져올 수 있는 포켓몬의 최대 개수는 nums.length/2
		int max = nums.length / 2;

		// 중복 제거해서 포켓몬 종류의 수 구하기
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		// System.out.println(set);

		// 포켓몬 종류의 수가 가져올 수 있는 수보다 많을 시, 가져올 수 있는 포켓몬 수
		// 포켓몬 종류의 수가 가져올 수 있는 수보다 적을 시, 포켓몬 종류의 수
		int size = set.size();
		return (size > max) ? max : size;
	}
}
