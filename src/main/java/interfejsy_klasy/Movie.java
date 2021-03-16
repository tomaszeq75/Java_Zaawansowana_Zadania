package interfejsy_klasy;

public class Movie {
    private String title, director, genre, publisher;
    private int YearOfRelease;

    public Movie(String title, String director, String genre, String publisher, int yearOfRelease) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.publisher = publisher;
        YearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfRelease() {
        return YearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        YearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", YearOfRelease=" + YearOfRelease +
                '}';
    }
}
