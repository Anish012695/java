class a{
        int a,b;
        void shi(){
            System.out.print("anihs"+a+b);
        }
    }
class multiinheri extends a{
        void shoe(){
            a=10;b=20;
            System.out.println(a+" "+b);
            }
            public static void main(String[] args) {
                multiinheri r=new multiinheri();
                r.shoe();
            }
    }
    

