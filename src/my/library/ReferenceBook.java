package my.library;

public class ReferenceBook extends Book{

    public ReferenceBook(String author, String title){
        super(author,title);
    }
    //이제 ReferenceBoo 객체를 생성할 때 author 와 title 전달가능.
    @Override
    public void printInfo(){
        System.out.println("--- ReferenceBook ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }
}
