import java.util.HashMap;
import java.util.Map;

public class EmployeeCheckDemo {
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
        //checking whether a specific employee ID exists
        System.out.println("Employee contains! " + employeeRecords.containsKey(111) );
        System.out.println("Employee contains! " + employeeRecords.containsKey(777) );

        //checking whether a specific employee name exists
        System.out.println("Employee contains! " + employeeRecords.containsValue("Ahmed"));
        System.out.println("Employee contains! " + employeeRecords.containsValue("Samar"));


    }
}
