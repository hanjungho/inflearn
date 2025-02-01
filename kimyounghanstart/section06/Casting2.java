package inflearn.kimyounghanstart.section06;

public class Casting2 {

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue;
        intValue = (int) doubleValue;
        System.out.println("intValue = " + intValue);
    }
}
