public class SelectionSort {
    public static void Selection(int arr[]){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            int minPos = i;
            for(int j= i+1; j<n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp =arr[minPos];
            arr[minPos] = arr[i];
            arr[i]= temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
   public static void main(String[] args) {
    int arr[]={1,2,9,5,6};
   Selection(arr);
    }
}