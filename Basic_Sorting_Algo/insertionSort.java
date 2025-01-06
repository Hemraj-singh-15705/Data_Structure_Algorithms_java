public class insertionSort {
    public static void insertion(int num[]){
        for(int i=1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;
            while(prev>=0 && num[prev] > curr){
                num[prev+1] = num[prev];
                prev--;
            }
            num[prev+1] = curr;
        }
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
        int num[] = { 1,5,4,6,2};
        insertion(num);
    }
}
