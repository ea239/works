package Unit_3;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copyright;
    public Book(String title, String author, String publisher, int copyright){
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.copyright = copyright;
    }

    public String toString(){
        return ("Title:" + title + "\nAuthor:" + author + "\nPublisher:" + publisher + ",\nCopyright year:" +copyright);
    }

}
