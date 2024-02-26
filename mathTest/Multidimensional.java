package mathTest;

import java.util.Scanner;

public class Multidimensional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 반들의 평균 점수를 구하시오");
        System.out.println("1반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int studentsNum1 = sc.nextInt();
        int[] scores1 = new int[studentsNum1];
        int avg1 = 0;

        for (int i = 0; i < studentsNum1; i++) {
            System.out.println("1반 학생의 점수를 입력해주세요:");
            scores1[i] = (int)(Math.random() * 100);
            avg1 = avg1 + scores1[i];
        }

        int avgScore1 = avg1/studentsNum1;

        System.out.println("2반에서 시험에 응시한 학생 수는 몇 명입니까?");
        int studentsNum2 = sc.nextInt();
        int[] scores2 = new int[studentsNum2];
        int avg2 = 0;

        for (int i = 0; i < studentsNum2; i++) {
            System.out.println("2반 학생의 점수를 입력해주세요:");
            scores2[i] = (int)(Math.random() * 100);
            avg2 = avg2 + scores2[i];
        }

        int avgScore2 = avg2/studentsNum2;
        int avg = (avgScore1 + avgScore2)/2;

        int maxscore1 = scores1[0];
        for (int i = 1; i < studentsNum1; i++) {
            if (scores1[i] > maxscore1) {
                maxscore1 = scores1[i];
            }
        }
        int maxscore2 = scores2[0];
        for (int i = 1; i < studentsNum2; i++) {
            if (scores2[i] > maxscore2) {
                maxscore2 = scores2[i];
            }
        }
        System.out.println("1반의 평균 점수: " + avgScore1 + "점이고, 1반의 1등 점수는 " + maxscore1 + "점 입니다.");
        System.out.println("2반의 평균 점수: " + avgScore2 + "점이고, 2반의 1등 점수는 " + maxscore2 + "점 입니다.");
        System.out.println("두 반의 평균 점수: " + avg + "점");
    }
}