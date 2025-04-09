package ex.section07;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다.");
        }
        items[itemCount] = item;
        itemCount++;
    }

    void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            int price = item.getTotalPrice();
            totalPrice += price;
            System.out.println("상품명: " + item.getName() + ", 합계: " + price);
        }
        System.out.println("전체 가격 합: " + totalPrice);
    }
}
