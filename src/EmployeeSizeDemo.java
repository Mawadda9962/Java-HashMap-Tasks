import java.util.HashMap;
import java.util.Map;

public class EmployeeSizeDemo {
    public static void main(String[] args){
        Map<Integer, String> employeeRecords = new HashMap<>();

        // Adding employee records using put() method
        employeeRecords.put(111, "Ahmed");
        employeeRecords.put(222, "Salim");
        employeeRecords.put(333, "Nasser");
        employeeRecords.put(444, "Sara");
        employeeRecords.put(555, "Waleed");

        //Displaying all elements in the HashMap using for each
        System.out.println("Employee Records:");
        for(Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "names:" +  n.getValue());
        }

        //Displaying the total number of employee records
        System.out.println("The total number of employee records" + employeeRecords.size() );

        // Adding one more employee record to the map
        employeeRecords.put(777, "Salima");

        //Displaying the updated HashMap
        System.out.println("Employee Records:");
        for(Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "names:" +  n.getValue());
        }

        //displaying the new total number of employee records
        System.out.println("The total number of employee records" + employeeRecords.size() );

    }
}
