package arrayTest;

import java.util.Scanner;

public class ArrayText {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] io ={1,2,3,4,5,6,7,8,9,10};
        System.out.println("io의 길이 = " + io.length);

        for (int i =0; i < io.length; i++){
            System.out.println(io[i]);}


    }
}