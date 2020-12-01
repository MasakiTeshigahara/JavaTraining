package syntax;

public class Syntax1 {
	public static void main(String[] args) throws Exception{
		//引数の長さを取得し設定数を表示する
		System.out.println("引数は" + args.length + "個設定されています。");
		//引数の長さの回数分だけ以下の処理を繰り返す
		for(int idx = 0 ; idx < args.length; idx ++) {
			//argsのStringリストに格納されているidx番ごと出力する
			System.out.println((idx + 1) + "番目の引数は「" + args[idx] + "」です。");
		}
	}

}
