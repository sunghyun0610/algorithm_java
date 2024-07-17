package my.library;

public class GeneralBook extends Book implements Borrowable{

    public GeneralBook(String author, String title){
        super(title,author);
    }

    @Override
    public void printInfo(){
        System.out.println("--- GeneralBook ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }

    @Override
    public void borrow(String memberId, Library library) {
        library.rentalBook(this, memberId);
    }

}
