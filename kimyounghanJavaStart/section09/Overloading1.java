package inflearn.kimyounghanstart.section09;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1:" + sum(10, 20));
        System.out.println("2:" + sum(10, 20, 30));
    }

    public static int sum(int num1, int num2) {
        System.out.println("1번 호출");
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        System.out.println("2번 호출");
        return num1 + num2 + num3;
    }
}
