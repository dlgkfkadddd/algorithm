package methodTest;

import java.util.Scanner;

public class WhatName {
    static String inputName(Scanner sc) {
        System.out.println("이름");
        return sc.next(); // next() 메소드를 호출하여 입력 받은 문자열을 반환합니다.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체를 생성합니다.
        String name = inputName(sc); // inputName 메소드를 호출하여 이름을 입력 받습니다.
        System.out.println("이름: " + name); // 입력 받은 이름을 출력합니다.
    }
}
