import entity.Book;
import entity.BookType;
import service.BookService;
import util.HibernateUtils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book book1 = new Book();
        book1.setTitle("Hobbit");
        book1.setAuthor("Tolkien");
        book1.setBookType(BookType.FANTASY);
        book1.setPublished(LocalDate.of(1950, 1 ,12));

        Book book2 = new Book();
        book2.setTitle("Krzyżacy");
        book2.setAuthor("Sienkiewicz");
        book2.setBookType(BookType.THRILLER);
        book2.setPublished(LocalDate.of(1892, 4,12));

        Book book3 = new Book();
        book3.setTitle("Harry Potter");
        book3.setAuthor("Rowling");
        book3.setBookType(BookType.FANTASY);
        book3.setPublished(LocalDate.of(2002, 12 ,1));

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        book3.setTitle("Harry Potter i Kamień");
        bookService.editBook(book3);


    }
}
