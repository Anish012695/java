public class checkequalno {
    public static boolean checkno(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={4,5,2,1,3};
        System.out.println(checkno(arr));
    }
}
