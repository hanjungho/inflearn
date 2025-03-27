package inflearn.kimyounghanstart.section08;

public class Array1Ref2 {

    public static void main(String[] args) {
        int[] students = new int[5];

        students[0] = 100;
        students[1] = 90;
        students[2] = 80;
        students[3] = 70;
        students[4] = 60;

        for (int i = 0; i < students.length; i++) {
            System.out.println("students[" + i + "] = " + students[i]);
        }
    }
}
