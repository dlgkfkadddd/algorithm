package arrayTest;

import java.util.Scanner;
public class ArrayText2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("시험을 보는 학생 수는 몇 명입니까?");
        int studentsnum = sc.nextInt();
        int[] score = new int[studentsnum];
        String[] studentsname = new String[studentsnum];

        for (int i = 0; i < studentsnum; i++) {
            System.out.println("학생 이름을 입력해주세요: ");
            studentsname[i] = sc.next();
            System.out.println(studentsname[i] + " 의 점수를 입력해주세요");
            score[i] = sc.nextInt();
        }

        int maxscore = score[0];
        String beststudents = studentsname[0];
        for (int i = 1; i < studentsnum; i++) {
            if (score[i] > maxscore) {
                maxscore = score[i];
                beststudents = studentsname[i];
            }
        }

        System.out.println("1등 학생은 " + beststudents + " 이며, 점수는 " + maxscore + "점 입니다.");
        System.out.println("학생 별 점수는 다음과 같습니다.");
        for (int i = 0; i < studentsnum; i++) {
            System.out.println(studentsname[i] + " 학생은 " + score[i] + "점 입니다.");
        }

        System.out.println("종료 되었습니다.");
    }
}