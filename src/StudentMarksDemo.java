import java.util.HashMap;
import java.util.Map;

public class StudentMarksDemo {
    public static void main(String[] args){
        Map<Integer, Integer>  studentRecords = new HashMap<>();

        // Adding employee records using put() method
        studentRecords.put(111, 56);
        studentRecords.put(222, 88);
        studentRecords.put(333, 91);
        studentRecords.put(444, 87);
        studentRecords.put(555, 76);

        //Displaying all elements in the HashMap using for each
        System.out.println("Student Records:");
        for(Map.Entry<Integer, Integer> n :studentRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "marks:" +  n.getValue());
        }

        //Displaying the mark of one specific student
        System.out.println(studentRecords.get(555));

        //checking whether one student ID exists
        System.out.println(studentRecords.containsKey(222));

        //Updating the mark of one student using put()
        studentRecords.put(555, 91);

        //Displaying all elements in the HashMap using for each after updating
        System.out.println("Student Records:");
        for(Map.Entry<Integer, Integer> n :studentRecords.entrySet()){
            System.out.println("ID:" + n.getKey() + " " + "marks:" +  n.getValue());
        }

        // Removing one student record using remove()
       studentRecords.remove(444);

        //Displaying all elements in the HashMap using for each after removing
        System.out.println(studentRecords);

        // Displaying total number of student records using size()
        System.out.println("Total number of students: " + studentRecords.size());







    }
}
