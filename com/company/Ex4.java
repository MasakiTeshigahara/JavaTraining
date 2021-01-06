package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        /*
        問. ３つの整数を標準入力で受け取り、"どれか一つ" が0より大きかったらtrue
            どれも0より小さければfalse となるようなプログラムを書いてください。
         例. 入力: 1 0 -1
             出力: true
             入力: 1 1 1
             出力: false
         */
        System.out.println("３つの数字を入力してください 数字はそれぞれスペースで区切ること。");
        Scanner scanner = new Scanner(System.in);

        // Let's coding!! 
        //入力した値の1番目の値をnum1に代入       
        int num1 = scanner.nextInt();
        //入力した値の2番目の値をnum2に代入
        int num2 = scanner.nextInt();
        //入力した値の3番目の値をnum3に代入
        int num3 = scanner.nextInt();

        if(num1 >= 0 && num2 <= 0 && num3 <= 0){
            System.out.println(true);
        }
            else if(num1 <= 0 && num2 >= 0 && num3 <= 0){
                System.out.println(true);
            }
            else if(num1 <= 0 && num2 <= 0 && num3 >= 0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
    }
}