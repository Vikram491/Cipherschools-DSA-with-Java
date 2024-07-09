//METHOD OVERRIDING

class Parent {
    void fun() { //overridden method...
        System.out.println("Hi from LPU");
    }
}
class Child extends Parent { //overriding method..
f    void fun() {
        System.out.println("Hello from LPU");
    }
}
public class Methodoverriding {
    public static void main(String args[]) {
        Child c = new Child();
        c.fun();
    }
}

 
