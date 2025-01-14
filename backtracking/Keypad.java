public class Keypad {
    final static char[][] keypad={
        {},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };
    public static void letterCombination(String givenString){
        int len = givenString.length();
        if(len == 0){
            System.out.println("null");
            return ;
        }
        recursive_func(0, len, outputString:"",givenString);
    }
    public static void recursive_func(int pos,int len,String outputString,String givenString){
        if(pos == len){
            System.out.println(outputString);
        }
        else{
            char[] letters = keypad[givenString.charAt(pos)-'0'];
            for(int i=0; i<letters.length;i++){
                recursive_func(pos+1, len, outputString+letters[i],givenString);
            }
        }
    }
    public static void main(String[] args) {
        letterCombination("23");
    }
}
