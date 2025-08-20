
package dao;

import java.util.List;
import model.Books;

public interface BooksDao {
    int addBook(Books book);
    int updateBook(Books book); 
    Books getBookById(int bookId);
    List<Books> getAllBooks();    
}
