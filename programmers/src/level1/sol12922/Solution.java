package level1.sol12922;

// 수박수박수?
public class Solution {
	public String solution(int n) {

		StringBuilder sb = new StringBuilder();

		int quotient = n / 2;
		int remainder = n % 2;

		// 2로 나눈 몫만큼 "수박" append
		for (int i = 0; i < quotient; i++) {
			sb.append("수박");
		}
		// 2로 나눈 나머지가 1이면 "수" append
		return (remainder == 1) ? sb.append("수").toString() : sb.toString();
	}
}
