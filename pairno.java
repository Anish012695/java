public class pairno {
    public static void pairs(int arr[]){
        int totalpair=0;
        for (int i=0;i<arr.length;i++){
            int curr=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                totalpair++;
            }
            System.out.println();
        }
        System.out.println("total pairs ="+totalpair);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        pairs(arr);
    }
}