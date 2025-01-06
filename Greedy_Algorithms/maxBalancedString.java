import java.util.*;

public class maxBalancedString {
    public static int Balncedstring(String str){
        int lcount = 0;
        int rcount = 0;
        int ans = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'L'){
                lcount++;
            }else{
                rcount++;
            }
            if(lcount == rcount){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // String str = "LRRRRLLRLLRL";
        // System.out.println("Max substring = "+Balncedstring(str));
        
    }
}
