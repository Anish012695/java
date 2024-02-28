public class linear {
    public static int liinear(int numbers[],int search){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==search){
                
                System.out.println("your index value is ");
                return i;
            }
        }
        System.out.println("not in this array");
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,10,5,6,6,7,7};
        int search=11;
        System.out.println(liinear(numbers, search));
    }
}
