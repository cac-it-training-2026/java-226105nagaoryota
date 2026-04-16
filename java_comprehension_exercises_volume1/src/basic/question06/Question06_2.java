package basic.question06;

import java.io.IOException;

public class Question06_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] studentName = { "かなこ", "ゆうた", "あい", "はるひ", "かずき" };
		int[] count = { 0, 1, 2, 3, 4 };

		for (int i : count) {
			System.out.println(studentName[i]);
		}
	}
}
