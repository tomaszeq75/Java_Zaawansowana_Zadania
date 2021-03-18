package kolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private List<Book> books;

    public BookService() {
        this.books = new ArrayList<>();
    }

    public boolean add(Book book) {
        return books.add(book);
    }

    public boolean remove(Book book) {
        return books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> getBooksByGenre(Genre genre) {
        return books.stream().filter(book -> book.getGenre() == genre).collect(Collectors.toList());
    }

    public List<Book> getBooksReleasedBefore(int year) {
        return books.stream().filter(book -> book.getReleaseYear() < year).collect(Collectors.toList());
    }

    public Book getMostExpensive() {
        return books.stream().max(Comparator.comparingDouble(Book::getPrice)).get();
    }

    public Book getLeastExpensive() {
        return books.stream().min(Comparator.comparingDouble(Book::getPrice)).get();
    }

    public List<Book> getBooksWithAtLeastAuthors(int authors) {
        return books.stream().filter(x -> x.getAuthors().size() >= authors).collect(Collectors.toList());
    }

    public List<Book> getStoredByTile(SortingOrder order) {
        if (order == SortingOrder.ASCENDING) {
            Collections.sort(books);
        } else Collections.sort(books, Comparator.reverseOrder());
        return books;
    }

    public boolean isBookIn(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooksByAuthor(Author author) {
        return books.stream().filter(b -> b.getAuthors().contains(author)).collect(Collectors.toList());
    }

}
