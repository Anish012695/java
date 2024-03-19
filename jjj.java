public class jjj {
public static void binary(int arr[],int value){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if (arr[mid]==value){
            System.out.print(mid);
            return;
        }
        else if(arr[mid]<value){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    System.out.println("target is not found");
    
    
}
    public static void main (String args[]){
        int arr[]={2,5,8,9,10};
        int value=21;
        binary(arr, value);
    }
}
