import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo {
    public static void main(String[] args){
        Map<String, String> bookAuthorRecords = new HashMap<>();

        // Adding at least 5 book-author records using put()
        bookAuthorRecords.put("Harry Potter", "mania");
        bookAuthorRecords.put("The Hobbit", "Tolicon");
        bookAuthorRecords.put("1984", "javk");
        bookAuthorRecords.put("Pride and Prejudice", "Jann");
        bookAuthorRecords.put("The Alchemist", "Paulo");

        // Displaying all elements in the HashMap
        System.out.println("Book Titles and Authors:");
        System.out.println(bookAuthorRecords);





    }
}
