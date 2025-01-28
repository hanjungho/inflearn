package inflearn.kimyounghanstart.section04;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollor = 10;
        if (dollor < 0) {
            System.out.println("출력: 잘못된 금액입니다.");
        } else if (dollor == 0) {
            System.out.println("출력: 환전할 금액이 없습니다.");
        } else if (dollor > 0) {
            System.out.println("출력: 환전 금액은 " + 1300 * dollor + "원입니다.");
        }
    }
}
