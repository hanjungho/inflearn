package ex.section04;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;

        RectangleProcedural rectangle = new RectangleProcedural(width, height);

        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}