package Unit_3;

public class BookShelf {
    public static void main(String[] arg){
        Book[] books = new Book[3];
        books[0] = new Book("The Shawshank Redemption", "Stephen King", "Different Seasons", 1982);
        books[1] = new Book("Hamlet", "William Shakespeare", "Nicholas Ling & John Trundell", 1961);
        books[2] = new Book("Macbeth", "William Shakespeare", "Edward Blount & William Jaggard", 1623);
        for(Book currBook : books){
            System.out.println(currBook.toString() +"\n");
        }
    }
}
