import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMapDemo {
    public static void main(String[] args){

        Map<Integer, String> employeeRecords = new HashMap<>();

        // Adding employee records using put() method
        employeeRecords.put(111, "Ahmed");
        employeeRecords.put(222, "Salim");
        employeeRecords.put(333, "Nasser");
        employeeRecords.put(444, "Sara");
        employeeRecords.put(555, "Waleed");

        //Displaying all elements in the HashMap
        System.out.println("Employee Records:");
        for(Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + " " + n.getKey() + " " + "names:" + " " + n.getValue());

        }

        //Adding one more employee record
        employeeRecords.put(666, "Kalid");

        //Displaying all elements in the HashMap after adding one more employee record
        System.out.println("Employee record after adding one more record:");
        for (Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + " " + n.getKey() + " " + "names:" + " " + n.getValue());
        }


    }
}
