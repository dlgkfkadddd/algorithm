package mathTest;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 몇의 구구단을 구하시겠습니까?: ");
        int multiplicationTable = sc.nextInt();

        System.out.println(multiplicationTable + "단의 결과 값입니다.");
        for (int i = 0; i < 10; i++) {
            System.out.println(multiplicationTable + " × " + i + " = " + (multiplicationTable * i));
        }
    }
}