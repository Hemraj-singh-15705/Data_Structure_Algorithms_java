public class Inverted_piramid {
    public static void rotated_half_piramid(int n){
        // outer 
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i; j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_number(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // rotated_half_piramid(5);
        inverted_number(5);
    }
}
