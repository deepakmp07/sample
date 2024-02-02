package StaticKeyword;

public class Block {
    static int a = 10;
    static int b = 20;
    static int c;
    //static block that gets executed exactly once, when the class is first loaded.
    static{
        System.out.println("static block is called");
        c = a+b;
    }
    public Block(String str) {
        System.out.println(str);
    }
    public static void main(String args[]){
     Block b = new Block("constructor is called");
     System.out.println("c value is "+c);
    }
}
