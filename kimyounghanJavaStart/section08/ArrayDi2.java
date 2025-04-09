package inflearn.kimyounghanstart.section08;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2x3 배열
        int[][] arr = new int[2][3];

        // 2x3 배열에 값 넣기
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        // 2x3 배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }
}
