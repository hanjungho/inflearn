package inflearn.kimyounghanstart.section09;

public class MethodValue2 {

    public static void main(String[] args) {
        int number = 5;
        System.out.println("호출 전 number = " + number);
        changeNumber(number);
        System.out.println("호출 후 number = " + number);
    }
    
    public static void changeNumber(int number) {
        System.out.println("변경 전 number = " + number);
        number = number * 2;
        System.out.println("변경 후 number = " + number);
    }
}
