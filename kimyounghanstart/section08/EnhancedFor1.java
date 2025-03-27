package inflearn.kimyounghanstart.section08;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        // fro-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + ": " + numbers[i]);
        }
    }
}
