import java.util.*;
public class FindTicket {
    public static String getStart(HashMap<String, String> ticket){
        HashMap<String , String > revMap = new HashMap<>();

        for(String key : ticket.keySet()){
            revMap.put(ticket.get(key), key);
        }

        for(String key : ticket.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String ,String > ticket  = new HashMap<>();

        ticket.put("Chennai", "Bengaluru");
        ticket.put("mumbai","delhi");
        ticket.put("goa","chennai");
        ticket.put("delhi","goa");

        String Start = getStart(ticket);
        System.out.print(Start);
        for(String key : ticket.keySet()){
            System.out.print(" -> "+ ticket.get(Start));
            Start = ticket.get(Start);
        }
        System.out.println();
    }
}
