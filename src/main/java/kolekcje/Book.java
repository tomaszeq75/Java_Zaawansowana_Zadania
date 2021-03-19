package kolekcje;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private double price;
    private int releaseYear;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, double price, int releaseYear, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.releaseYear = releaseYear;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && releaseYear == book.releaseYear && Objects.equals(title, book.title) && Objects.equals(authors, book.authors) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, releaseYear, authors, genre);
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.getTitle());
    }

    @Override
    public String toString() {
        return '[' + title + ':' + price + ':' + releaseYear + ':' + authors + ':' + genre + ']';
    }
}
