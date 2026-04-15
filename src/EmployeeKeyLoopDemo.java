import java.util.HashMap;
import java.util.Map;

public class EmployeeKeyLoopDemo {
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

        //Displaying records using keySet() and get()
        for(Integer n : employeeRecords.keySet()){
            System.out.println("Employee IDs" + n + " " + "Nsme:" + employeeRecords.get(n) );


        }
        //Adding one more record
        employeeRecords.put(666, "Anfal");

        //Displaying records using keySet() and get() again
        for(Integer n : employeeRecords.keySet()){
            System.out.println("Employee IDs" + n + " " + "Nsme:" + employeeRecords.get(n) );

              }
        }
}
