package kaupTest;

import java.util.Scanner;
public class kaupMain {

    public static void main(String[] args) {

        int randomHeight = (int)(Math.random() * 51) + 150; // 150~200 사이의 무작위 키
        int randomWeight = (int)(Math.random() * 70) + 30;  // 30~99 사이의 무작위 몸무게

        double heightInMeter = randomHeight / 100.0; //키 입력이 cm로 되었으니까 미터 단위기 맞추기
        double bmi = (int)(Math.round(randomWeight / (heightInMeter * heightInMeter)*100)/100.0);

        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi >= 18.5 && bmi < 23) {
            System.out.println("정상체중");
        } else if (bmi >= 23 && bmi < 25) {
            System.out.println("과체중");
        } else {
            System.out.println("비만");
        }

        System.out.println("키: " + randomHeight + "cm");
        System.out.println("몸무게: " + randomWeight + "kg");
        System.out.println("BMI: " + bmi);
    }
}
