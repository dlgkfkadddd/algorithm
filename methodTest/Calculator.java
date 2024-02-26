package methodTest;

import java.util.Scanner;

//클래스 생성
public class Calculator {
    public static void main(String[] args) {

        //스캐너 인스턴스 생성
        Scanner scanner = new Scanner(System.in);

        //콘솔에 첫번째 숫자 생성
        System.out.println("첫번째 숫자 입력");
        //숫자 입력하는 값의 인스턴스 생성
        String f = scanner.next();
        System.out.println("두번째 숫자 입력");
        String s = scanner.next();
        System.out.println("+ , - , * , / 를 입력");
        //+,- 값을 opcode 변수명으로 정함 변수명은 내가 정하는 것
        String opcode = scanner.next();
        System.out.println("두개의 숫자: " + f + ", " + s);

        int result = 0;
        int intf = Integer.parseInt(f);
        int ints = Integer.parseInt(s);

        if (opcode.equals("+"))
        {result = intf + ints;}
        else if (opcode.equals("-"))
        {result = intf - ints;}
        else if (opcode.equals("*"))
        {result = intf * ints;}
        else if (opcode.equals("/"))
        {result = intf / ints;}
        else System.out.println("계산이 잘못 됨");

        System.out.println("두개의 숫자 결과: " + result);
    }
}