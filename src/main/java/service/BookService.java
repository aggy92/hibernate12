package service;

import dao.BookDAO;
import entity.Book;

import java.util.List;

public class BookService {

    private BookDAO bookDAO = new BookDAO();

    public void addBook(Book book) {
        bookDAO.create(book);
    }

     public void editBook(Book book) {
        bookDAO.update(book);
     }

     public void deleteBook(Book book) {
        bookDAO.remove(book);
     }

     public void listAllBooks() {
        List<Book> books = bookDAO.findAll();
        books.forEach(System.out::println);
     }

     public void findAndDeleteBooksAfter(int year) {
        List<Book> booksToDelete = bookDAO.findAllPublishedAfter(year);
         System.out.println("Usunę nast. książki: ");

        /* for(Book book : booksToDelete) {
             System.out.println(book);
             bookDAO.remove(book);
         }*/

         booksToDelete.forEach(e -> {
             System.out.println(e);
             bookDAO.remove(e);
         });

     }

     public void listAllAuthorsWithManyBooks() {
        List<Object[]> objects = bookDAO.findAuthorsWithManyBooks();
        objects.forEach(ob -> {
            System.out.println(ob[0] + " -> " + ob[1]);
         });
     }
}
