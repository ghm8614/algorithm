package level1.sol12969;

import java.util.Scanner;

public class Answer01 {

	public static void main(String[] args) {
		Answer01 ans = new Answer01();
		ans.printStar();
	}

	// 변수 사용하지 않기
	public void printStar() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		for (int i = 0; i < b; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
