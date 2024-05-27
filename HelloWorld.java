class HelloWorld{
    
    public static boolean repeat(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
        }
        
        }
        return false;
    }
    public static void main (String args[]){
        int arr[]={1,3,2,4,5,1};
        System.out.println(repeat(arr));
    }
}

    
    // class HelloWorld {
    //     public static void main(String[] args) {
    //         System.out.println("Hello, World!"); 
    //     }
    // }
