package com.company;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		/*
		問. 任意の3桁の整数(100 ～ 999)を標準入力から受け取り、
		100の位、10の位、1の位の数字を足した数を標準出力してください
		例. 入力: 476
		    出力: 17
		 */
		System.out.println("3桁の整数を入力してください");
		// Let's coding!
		Scanner scanner = new Scanner(System.in);
		//入力した値をstrに代入
		String str = scanner.next();
		//入力した値の間に空白を入れる
		String[] strArray = str.split("");

		//String型をint型に変換
		int first1 = Integer.parseInt(strArray[0]);
		int second1 = Integer.parseInt(strArray[1]);
		int third1 = Integer.parseInt(strArray[2]);

		System.out.println(first1 + second1 + third1);

	}
}