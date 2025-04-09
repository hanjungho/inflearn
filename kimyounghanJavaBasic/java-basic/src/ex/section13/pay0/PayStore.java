package ex.section13.pay0;

public abstract class PayStore {

    public static Pay choicePay(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new NoPay();
        }
    }
}
