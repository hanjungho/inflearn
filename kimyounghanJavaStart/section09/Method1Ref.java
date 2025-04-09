package inflearn.kimyounghanstart.section09;

public class Method1Ref {

    public static void main(String[] args) {
        // 계산 1
        int a = 1;
        int b = 2;
        System.out.println("연산 결과1: " + add(a, b));

        // 계산 2
        int x = 10;
        int y = 20;
        System.out.println("연산 결과2: " + add(x, y));
    }

    // add method
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        return a + b;
    }
}
