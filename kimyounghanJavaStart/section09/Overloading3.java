package inflearn.kimyounghanstart.section09;

public class Overloading3 {

    public static void main(String[] args) {
        System.out.println("1:" + sum(10, 20));
        System.out.println("2:" + sum(10.0, 20.0));
    }

    public static int sum(int num1, int num2) {
        System.out.println("1번 호출");
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        System.out.println("2번 호출");
        return num1 + num2;
    }
}
