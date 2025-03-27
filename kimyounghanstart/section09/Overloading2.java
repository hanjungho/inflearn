package inflearn.kimyounghanstart.section09;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(3, 3.0);
        myMethod(3.0, 3);
    }

    public static void myMethod(int num1, double num2) {
        System.out.println("myMethod(int num1, double num2) 호출");
    }

    public static void myMethod(double num1, int num2) {
        System.out.println("myMethod(double num1, int num2) 호출");
    }
}
