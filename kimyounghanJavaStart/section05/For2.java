package inflearn.kimyounghanstart.section05;

public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 0; i <= endNum; i++) {
            sum += i;
            System.out.println("i = "+ i + " sum = " + sum);
        }
    }
}
