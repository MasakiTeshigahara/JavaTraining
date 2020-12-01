package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Algorithm4 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] param = input.split(" ");
		int sum = calc(param,0,param.length - 1);
		System.out.println(sum);
	}

	public static int calc(String[] param, int startIdx, int endIdx){
        int sum = 0 ;
        String type = null ;
        for(int idx = startIdx ; idx < endIdx + 1 ; idx ++){
        	//idxが「＋」または「ー」だった場合
            if(param[idx].equals("+") || param[idx].equals("-")){
            	//idxの値をtypeに代入する
                type = param[idx] ;
                ///idxが「＋」または「ー」ではなく「（」だった場合
            }else if(param[idx].equals("(")){
                int endOfFormula = checkEndOfFormula(param,idx);
                //typeが空ではなかった場合
                if(type != null){
                	//（）の中が「＋」だった場合（）の中の値を足した値をsumに代入する
                    if(type.equals("+")){
                       sum = sum + calc(param, idx + 1 , endOfFormula - 1);
                     //（）の中が「＋」だった場合（）の中の値を引いた値をsumに代入する
                    }else if(type.equals("-")){
                       sum = sum - calc(param, idx + 1 , endOfFormula - 1);
                    }
                }else{
                    sum = calc(param, idx + 1 , endOfFormula - 1);
                }
                idx = endOfFormula;
            }else{
            	//（）がなかった場合の処理
                int num = Integer.parseInt(param[idx]);
                if(type != null){
                    if(type.equals("+")){
                        sum = sum + num;
                    }else if(type.equals("-")){
                        sum = sum - num;
                    }
                }else{
                    sum = num;
                }
            }
        }
        return sum;
    }
		public static int checkEndOfFormula(String[] param, int startIdx){
	        int end = startIdx + 1;
	        int startCount = 0 ;
	        for(int idx = startIdx + 1 ; idx < param.length; idx ++){
	            end = idx ;
	          //idxが「（」だった場合startCountに１を追加する
	            if(param[idx].equals("(")){
	                startCount ++;
	  	          //idxが「（」ではなく「）」だった場合
	            }else if(param[idx].equals(")")){
	            	//startCountが０だったら終了
	                if(startCount == 0){
	                    break;
	                  //startCountを-1する
	                }else{
	                    startCount --;
	                }
	            }
	        }
	        return end;
	    }
	}