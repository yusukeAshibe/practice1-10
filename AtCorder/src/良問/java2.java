package 良問;

import java.util.Scanner;

public class java2 {
	//	問題概要】
	//	0 と 1 のみから成る 3 桁の番号 s が与えられます。1 が何個含まれるかを求めてください。
	//	【数値例】
	//	1)
	//	　s = "101"
	//	　答え:
	//	2
	//
	//	'1' が 2 個含まれています。

	public static void main(String[] args) {
		System.out.println("三桁の数字入力");

		String num = "0";
		int number = 0;

		try {
			Scanner s = new Scanner(System.in);
			num = s.next();
			number = Integer.parseInt(num);
			System.out.println("三桁の整数：" + number);

			//100の位抽出
			int handred = number / 100;
			System.out.println("100の位：" + handred);
			//10の位抽出
			int ten = (number - handred * 100) / 10;
			System.out.println("10の位：" + ten);
			//1の位抽出
			int one = number - (handred * 100 + ten * 10);
			System.out.println("1の位：" + one);

			//１が何個あるかのカウント変数
			int count = 0;
			if (handred == 1) {
				count++;
			}
			if (ten == 1) {
				count++;
			}
			if (one == 1) {
				count++;
			}
			System.out.println("1が何回出てくるか：" + count);
		} catch (Exception e) {
			System.out.println("数字を入力してください(要再起動)");
		}
		//三桁の整数
		//int number =151;
		//String num = "151";

	}

}
