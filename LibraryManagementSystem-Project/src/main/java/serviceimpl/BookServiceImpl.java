
package serviceimpl;

import dao.BooksDao;
import daoimpl.BooksDaoImpl;
import java.util.List;
import model.Books;
import service.BookService;

public class BookServiceImpl implements BookService {

     BooksDao bookDao = new BooksDaoImpl();
    
    @Override
    public void addBook(Books book) {
        int result = bookDao.addBook(book);
        if (result > 0) {
            System.out.println("Book added successfully.");
        }            
        else {
            System.out.println("Failed to add book.");
        }    
    }

    @Override
    public boolean issueBook(int bookId) {
        Books book = bookDao.getBookById(bookId);
        if (book != null && book.getQuantity() > 0) {
                  book.setQuantity(book.getQuantity() - 1);
                  bookDao.updateBook(book);   
        return true;
        }
        System.out.println("Book not available.");
        return false;    
    }

    @Override
    
     public void returnBook(int bookId) {
    Books book = bookDao.getBookById(bookId);   // 🔹 fetch by bookId
    if (book != null) {
        book.setQuantity(book.getQuantity() + 1);
        bookDao.updateBook(book);   // 🔹 update quantity
    }
  }    

    @Override
    public List<Books> showAllBooks() {
           return bookDao.getAllBooks();
    }
}
