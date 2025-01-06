public class Hollow_rectangle {
    public static void Hollow_pattern(int rows,int colms){
        for(int i =1; i<=rows; i++){
            for(int j =1; j<=colms; j++){
                // if(i==j){
                //     System.out.print("*");
                // }
                if(i==1||i==rows||j==1||j==colms){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
          }
    }
    public static void main(String[] args) {
        Hollow_pattern(5,10);
    }
}
