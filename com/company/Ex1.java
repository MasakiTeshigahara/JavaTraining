package com.company;

public class Ex1 {

    public static void main(String[] args) {
        //TODO 問1. 標準出力に Hello World と出力してください。
    	System.out.println("Hello World");

        //TODO 問2. 変数 str に 文字列"Hello world"を代入し、標準出力で、Helloのみを出力してください。
    	String str = "Hello world";
    	str = str.substring(0,5);
    	System.out.println(str);

        //TODO 問3. 以下の浮動小数点型の変数PIを、整数型にして標準出力に出力してください。
        double PI = 3.14;
        int constant = (int)PI;
        		System.out.println(constant);

        //TODO 問4. 以下の配列を、for文を使って、偶数番目の要素のみ標準出力で出力してください。
        String[] sweets = {"Anko", "Banana", "Cupcake", "Donut", "Eclair", "Froyo"};
        for(int i=0 ; i<6 ; i++) {
        	if(i % 2 != 0) {
        		String num = sweets[i];
        		System.out.println(num);
        	}
        }
     }


}
