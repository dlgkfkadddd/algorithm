package methodTest;

import java.util.Scanner;

public class HowOld {
    static int inputAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이: ");
        int age = sc.nextInt();
        return age;
    }
    public static void main(String[] args) {
        int age = inputAge();
        System.out.println("나이: " + age);
    }
}
