package kolekcje;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        zadanie_2();
    }

    private static void zadanie_2() {
        Author a1 = new Author("Don", "Brown", "male");
        Author a2 = new Author("Stephen", "King", "male");
        Author a3 = new Author("Jeni", "Rowling", "female");
        Author a4 = new Author("Jon", "Snow", "male");
        Author a5 = new Author("Unknown", "Unknown", "male");
        Author a6 = new Author("Unknown", "Unknown", "female");

        Book b1 = new Book("Harry Potter", 35, 2005, Arrays.asList(a1, a3), Genre.FANTASY);
        Book b2 = new Book("Scarry", 30, 2000, Arrays.asList(a2, a1), Genre.ACTION);
        Book b3 = new Book("Encyklopedia", 40, 1999, Arrays.asList(a4, a5, a6), Genre.CRIME);
        Book b4 = new Book("Encyklopedia", 40, 1999, Arrays.asList(a4, a5, a6), Genre.FANTASY);

        BookService bookService = new BookService();
        bookService.add(b1);
        bookService.add(b2);
        bookService.add(b3);

        System.out.println(bookService.getBooks());
        System.out.println(bookService.getBooksByGenre(Genre.FANTASY));
        System.out.println(bookService.getBooksReleasedBefore(2000));
        System.out.println(bookService.getMostExpensive());
        System.out.println(bookService.getLeastExpensive());
        System.out.println(bookService.getBooksWithAtLeastAuthors(3));
        System.out.println(bookService.getStoredByTile(SortingOrder.ASCENDING));
        System.out.println(bookService.getStoredByTile(SortingOrder.DESCENDING));
        System.out.println(bookService.isBookIn(b1));
        System.out.println(bookService.isBookIn(b4));
        System.out.println(bookService.getBooksByAuthor(a1));
    }

    private static void zadanie_1_ok() {
        SDAArrayListOK<Integer> ints = new SDAArrayListOK<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
//        System.out.println(ints.get(0));

        ints.display();

        System.out.println("removed: " + ints.remove(1));
        System.out.println("removed: " + ints.remove(1));
        ints.display();
    }

    private static void zadanie_1() {

        // nie o to chodziło w tym zadaniu
        SDAArrayList<Integer> ints = new SDAArrayList<>();
        ints.add(77);
        ints.add(11);
        ints.add(99);
        ints.remove(0);
        System.out.println(ints.get(0));
        ints.display();

        SDAArrayList<String> texts = new SDAArrayList<String>();
        texts.add("a77");
        texts.add("a11");
        texts.add("a99");
        texts.display();

        // też działa brak podaego typu
        SDAArrayList texts2 = new SDAArrayList();
        texts2.add("a77");
        texts2.add(true);
        texts2.add(9.0);
        texts2.add(999);
        texts2.display();
    }
}
