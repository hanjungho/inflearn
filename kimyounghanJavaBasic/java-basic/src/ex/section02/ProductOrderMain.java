package ex.section02;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder chicken = new ProductOrder();
        chicken.productName = "chicken";
        chicken.price = 20_000;
        chicken.quantity = 2;

        ProductOrder hamburger = new ProductOrder();
        hamburger.productName = "hamburger";
        hamburger.price = 6_000;
        hamburger.quantity = 1;

        ProductOrder[] productOrders = new ProductOrder[] {chicken, hamburger};

        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            int price = productOrder.quantity * productOrder.price;
            System.out.println(productOrder.productName + " " + productOrder.quantity +"개 가격: " + price);
            totalPrice += price;
        }
        System.out.println("총 주문 금액: " + totalPrice);
    }
}
