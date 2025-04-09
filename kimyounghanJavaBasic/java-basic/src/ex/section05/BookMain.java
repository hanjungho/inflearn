package ex.section05;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("자바", "한정호", 122);
        book.displayInfo();
        Book book1 = new Book("파이썬", "한정호");
        book1.displayInfo();
        Book book2 = new Book();
        book2.displayInfo();
    }
}
