import java.util.HashMap;
import java.util.Map;

public class EmployeeCompareUpdateDemo {
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

        //Displaying the current value of one employee ID
        employeeRecords.get(555);

        //Updating that employee name
        employeeRecords.put(555, "Mawadda");

        //showing the new updated value
        employeeRecords.get(555);


        //Displaying the current value of another employee ID
        employeeRecords.get(444);

        //Updating that employee name
        employeeRecords.put(444, "Manal");

        //showing the new updated value
        employeeRecords.get(444);

        //Displaying all elements in the HashMap using for each
        System.out.println("Employee Records:");
        for(Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "names:" +  n.getValue());
        }

    }
}
