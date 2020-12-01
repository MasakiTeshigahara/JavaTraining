package algorithm;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm {
	public static void main(String[] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

       String input = br.readLine();
       //入力値の間に空白を挟む
       String[] param = input.split("");
       //num1に１つ目のパラメータを代入
       int num1 = Integer.parseInt(param[0]);
       //num1に２つ目のパラメータを代入
       int num2 = Integer.parseInt(param[1]);

       //num1とnum2を足したものを出力する
       System.out.println(num1 + num2);

    }
}