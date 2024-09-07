
//Create a class named Movie that has three attributes: title, genre, and rating.

public class Movie {
    String title;
    String genre;
    double rating;

    public Movie(String title, String genre, double rating) {
    this.title = title;
    this.genre = genre;
    this.rating = rating;
    }
    public void displayMovieDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println();
    }

}

// Use this class to create different movie objects, each with its own title, genre, and rating.
// Display the details of each movie by accessing these attributes.



public void main() {

    Movie movie1 = new Movie("Die Hard", "Action", 4.5);
    Movie movie2 = new Movie("Christmas Carol", "Comedy", 4.2);
    Movie movie3 = new Movie("The Nightmare Before Christmas", "Animation", 4.8);
    Movie movie4 = new Movie("Stuart Little", "Family", 4.0);

    movie1.displayMovieDetails();
    movie2.displayMovieDetails();
    movie3.displayMovieDetails();
    movie4.displayMovieDetails();
}

