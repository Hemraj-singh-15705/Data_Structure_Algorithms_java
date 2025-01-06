public class print{
    public static void main(String args[]){
        int n =4;
        // char A;

        // print star in linear form  

        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        //   print star in reverse form 

        // for(int i = n; i<=1; i--){
        //         for(int j=i; j<=1; j--){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }


        // print number 
            for(int i = 1; i<=n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    

    }
}