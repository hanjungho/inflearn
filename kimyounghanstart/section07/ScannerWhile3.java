package inflearn.kimyounghanstart.section07;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        System.out.println("숫자 더하기 (종료: 0) ");
        while (true) {
            System.out.print("숫자를 입력하세요: ");
            double input = scanner.nextDouble();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        scanner.close();
        System.out.println("sum = " + sum);
        System.out.println("프로그램 종료");
    }
}
