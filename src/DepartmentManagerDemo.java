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
    }
}


