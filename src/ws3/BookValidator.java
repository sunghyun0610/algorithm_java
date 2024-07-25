package ws3;



public final class BookValidator {

    private static final BookValidator bookValidator = new BookValidator();

    public static void isbnValidation(String isbn, Book book)
            throws ISBNNotFoundException {

        if (book == null) {
            throw new ISBNNotFoundException(isbn);
        }
    }

    public static void quantityValidation(int quantity, int stock)
            throws QuantityException {

        if (stock < quantity) {
            throw new QuantityException();
        }
    }

    private BookValidator() {
    }

    public static BookValidator getBookValidator() {
        return bookValidator;
    }
}