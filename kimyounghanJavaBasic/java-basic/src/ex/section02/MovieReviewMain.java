package ex.section02;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview avengers = new MovieReview();
        avengers.title = "avengers";
        avengers.review = "good";

        MovieReview ironMan = new MovieReview();
        ironMan.title = "ironMan";
        ironMan.review = "great";

        System.out.println("avengers.title = " + avengers.title + "\navengers.review = " + avengers.review);
        System.out.println("ironMan.title = " + ironMan.title + "\nironMan.review = " + ironMan.review);
    }
}

