package interfejsy_klasy;

public class MovieCreator {
    private String title, director, genre, publisher;
    private int yearOfRelease;

    public MovieCreator withTitle(String title) {
        this.title = title;
        return this;
    }

    public MovieCreator withDirector(String director) {
        this.director = director;
        return this;
    }

    public MovieCreator withGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public MovieCreator withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public MovieCreator withYear(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
        return this;
    }

    public Movie create() {
        return new Movie(title, director, genre, publisher, yearOfRelease);
    }

}
