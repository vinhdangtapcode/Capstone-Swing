package Test;
import java.util.List;

import DAO.BookDAO;
import Model.Book;

public class BookDAOTest {
    public static void main(String[] args) {
        BookDAO bookDAO = new BookDAO();
        List<Book> books = bookDAO.getAllBooks();

        if (books.isEmpty()) {
            System.out.println("Không có dữ liệu nào được truy vấn!");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle() + " - " + book.getAuthors() + " - " + book.getPrice());
            }
        }
    }
}