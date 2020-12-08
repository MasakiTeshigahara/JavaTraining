package com.company;

public class Ex2 {
    public static void main(String[] args) {
        /*TODO 3人の生徒たちの各教科の点数を集計し、教科ごとの平均点を出力してください。
               なお、averageメソッドは使っても使わないくてもかまいません。
               出力結果イメージ
                国語の平均点: 74
                数学の平均点: 68
                理科の平均点: 64
                社会の平均点: 45
         */
        Student taro = new Student("Taro", 80, 70, 55, 23);
        Student hanako = new Student("Hanako", 75, 90, 87, 55);
        Student jiro = new Student("Jiro", 67, 45, 50, 57);

        // Let's coding!
      int[] scores = {80, 75, 67};
      int[] scores1 = {70, 90, 50};
      int[] scores2 = {55, 87, 50};
      int[] scores3 = {23, 55, 57};

    }

    private static int average(int[] scores, int[] scores1, int[] scores2, int[] scores3 ) {
        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }
        for (int i = 0; i < scores1.length; i++) {
            total += scores[i];
        }
        for (int i = 0; i < scores2.length; i++) {
            total += scores[i];
        }
        for (int i = 0; i < scores3.length; i++) {
            total += scores[i];
        }
        return total / scores.length;
    }

    private static class Student {
        String name;       //名前
        int japaneseScore; //国語
        int mathScore;     //数学
        int sienceScore;   //理科
        int socialScore;   //社会

        Student(String name, int jp, int math, int si, int so) {
            this.name = name;
            this.japaneseScore = jp;
            this.mathScore = math;
            this.sienceScore = si;
            this.socialScore = so;

            System.out.println("国語の平均点は:" + jp);
            System.out.println("数学の平均点は:" + math);
            System.out.println("理科の平均点は:" + si);
            System.out.println("社会の平均点は:" + so);
        }

    }
}