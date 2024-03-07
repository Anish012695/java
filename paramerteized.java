class a{
        int x;int y;
        a(int a ,int b){
        x=a;
        y=b;
        }
        a(int a ,String b){
            System.out.println(a+" "+b);
            }
        void show(){
            System.out.println(x+" "+y);
        }
    }
    public class paramerteized {
    public static void main(String[] args) {
        a r=new a(10, 20);
        r.show();
        a ron=new a(10,"anish");
    }
}
