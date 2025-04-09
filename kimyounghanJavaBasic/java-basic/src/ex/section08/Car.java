package ex.section08;

public class Car {
    static int countCar = 0;
    String name;

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름: " + name);
        countCar++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + countCar);
    }


}
