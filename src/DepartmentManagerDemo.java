import java.util.HashMap;
import java.util.Map;

public class DepartmentManagerDemo {
    public static void main(String[] arg){
        Map<String, String> departmentManagerRecords = new HashMap<>();


        // Adding at least 5 department-manager records using put()
        departmentManagerRecords.put("Human Resources", "Aisha");
        departmentManagerRecords.put("Finance", "Omar");
        departmentManagerRecords.put("IT Department", "Sara");
        departmentManagerRecords.put("Marketing", "Yusuf");
        departmentManagerRecords.put("Operations", "Fatima");

        // Displaying all elements in the HashMap
        System.out.println("Departments and Managers:");
        System.out.println(departmentManagerRecords);

        //Displaying the manager of one specific department
        System.out.println(departmentManagerRecords.get("Finance"));

        //checking whether one department name exists
        System.out.println(departmentManagerRecords.containsKey("Marketing"));

        //checking whether one department name dose not exists
        System.out.println(departmentManagerRecords.containsKey("scince"));

        //Updating the manager of one department using put()
        departmentManagerRecords.put("Operations", "nasser");

        // Displaying all elements in the HashMap after Updating
        System.out.println("Departments and Managers:");
        System.out.println(departmentManagerRecords);

        //Removing one department record using remove()
        departmentManagerRecords.remove("Operations", "Fatima");

        // Displaying all elements in the HashMap after removing
        System.out.println("Departments and Managers:");
        System.out.println(departmentManagerRecords);

        //Displaying the total number of records
        System.out.println("Displaying the total number of records: " + departmentManagerRecords.size());




    }
}


