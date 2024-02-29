public class binarysearch {
    public static int binaryy(int arr[],int val){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==val){
                return mid;
            }
            if(arr[mid]<val){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,4,5,6,3,7,87,90};
        int val=1;
        System.out.println(binaryy(arr, val));
    }
}
