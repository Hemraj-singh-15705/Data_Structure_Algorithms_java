public class permutation {
    public static void totalpermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length(); i++){
            char Curr=str.charAt(i);
            String NewStr =str.substring(0,i)+str.substring(i+1);
            totalpermutation(NewStr, ans+Curr);

        }
    }
    public static void main(String[] args) {
        String str ="abc";
    totalpermutation(str, "");
    }
}