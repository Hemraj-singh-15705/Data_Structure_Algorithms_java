public class Search_Sorted_Matrix {
    public static boolean Search_Matrix(int matrix[][],int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println(row+ " " +col);
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int key = 30;
        Search_Matrix(matrix,key);

    }
}
