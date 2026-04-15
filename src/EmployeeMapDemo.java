import java.util.HashMap;
import java.util.Map;

public class EmployeeMapDemo {
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

        //Displaying the name of one specific employee using the employee ID
        System.out.println(employeeRecords.get(555));

        //checking whether one employee ID exists
        System.out.println(employeeRecords.containsKey(555));


        //checking whether one employee ID dose not exists
        System.out.println(employeeRecords.containsKey(888));

        //Updateing the name of one employee using put()
        employeeRecords.put(555, "saaa");

        //Displaying all elements in the HashMap using for each after Updating
        System.out.println("Employee Records:");
        for(Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "names:" +  n.getValue());
        }


        //Removing one employee record using remove()
        employeeRecords.remove(555, "saaa");

        //Displaying all elements in the HashMap using for each after removing
        System.out.println("Employee Records:");
        for(Map.Entry<Integer, String> n :employeeRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "names:" +  n.getValue());
        }

        System.out.println("The total number of records: " +employeeRecords.size());

    }
}
