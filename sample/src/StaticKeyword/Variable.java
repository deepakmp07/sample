package StaticKeyword;

public class Variable {
    static int s = m1();
    static{
        System.out.print("static block is executed");
    }
    static int m1(){
        System.out.println("m1 is called");
        return 20;
    }
    public static void main(String args[]){
        System.out.println(s);
    }
}
