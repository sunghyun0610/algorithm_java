package my.library;

public abstract class Book {
    protected String author;
    protected String title;

    public abstract void printInfo();

    public Book(String author, String title) {
        this.title=title;
        this.author=author;
    }


    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
