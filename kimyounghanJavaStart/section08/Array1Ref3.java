package inflearn.kimyounghanstart.section08;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students = new int[]{100, 90, 80, 70, 60};

        for (int i = 0; i < students.length; i++) {
            System.out.println("students[" + i + "] = " + students[i]);
        }
    }
}
