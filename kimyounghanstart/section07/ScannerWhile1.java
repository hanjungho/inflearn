package inflearn.kimyounghanstart.section07;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(종료: exit): ");

            String str = scanner.nextLine();
            if (str.equals("exit")) {
                break;
            }

            System.out.println("str = " + str);
        }

        scanner.close();
        System.out.println("프로그램 종료");
    }
}
