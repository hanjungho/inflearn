package inflearn.kimyounghanstart.section08;

public class ArrayDi5 {

    public static void main(String[] args) {
        // 2x3 배열
        int[][] arr = new int[2][3];

        // 2x3 배열에 값 넣기
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = a;
                a++;
            }
        }

        // 2x3 배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }
}
