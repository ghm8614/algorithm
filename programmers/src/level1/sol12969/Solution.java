package level1.sol12969;

import java.util.Scanner;

// 직사각형 별찍기
public class Solution {

	public static void main(String[] args) {
		Solution sol = new Solution();
		sol.printStar();
	}

	public void printStar() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a; i++) {
			sb.append("*");
		}

		for (int i = 0; i < b; i++) {
			System.out.println(sb);
		}
	}
}
