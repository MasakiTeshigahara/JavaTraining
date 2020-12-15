package com.company;

public class Ex1_2 {
	public static void main(String[] args) {
        Person person = new Person();
        // 問. 標準出力に、"こんにちは、山田さん"と表示させてください。
        // 注. personインスタンスのnameフィールドを使用すること

        // Let's coding!
    	System.out.println("こんにちは、"+ person.name + "さん");
    }

    static class Person {
        String name;
        Person() {
            this.name = "山田";
        }
    }
}
