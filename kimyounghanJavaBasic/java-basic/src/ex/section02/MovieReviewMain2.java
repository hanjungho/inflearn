package ex.section02;

public class MovieReviewMain2 {

    public static void main(String[] args) {
        MovieReview avengers = new MovieReview();
        avengers.title = "avengers";
        avengers.review = "good";

        MovieReview ironMan = new MovieReview();
        ironMan.title = "ironMan";
        ironMan.review = "great";

        MovieReview[] movieReviews = new MovieReview[2];
        movieReviews[0] = avengers;
        movieReviews[1] = ironMan;

        for (MovieReview movieReview : movieReviews) {
            System.out.println("movieReview.title = " + movieReview.title + "\nmovieReview.review = " + movieReview.review);
        }
    }
}

