package javaStudy4;

import java.util.Scanner;

public class Algorithm2 {
	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);

		//入力値の１番目をnum1にする
		int num1 = input.nextInt();
		//入力値の2番目をtypeに代入する
		String type = input.next();
		//入力値の3番目をnum2に代入する
		int num2 = input.nextInt();
		//typeが＋だったらnum1とnum2を足した答え表示する
		if(type.equals("+")){
			System.out.println(num1 + num2);
		//typeがーだったらnum1とnum2を引いた答え表示する
		}else if(type.equals("-")) {
			System.out.println(num1 - num2);
		//typeが＊だったらnum1とnum2をかけた答え表示する
		}else if(type.equals("*")) {
			System.out.println(num1 * num2);
		//typeが/だったらnum1とnum2を割った答えと余りを表示する
		}else if(type.equals("/")) {
			System.out.println(num1 / num2 + "..." + num1 % num2);
		}
	}


}
