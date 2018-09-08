package service;

import dao.BookDAO;
import entity.Book;

public class BookService {

    private BookDAO bookDAO = new BookDAO();

    public void addBook(Book book) {
        bookDAO.create(book);
    }

     public void editBook(Book book) {
        bookDAO.update(book);
     }
}
