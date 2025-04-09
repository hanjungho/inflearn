package inflearn.kimyounghanstart.section08;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3 배열
        int[][] arr = {
            // 2x3 배열에 값 넣기
            {1, 2, 3},
            {4, 5, 6}
        };
        
        // 2x3 배열 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
    }
}
