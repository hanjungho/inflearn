package ex.section13.pay0;

import java.util.Objects;
import java.util.Scanner;

public class PayMain0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            String option = scanner.nextLine();
            if (Objects.equals(option, "exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount = Integer.parseInt(scanner.nextLine());
            PayService.processPay(option, amount);
        }
    }
}