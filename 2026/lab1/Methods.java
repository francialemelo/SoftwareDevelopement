public class Methods {
    public static void main(String[] args) {
        System.out.println("Numbers of arguments" + args.length);
        if(args.length > 0){
            System.out.println("args values");
            for (int i=0; i<args.length;i++){
                System.out.println(args[i]+"");
            }
            System.out.println();
        }
        Methods methods = new Methods();
        methods.method1();
        methods.method2(51,51.47);
        String value = methods.method3();
         System.out.println("method 3 returned "+ value);
        int res = methods.method4(200,500);
         System.out.println("method 4 returned "+ res);
    }
    void method1(){
        System.out.println("methods1");
    }
     void method2(int x, double y ){

        System.out.println(x + " and " + y );

     }
     String method3(){
        String val = "helo From method3";
        return val;
     }
     int method4 (int x, int y){
        return x+y;
     }
}
