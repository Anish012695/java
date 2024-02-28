public class min_value {
    public static int min_valuee(int number[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(min>number[i]){
                min=number[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int number[]={1,5,3,4,2};
        System.out.println(min_valuee(number));
    }
}
