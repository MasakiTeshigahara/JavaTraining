package syntax;

public class Syntax2 {
    public static void main(String[] args) throws Exception {
        try{
        	//nameをnullで初期化を行う
            String name = null ;
            //substringメソッドにてnameの0番目から最後までの値を出力する
	        name = name.substring(0);
	        //例外が発生したらスタックトレースを表示する
        }catch(Exception ex){
            ex.printStackTrace();
        }
        try{
        	//String型のvalusesリストに２の要素を代入
            String values[] = new String[2];
            //要素数2のvaluesに"value"を代入
	        values[2] = "value";
	      //例外が発生したらスタックトレースを表示する
        }catch(Exception ex){
            ex.printStackTrace();
        }

        try{
        	//Object型のvalueにString型の"value"を代入
            Object value = "value";
            //String型の"value"をInteger型のnumberに代入
	        Integer number = (Integer)value;
	      //例外が発生したらスタックトレースを表示する
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}


