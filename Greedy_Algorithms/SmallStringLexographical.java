public class SmallStringLexographical {
    public static String smallString(int n,int k){
        StringBuilder sb = new StringBuilder();
    
        int total_char = n;
        int csum = k;
    
        while(total_char > 0){
            if((total_char - 1)*26 >= (csum - 1)){
                sb.append('a');
                csum--;
            }else{
                int position = csum % 26;
                if(position == 0){
                    sb.append('z');
                    csum-=26;
                }else{
                    sb.append((char)(position - 1 + 'a'));
                    csum-= position;
                }
            }
            total_char --;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int n = 5;
        int k = 42;
        System.out.println(smallString(n, k));
    }
    
}
