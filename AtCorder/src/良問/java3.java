package 良問;

import java.util.Arrays;
import java.util.Scanner;

public class java3 {
	//	【問題概要】
	//	黒板に N個の正の整数 A 1,…,A N A1,…,AN
	//	が書かれています。すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます。
	//	黒板に書かれている整数すべてを 2 で割ったものに置き換える。
	//	すぬけ君は最大で何回操作を行うことができるかを求めてください。
	//	【制約 1≤N≤200 1≤A i≤10 9 1≤Ai≤10^9【数値例】1)　N=3  200個まで整数が入る　Aの中の値は10＾9まで（10億）　
	//
	//	　A=(16,12,24)
	//	　答え:2  1回操作を行うと (8, 6, 12) になります。2 回操作を行うと (4, 3, 6) になります。2 個目の 3 が奇数なため 3 回目の操作は行えません。

	public static void main(String[] args) {

		System.out.println("問３　数字を入力してください");

		Scanner s = new Scanner(System.in);
		//まず何枚のカードがあるのか決定しその枚数で配列を作成する.
		Integer N = s.nextInt();
		Integer A[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			A[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(A));


	}
}
