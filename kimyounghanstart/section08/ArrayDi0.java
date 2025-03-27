package inflearn.kimyounghanstart.section08;

public class ArrayDi0 {

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
        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[0][2] = " + arr[0][2]);

        System.out.println("arr[1][0] = " + arr[1][0]);
        System.out.println("arr[1][1] = " + arr[1][1]);
        System.out.println("arr[1][2] = " + arr[1][2]);
    }
}
