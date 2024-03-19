public class kadanes {
    public static void kadaness(int arr[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentsum=currentsum+arr[i];
            if(currentsum<0){
                currentsum=0;
            }
            if(currentsum>maxsum){
                maxsum=currentsum;
            }
        }
        System.out.println(maxsum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
kadaness(arr);
    }
}
