import dao.ClientService;
import entity.Book;
import entity.BookType;
import entity.Client;
import entity.ClientAddress;
import service.BookService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //manageBooks();

        ClientService clientService = new ClientService();

        Client client = new Client();
        client.setName("Jan");
        client.setSurname("Kowalski");

        Client client2 = new Client();
        client2.setName("Marcin");
        client2.setSurname("Nowak");

        ClientAddress clientAddress = new ClientAddress();
        clientAddress.setStreet("Grunwaldzka");
        clientAddress.setHouseNo(55);
        clientAddress.setCity("Gdańsk");
        clientAddress.setCountry("Polska");

        ClientAddress clientAddress2 = new ClientAddress();
        clientAddress2.setStreet("3 maja");
        clientAddress2.setHouseNo(3);
        clientAddress2.setCity("Sopot");
        clientAddress2.setCountry("Polska");

        client.setClientAddress(clientAddress);
        client2.setClientAddress(clientAddress2);

        clientService.addClientWithAddress(client);
        clientService.addClientWithAddress(client2);

    }

    private static void manageBooks() {
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


        Book book4 = new Book();
        book4.setAuthor("Sienkiewicz");
        book4.setTitle("Krzyżacy 3");
        book4.setBookType(BookType.FANTASY);
        book4.setPublished(LocalDate.of(1950, 1 ,12));

        Book book5 = new Book();
        book5.setTitle("Krzyżacy 2");
        book5.setAuthor("Sienkiewicz");
        book5.setBookType(BookType.THRILLER);
        book5.setPublished(LocalDate.of(1892, 4,12));

        Book book6 = new Book();
        book6.setTitle("Harry Potter 2");
        book6.setAuthor("Rowling");
        book6.setBookType(BookType.FANTASY);
        book6.setPublished(LocalDate.of(2002, 12 ,1));

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);
        bookService.addBook(book4);
        bookService.addBook(book5);
        bookService.addBook(book6);
        book3.setTitle("Harry Potter i Kamień");
        bookService.editBook(book3);

       /* Book bookToDelete = new Book();
        bookToDelete.setId(2L);
        bookService.deleteBook(bookToDelete);*/

        //bookService.listAllBooks();

        // bookService.findAndDeleteBooksAfter(2000);

        bookService.listAllAuthorsWithManyBooks();
        bookService.listAllBooksByAuthor("Rowling");
        bookService.listAllBooksByTitle("Krzyżacy");
    }
}
