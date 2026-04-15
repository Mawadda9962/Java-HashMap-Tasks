import java.util.HashMap;
import java.util.Map;

public class CourseTrainerDemo {
    public static void main(String[] args){

        Map<String, String> courseTrainerRecords = new HashMap<>();


        // Adding at least 5 course-trainer records using put()
        courseTrainerRecords.put("Java Programming", "Ahmed Ali");
        courseTrainerRecords.put("Web Development", "Sara Khan");
        courseTrainerRecords.put("Database Systems", "Mohammed Hassan");
        courseTrainerRecords.put("Cyber Security", "Fatima Noor");
        courseTrainerRecords.put("Data Structures", "Omar Saleh");

        // Displaying all elements in the HashMap
        System.out.println("Course and Trainers:");
        System.out.println(courseTrainerRecords);

        //Displaying the trainer of one specific course
        System.out.println(courseTrainerRecords.get("Data Structures"));

        // Checking whether one course name exists
        System.out.println(courseTrainerRecords.containsKey("Java Programming"));

        // Checking whether one course name that dose not exists
        System.out.println(courseTrainerRecords.containsKey("Electronics"));

        // Updating the trainer of one course using put()
        courseTrainerRecords.put("Data Structures", "suhail");

        // Displaying all elements in the HashMap after Updating
        System.out.println("Course and Trainers:");
        System.out.println(courseTrainerRecords);

       //Removing one course record using remove()
        System.out.println(courseTrainerRecords.remove("Data Structures", "Omar Saleh"));

        // Displaying all elements in the HashMap after Updating
        System.out.println("Course and Trainers:");
        System.out.println(courseTrainerRecords);

        System.out.println("Display the total number of records: " + courseTrainerRecords.size());

    }
}
