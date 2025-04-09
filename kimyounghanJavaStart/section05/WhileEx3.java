package inflearn.kimyounghanstart.section05;

public class WhileEx3 {

    public static void main(String[] args) {
        int max = 10;
        int i = 1;
        int sum = 0;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
