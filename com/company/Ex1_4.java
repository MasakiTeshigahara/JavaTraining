package com.company;

public class Ex1_4 {
	public static void main(String[] args) {
		/*
		問. 以下の出力イメージとなるように、Priusクラスに必要な処理を定義してください。
		注. mainメソッドの処理内容は改変しないこと。
		出力イメージ:
		This white car is Prius.
		Prius can drive at 80 km.
		A Prius is running.
		A Prius stopped.
		 */
		Prius prius = new Prius();
		System.out.println("This " + prius.color + " car is " + prius.name + ".");
		System.out.println(prius.name + " can drive at " + prius.speed + " km.");
		prius.run();
		prius.stop();

	}

	public static class Prius extends Car {

		// Let's coding.
		public Prius() {
			super("Prius", 80, "White");
		}

		@Override
		public void run() {
			System.out.println("A " + this.name + " is runnig.");
		}

		@Override
		public void stop() {
			System.out.println("A " + this.name + " stopped.");
		}

	}

	public static abstract class Car {
		String name;
		int speed;
		String color;

		public Car(String name, int speed, String color) {
			this.name = name;
			this.speed = speed;
			this.color = color;

		}

		public abstract void run();

		public abstract void stop();

	}
}