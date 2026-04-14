import java.util.HashMap;
import java.util.Map;

public class EmployeeGetDemo {
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

        // Displaying the first employee name
        int searchId1 = 111;
        String employee1 = employeeRecords.get(111);
        System.out.println("Employee name for "  + searchId1 + ":"+ employee1);

        // Displaying the second employee name
        int searchId2 = 222;
        String employee2 = employeeRecords.get(222);
        System.out.println("Employee name for "  + searchId2 + ":"+ employee2);


    }
}
