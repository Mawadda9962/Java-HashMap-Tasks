import java.util.HashMap;
import java.util.Map;

public class EmployeeClearDemo {
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
        //removeing all elements from the map
        System.out.println("The number of employee records: " +employeeRecords.size() );

        //Displaying the HashMap after clearing it
        employeeRecords.clear();
        System.out.println("Employee Records:");
        for(Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "names:" +  n.getValue());
        }

        //Displaying The number of employee records after clearing
        System.out.println("The number of employee records after clearing: " + employeeRecords.size());
    }
}
