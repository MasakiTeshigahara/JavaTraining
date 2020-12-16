package com.company;

public class Ex1_3 {
    public static void main(String[] args) {
        /*
        問. Priusクラスに、Carクラスのrunメソッドをoverrideしたメソッドを定義し、
            以下の出力結果が出力されるように書いてください。
            出力イメージ
            This car is PRIUS
            PRIUS can drive at 80 km
            A Prius is running.
         注. 27～30行目の4行にのみ定義してください。その他のコードの改変、追加は禁止とします。
         */
        Prius prius = new Prius();
        System.out.println("This car is " + prius.name);
        System.out.println(prius.name + " can drive at " + prius.speed + " km");
        prius.run();

    }
    public static class Prius extends Car {
        Prius() {
            this.name = "PRIUS";
            this.speed = 80;
            this.color = "white";
        }

      public void run() {
    	  String carName = "Prius";
    	    System.out.println("A " + carName +" is running.");
      }

    }

    public static abstract class Car {
        String name;
        int speed;
        String color;

        public void run() {
            System.out.println("A car is running.");
        }
    }
}