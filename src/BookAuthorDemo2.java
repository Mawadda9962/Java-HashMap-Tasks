import java.util.HashMap;
import java.util.Map;

public class BookAuthorDemo2 {
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

        //Display the author of one specific book
        System.out.println(bookAuthorRecords.get("The Alchemist"));

        // checking whether one book title exists
        System.out.println(bookAuthorRecords.containsKey("Harry Potter"));

        // Updateing the author of one book
        bookAuthorRecords.put("The Alchemist", "rashel");

        // Displaying all elements in the HashMap after updated
        System.out.println("Book Titles and Authors:");
        System.out.println(bookAuthorRecords);

        // Deleteing one book record
        bookAuthorRecords.remove("1984", "javk");

        // Displaying all elements in the HashMap after Deleting
        System.out.println("Book Titles and Authors:");
        System.out.println(bookAuthorRecords);

        // Displaying the total number of records
        System.out.println("The total number of records: " + bookAuthorRecords.size());




    }
}
