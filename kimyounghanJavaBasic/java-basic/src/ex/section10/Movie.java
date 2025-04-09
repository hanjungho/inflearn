package ex.section10;

public class Movie extends Item {
    private final String supervision;
    private final String actor;


    public Movie (String name, int price, String supervision, String actor) {
        super(name, price);
        this.supervision = supervision;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독: " + supervision + ", 배우: " + actor);
    }
}
