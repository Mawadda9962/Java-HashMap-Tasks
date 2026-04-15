import java.util.HashMap;
import java.util.Map;

public class ProductPriceDemo {
    public static void main(String[] args){
        Map<String, Double> productRecords = new HashMap<>();

        // Adding at least 5 product records using put()
        productRecords.put("Laptop", 888.50);
        productRecords.put("Phone", 378.99);
        productRecords.put("Tablet", 100.75);
        productRecords.put("Headphones", 22.60);
        productRecords.put("Keyboard", 43.30);

        //Displaying all elements in the HashMap using for each
        System.out.println("product Records:");
        for(Map.Entry<String, Double> n :productRecords.entrySet()){
            System.out.println("Name" + n.getKey() + " " + "price:" +  n.getValue());
        }
       //Displaying the price of one specific product
        System.out.println(productRecords.get("Laptop"));

        //Checking whether one product name exists
        System.out.println(productRecords.containsKey("Tablet"));

        // Updating the price of one product using put()
        productRecords.put("Keyboard", 54.30);

        // Displaying the updated HashMap
        System.out.println(productRecords);

        // deleting one product record
        productRecords.remove("Tablet");

        // Displaying the updated HashMap
        System.out.println(productRecords);

        //displaying the total number of product records left in the map
        System.out.println(productRecords.size());
    }

    }
