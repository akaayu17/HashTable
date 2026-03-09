import java.sql.SQLOutput;
import java.util.HashMap;

public class HashTable {
static HashMap<String,Integer> userToUserId=new HashMap<>();
public static void main(String [] args){
userToUserId.put("aayu",2);
    System.out.println("is aayu there?"+checkAvailabilty("aayu"));

}
public static boolean checkAvailabilty(String username){
return userToUserId.containsKey("aayu");
}
}
