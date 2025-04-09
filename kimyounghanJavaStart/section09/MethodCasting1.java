package inflearn.kimyounghanstart.section09;

public class MethodCasting1 {

    public static void main(String[] args) {
        double num1 = 1.5;
        printNum((int) num1);
    }

    public static void printNum(int num) {
        System.out.println("num = " + num);
    }
}
