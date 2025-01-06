public class recursionbasic {
   
    public static void PrintDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
   
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fmn1 = factorial(n-1);
        int fn  = n * factorial(n-1);
        return fn;
    }

    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fb1 = fib(n-1);
        int fb2 = fib(n-2);
        int fb  = fb1 + fb2;
        return fb;
    }

    public static int CalcSum(int n){
        if(n==1){
            return 1;
        }
        int sum1 = CalcSum(n-1);
        int sum = n+sum1;
        return sum;
    }

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOccurence(int arr[],int key ,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] ==  key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static int lastOccurence(int arr[],int key ,int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x ,int n){
        if(n == 0){
            return 1;
        }
        int  xnm1 = power(x,n-1);
        int xn = x*xnm1;
        return xn;

        // return x*power(x, n-1);
    }


    public static void main(String[] args) {
      System.out.println(power(2, 10));
    }
}
