public class subarray {
    public static void printSUbArray(int number[]){
        for(int i=0; i<number.length;i++){
            for(int j=i; j<number.length; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(number[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        printSUbArray(number);
    }
}
