package mathTest;

import java.util.Scanner;

public class Multidimensional3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("다음 시험에서 두 반의 평균 점수를 구하시오");

            System.out.println("시험에 응시하는 반의 수는 몇입니까?");
            int schoolClass = sc.nextInt();
            int[] avgScores = new int[schoolClass];
            int[] maxScores = new int[schoolClass]; // 각 반의 최고 점수를 저장할 배열

            for (int i = 0; i < schoolClass; i++) {
                System.out.println((i + 1) + "반에서 시험에 응시한 학생 수는 몇 명입니까?");
                int studentsNum = sc.nextInt();
                int[] scores = new int[studentsNum];
                int sum = 0;
                int maxScore = 0; // 각 반의 최고 점수를 저장할 변수

                for (int j = 0; j < studentsNum; j++) {
                    System.out.println((i + 1) + "반 학생의 점수를 입력해주세요:");
                    scores[j] = (int)(Math.random() * 100);
                    sum += scores[j];
                    // 최고 점수 업데이트
                    if (scores[j] > maxScore) {
                        maxScore = scores[j];
                    }
                }
                // 평균 계산 및 저장
                if (studentsNum > 0) {
                    avgScores[i] = sum / studentsNum;
                } else {
                    avgScores[i] = 0;
                }
                maxScores[i] = maxScore; // 최고 점수 저장
                System.out.println((i + 1) + "반의 평균 점수: " + avgScores[i] + "점");
                System.out.println((i + 1) + "반의 최고 점수: " + maxScores[i] + "점");
            }

            // 전체 반의 최고 1등 점수 찾기
            int maxFirstPlaceScore = maxScores[0];
            for (int i = 1; i < maxScores.length; i++) {
                if (maxScores[i] > maxFirstPlaceScore) {
                    maxFirstPlaceScore = maxScores[i];
                }
            }

            System.out.println("전체 반의 최고 1등 점수: " + maxFirstPlaceScore + "점");
        }
    }
