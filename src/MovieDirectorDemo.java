import java.util.HashMap;
import java.util.Map;

public class MovieDirectorDemo {
    public static void main(String[] args){
        Map<String, String> movieDirectorRecords = new HashMap<>();

        // Adding at least 5 child-friendly movie-director records using put()
        movieDirectorRecords.put("Toy Story", "John ");
        movieDirectorRecords.put("Frozen", "Chris");
        movieDirectorRecords.put("The Lion King", "Roger");
        movieDirectorRecords.put("Finding Nemo", "Andrew");
        movieDirectorRecords.put("Shrek", "Andrew");

        // Displaying all elements in the HashMap
        System.out.println("Kids Movies and Directors:");
        System.out.println(movieDirectorRecords);

        // Displaying the director of one specific movie
        System.out.println(movieDirectorRecords.get("Toy Story"));

       // checking whether one movie title exists
        System.out.println(movieDirectorRecords.containsKey("Shrek"));

        // checking whether one movie title that dose not exists
        System.out.println(movieDirectorRecords.containsKey("Rebanzel"));

        //Update the director of one movie using put()
        movieDirectorRecords.put("Shrek", "sahul");

        // Displaying all elements in the HashMap after Updating
        System.out.println("Kids Movies and Directors:");
        System.out.println(movieDirectorRecords);

        // Removing one movie record using remove()
        movieDirectorRecords.remove("Shrek", "Andrew");

        // Displaying all elements in the HashMap after removing
        System.out.println("Kids Movies and Directors:");
        System.out.println(movieDirectorRecords);

        //Displaying the total number of records left in the map
        System.out.println(movieDirectorRecords.size());











    }
}
