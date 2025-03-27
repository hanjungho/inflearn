package inflearn.kimyounghanstart.section07;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String inputString = scanner.nextLine();    // 문자열 입력
        System.out.println("inputString = " + inputString);

        System.out.print("정수를 입력하세요: ");
        int inputInt = scanner.nextInt();    // 정수 입력
        System.out.println("inputInt = " + inputInt);

        System.out.print("실수를 입력하세요: ");
        double inputDouble = scanner.nextDouble();    // 실수 입력
        System.out.println("inputDouble = " + inputDouble);
    }
}
