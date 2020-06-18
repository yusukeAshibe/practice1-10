package 良問;

import java.util.Scanner;

public class java4 {

	//	問題概要】
	//	500 円玉を A枚、100 円玉を B 枚、50 円玉を C 枚持っています。これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りあるでしょうか？
	//
	//	【制約】
	//
	//	0≤A,B,C≤500
	//	A+B+C≥1
	//	50≤X≤20000
	//	A,B,C は整数である
	//	X は 50 の倍数である
	//	【数値例】
	//	1)
	//	　A=2
	//	　B=2
	//	　C=2
	//	　X=100
	//	　答え: 2
	//	条件を満たす選び方は以下の 2 通りです。
	//
	//	500 円玉を 0 枚、100 円玉を 1 枚、50 円玉を 0 枚選ぶ
	//	500 円玉を 0 枚、100 円玉を 0 枚、50 円玉を 2 枚選ぶ

	public static void main(String[] args) {



		int A = 0;
		int B = 0;
		int C = 0;
		int X = 0;

		System.out.println("数字を4つ入力してください");
		Scanner s = new Scanner(System.in);
		A = s.nextInt();
		System.out.println("500円: " + A + "枚");
		B = s.nextInt();
		System.out.println("100円: " + B + "枚");
		C = s.nextInt();
		System.out.println("50円: " + C + "枚");
		X = s.nextInt();
		System.out.println("合計金額: " + X + "円");

		//		//500円玉の枚数
		//		if (s.nextInt() < 500) {
		//
		//			System.out.println("500円: " + A + "枚");
		//		} else {
		//			System.out.println("500円玉は500枚以下です。最初からやり直してください。");
		//		}
		//		//100円玉の枚数
		//		if (s.nextInt() < 500) {
		//
		//			System.out.println("100円: " + B + "枚");
		//		} else {
		//			System.out.println("100円玉は500枚以下です。最初からやり直してください。");
		//		}
		//
		//		//50円玉の枚数
		//		if (s.nextInt() < 500) {
		//
		//			System.out.println("50円: " + C + "枚");
		//		} else {
		//			System.out.println("50円玉は500枚以下です。最初からやり直してください。");
		//		}
		//
		//		//調べたい合計金額
		//		if (s.nextInt() > 50 && s.nextInt() < 20000) {
		//
		//			System.out.println("合計金額: " + X + "円");
		//		} else {
		//			System.out.println("合計金額は50円以上20000以下です。最初からやり直してください。");
		//		}

		int ways = 0; //何通りあるか
		int total = 0;//計算された合計金額
		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				for (int k = 0; k <= C; k++) {
					total = (500 * i + 100 * j + 50 * k);
					if (total == X) {
						System.out.println("500円　" + i + "枚" + "：100円" + j + "枚" + "：50円　" + k + "枚");
						ways++;
					}
				}
			}
		}

		System.out.println(ways + "パターン");
	}

}
