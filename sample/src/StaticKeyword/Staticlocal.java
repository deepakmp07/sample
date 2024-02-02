package StaticKeyword;

public class Staticlocal {
    public static void main(String args[]){
         int val = 10;
        System.out.print(val);
    }
}
//n Java, a static variable is a class variable (for whole class).
// So if we have static local variable (a variable with scope limited to function),
// it violates the purpose of static. Hence compiler does not allow static local variable.