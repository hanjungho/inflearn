package inflearn.kimyounghanstart.section04;

public class EvenOddEx {

    public static void main(String[] args) {
        int x = 2;

        String ans = (x % 2 == 1) ? "홀수" : "짝수";
        System.out.println("x = " + x + ", " + ans);
    }
}
