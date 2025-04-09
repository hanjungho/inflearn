package ex.section10;

public class Item {
    private final String name;
    private final int price;

    public Item (String name, int price) {
        this.name = name;
        this.price = price;
        int a = Integer.parseInt(name);
    }

    public void print() {
        System.out.println("이름: " + name + ", 가격: " + price);
    }

    public int getPrice() {
        return price;
    }
}
