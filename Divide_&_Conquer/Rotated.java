public class Rotated {
    public static int search(int arr[],int tar,int si,int ei){
        if(si > ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        if(arr[si] <= arr[mid]){
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                return search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,1,2,3,4};
        int target = 3;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}