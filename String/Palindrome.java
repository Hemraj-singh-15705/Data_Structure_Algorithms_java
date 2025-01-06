public class Palindrome {
    public static boolean checkPalindrome(String str){
        int n = str.length();
        String str2 = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        boolean test = checkPalindrome(str);
        System.out.println(test);
    }
}
