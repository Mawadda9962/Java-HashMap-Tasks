import java.util.HashMap;
import java.util.Map;

public class CountryCapitalDemo {
    public static void main(String[] args){
        Map<String, String> countryCapitalRecords = new HashMap<>();

        // Adding employee records using put() method
        countryCapitalRecords.put("Oman", "Muscat");
        countryCapitalRecords.put("UAE", "Abu Dhabi");
        countryCapitalRecords.put("Saudi Arabia", "Riyadh");
        countryCapitalRecords.put("Egypt", "Cairo");
        countryCapitalRecords.put("Jordan", "Amman");

        //Displaying all elements in the HashMap using for each
        System.out.println("Employee Records:");
        for(Map.Entry<String, String> n :countryCapitalRecords.entrySet()){
            System.out.println("Country Name: " + n.getKey() + " " + "Capital Name: " +  n.getValue());
        }

        //Displaying the capital of one specific country
        System.out.println(countryCapitalRecords.get("Jordan"));

        //checking whether one country name exists
        System.out.println(countryCapitalRecords.containsKey("Oman"));

       // Updating the capital of one country using put()
        countryCapitalRecords.put("Oman", "Sohar");

        // Displaying the updated HashMap
        System.out.println(countryCapitalRecords);

        //deleting one country record
        countryCapitalRecords.remove("Jordan", "Amman");

        // Displaying the updated HashMap again
        System.out.println(countryCapitalRecords);

        //Displaying the total number of records left in the map
        System.out.println("The total number of records Country: " + countryCapitalRecords.size());

    }
}
