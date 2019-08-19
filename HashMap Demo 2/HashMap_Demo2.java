import java.util.*;

public class HashMap_Demo2{
    public static void main(String args[]) {
        HashMap < String, Integer > Town_HasMap = new HashMap < String, Integer > ();
        //created a HashMap with (key, value)
        Town_HasMap.put("Parlin", 1);
        Town_HasMap.put("Old Bridge", 2);
        Town_HasMap.put("Freehold", 3);
        Town_HasMap.put("Montvale", 4);
        Town_HasMap.put("Paramus", 5);
        
        
        System.out.println("Does Parlin Exist?");
        //This is an if statement to test if a key exist
        if (Town_HasMap.containsKey("Parlin")) {
         
         System.out.println("Yes it does! The Value is : " + Town_HasMap.get("Parlin"));
        } else {
         
         System.out.println("No it does not!");
        }
      // same thing is going on here (Testing a key exists) in this case it does not
        System.out.println("\nDoes Morganville Exist?");
        if (Town_HasMap.containsKey("Morganville")) {
         System.out.println("Yes it does! " + Town_HasMap.get("Morganville"));
        } else {
         System.out.println("No it does not! Try again");
        }
       }






}