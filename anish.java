class anish{
    public static boolean sortarr(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5};
        System.out.println(sortarr(arr));
        if (sortarr(arr)){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("arr is unsorted");
        }
    }
}

