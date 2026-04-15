import java.util.HashMap;
import java.util.Map;

public class EmployeeEmptyDemo {
    public static void main(String[] args){
        Map<Integer, String> employeeRecords = new HashMap<>();

        //Checking if the HashMap is empty
        System.out.println(employeeRecords.isEmpty());

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


        //Checking if the HashMap is empty again
        System.out.println(employeeRecords.isEmpty());

        //Removing all employee records
        employeeRecords.clear();

        // Display the HashMap after clearing it
        System.out.println(employeeRecords);

        //Checking if the HashMap is empty after clearing
        System.out.println(employeeRecords.isEmpty());


    }
}
