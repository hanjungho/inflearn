package inflearn.kimyounghanstart.section07;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("두 정수를 입력하세요. (종료: 0 0) ");

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            }

            System.out.println("num1 = " + num1 + ", num2 = " + num2);
        }
        scanner.close();
        System.out.println("프로그램 종료");

    }
}
