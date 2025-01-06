public class subString {
    public static String PrintSubString(String str,int si,int en){
        String Substr ="";
        for(int i=si; i<en; i++){
            Substr += str.charAt(i);
        }
        return Substr;
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(PrintSubString(str, 2, 5));
    }
}
