package 良問;
//【問題概要】

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

//N 個の整数 d[0],d[1],…,d[N−1]d[0],d[1],…,d[N−1] が与えられます。
//この中に何種類の異なる値があるでしょうか？
//(原問題文をかなり意訳していますが、題意はこういうことです)
//
//【制約】
//
//1≤N≤100
//1≤d[i]≤100
//入力値はすべて整数
//【数値例】
//1)
//　N=2
//　Q=3
//　d=(8,10,8,6)
//　答え: 3
//6, 8, 10 の 3 種類です。

public class java7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//まず何枚のカードがあるのか決定しその枚数で配列を作成する.
		System.out.println("N個の数字の入る配列の作成");
		Integer N = s.nextInt();
		System.out.println("配列の中身の入力");
		Integer A[] = new Integer[N];
		for (int i = 0; i < N; i++) {
			A[i] = s.nextInt();
		}

		System.out.println(N +"個の数字の入った配列の中身");
		System.out.println(Arrays.toString(A));

		Set<Integer> IntegerList = new LinkedHashSet<Integer>();

		// 配列の要素を順にLinkedHashSetオブジェクトへ追加（LinkedHashSetを使うと重複が削除できる）
		for (int i = 0; i < A.length; i++) {
			IntegerList.add(A[i]);
		}

		// LinkedHashSetオブジェクトを配列に変換
		Object[] IntegerListAfter = IntegerList.toArray();

		// 重複削除後配列を出力
		System.out.println("重複をなくした配列");
		System.out.println(Arrays.toString(IntegerListAfter));
		System.out.println("重複削除後の配列要素の個数：" + IntegerList.size());

	}

}
