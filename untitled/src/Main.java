import java.util.ArrayList;

class Movie {
    private String title;
    private int duration;
    private double rating;
    public static int totalMovies = 0;

    public Movie(String title, int duration, double rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
        totalMovies++;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Tên phim: " + title + ", Thời lượng: " + duration + " phút, Đánh giá: " + rating;
    }
}

class Cinema {
    private ArrayList<Movie> movies;

    public Cinema() {
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void showMovies() {
        System.out.println("Danh sách phim trong rạp:");
        for (Movie m : movies) {
            System.out.println(m);
        }
        System.out.println("Tổng số phim: " + Movie.totalMovies);
    }

    public void showLongMovies() {
        System.out.println("Các phim có thời lượng > 120 phút:");
        for (Movie m : movies) {
            if (m.getDuration() > 120) {
                System.out.println(m);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        cinema.addMovie(new Movie("Inception", 148, 8.8));
        cinema.addMovie(new Movie("Spirited Away", 125, 8.6));
        cinema.addMovie(new Movie("Inside Out", 95, 8.2));
        cinema.showMovies();
        cinema.showLongMovies();
    }
}
