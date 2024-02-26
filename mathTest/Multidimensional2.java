package mathTest;

import java.util.Scanner;

public class Multidimensional2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두 반의 평균 점수를 구하시오");

        System.out.println("시험에 응시하는 반의 수는 몇입니까?");
        int schoolClass = sc.nextInt();
        int[] avgScores = new int[schoolClass];

        for (int i = 0; i < schoolClass; i++) {
            System.out.println((i + 1) + "반에서 시험에 응시한 학생 수는 몇 명입니까?");
            int studentsNum = sc.nextInt();
            int[] scores = new int[studentsNum];
            int sum = 0;

            for (int j = 0; j < studentsNum; j++) {
                System.out.println((i + 1) + "반 학생의 점수를 입력해주세요:");
                scores[j] = (int)(Math.random() * 100);
                sum += scores[j];
            }

            if (studentsNum > 0) {
                avgScores[i] = sum / studentsNum;
            } else {
                avgScores[i] = 0;
            }

            System.out.println((i + 1) + "반의 평균 점수: " + avgScores[i] + "점");
        }

        int totalSum = 0;
        if (schoolClass > 0) {
            for (int i = 0; i < avgScores.length; i++) {
                totalSum += avgScores[i];
            }
            int totalAvg = totalSum / schoolClass;
            System.out.println("전체 반의 평균 점수: " + totalAvg + "점");
        } else {
            System.out.println("전체 반의 평균 점수를 계산할 데이터가 없습니다.");
        }
    }
}
