public class reverse {
    public static void reversee(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main (String[] args){
        int arr[]={1,3,5,7,9,10};
        reversee(arr);
    }
}
