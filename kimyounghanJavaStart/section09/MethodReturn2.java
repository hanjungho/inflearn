package inflearn.kimyounghanstart.section09;

public class MethodReturn2 {

    public static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    public static void checkAge(int age) {
        if(age < 18) {
            System.out.println("청소년입니다");
            return;
        }

        System.out.println("성인입니다");
    }
}
