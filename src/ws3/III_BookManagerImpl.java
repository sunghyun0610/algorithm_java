package ws3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class III_BookManagerImpl implements IBookManager {

    private static final Map<String, Book> bookRepository = new HashMap<>();
    private static final III_BookManagerImpl bookManagerImpl = new III_BookManagerImpl();
    private static final BookValidator bookValidator = BookValidator.getBookValidator();

    public static III_BookManagerImpl getInstance() {
        return bookManagerImpl;
    }

    private III_BookManagerImpl() {

    }

    @Override
    public void add(Book book) {
        bookRepository.put(book.getIsbn(),book);
    }

    @Override
    public void remove(String isbn) {
        bookRepository.remove(isbn);
    }

    @Override
    public Book[] getList() {
        return bookRepository.values().toArray(new Book[0]);
    }

    @Override
    public Book searchByIsbn(String isbn) {
        return bookRepository.get(isbn);
    }

//    @Override
//    public Book[] searchByTitle(String title) {
//
//        return (Book[]) bookRepository.values().stream()
//                .filter(b -> b.getTitle().contains(title))
//                .toArray();
//    }

    @Override
    public Book[] searchByTitle(String title) {
        return(Book[]) bookRepository.values().stream()
                .filter(s->s.getTitle().contains(title))
                .toArray();
    }

//    @Override
//    public Book[] searchByTitle(String title) {
//        List<Book> books = new ArrayList<>();
//
//        for (Book book : bookRepository.values()) {
//            if (book.getTitle().contains(title)) {
//                books.add(book);
//            }
//        }
//        return books.toArray(new Book[0]);
//    }

    @Override
    public Magazine[] getMagazines() {
        List<Magazine> magazines = new ArrayList<>();

        for (Book book : bookRepository.values()) {
            if (book instanceof Magazine) {
                magazines.add((Magazine) book);
            }
        }
        return magazines.toArray(new Magazine[0]);
    }

    @Override
    public Book[] getBooks() {
        List<Book> books = new ArrayList<>();

        for (Book book : bookRepository.values()) {
            if (book.getClass()==Book.class) {
                books.add(book);
            }
        }
        return books.toArray(new Book[0]);
    }

    @Override
    public int getTotalPrice() {
        int sum = 0;
        for (Book book : bookRepository.values()) {
            sum += book.getPrice();
        }
        return sum;
    }

    @Override
    public double getPriceAvg() {
        if (bookRepository.size() == 0) {
            return 0;
        }

        int sum = getTotalPrice();

        return (double) sum / bookRepository.size();
    }

    @Override
    public void sell(String isbn, int quantity) throws QuantityException, ISBNNotFoundException {

        int stock = bookRepository.get(isbn).getQuantity();
        Book book = bookRepository.get(isbn);

        bookValidator.isbnValidation(isbn, book);
        bookValidator.quantityValidation(quantity, stock);

        book.setQuantity(stock - quantity);
    }



    @Override
    public void buy(String isbn, int quantity) throws ISBNNotFoundException {
        Book book = bookRepository.get(isbn);

        bookValidator.isbnValidation(isbn, book);

        int stock = book.getQuantity();
        bookRepository.get(isbn).setQuantity(stock + quantity);
    }



}