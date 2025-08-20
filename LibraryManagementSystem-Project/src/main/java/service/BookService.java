
package service;

import java.util.List;
import model.Books;

public interface BookService {
    void addBook(Books book);
    boolean issueBook(int bookId);
    void returnBook(int bookId);
    List<Books> showAllBooks();    
}
