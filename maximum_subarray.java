public class maximum_subarray {
    public static void sumarray(int arr[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currentsum=0;
                for(int k=start;k<=end;k++){
                    currentsum+=arr[k];
                }
                System.out.print(currentsum+" ");
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }
            }
        }
        System.out.println("maximum sum=:"+maxsum);
    }
    public static void main(String[] args) {
    int arr[]={2,4,6,8,10};
    sumarray(arr);
    }
}
