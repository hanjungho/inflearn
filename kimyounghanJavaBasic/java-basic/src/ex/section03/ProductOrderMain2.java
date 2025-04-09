package ex.section03;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주문수를 입력하세요: ");
        int orderNumber = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[orderNumber];

        for (int i = 0; i < orderNumber; i++) {
            System.out.print("제품명을 입력하세요: ");
            String productName = scanner.nextLine();
            System.out.print("제품가격을 입력하세요: ");
            int price = scanner.nextInt();
            System.out.print("제품수을 입력하세요: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
