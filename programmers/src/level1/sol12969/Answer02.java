package level1.sol12969;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Answer02 {

	public static void main(String[] args) {
		Answer02 ans = new Answer02();
		ans.printStar();
	}

	// 스트림
	public void printStar() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		StringBuilder sb = new StringBuilder();
		IntStream.range(0, a).forEach(s -> sb.append("*"));
		IntStream.range(0, b).forEach(s -> System.out.println(sb.toString()));
	}
}
