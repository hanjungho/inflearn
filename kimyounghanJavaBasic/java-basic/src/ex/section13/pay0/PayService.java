package ex.section13.pay0;

public abstract class PayService {
    public static void processPay(String option, int amount) {
        boolean result;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" +
                amount);
        Pay pay = PayStore.choicePay(option);
        result = pay.pay(amount);
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}