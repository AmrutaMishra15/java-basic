abstract class AbstractA{
    abstract void m1();
}
abstract class AbstractB extends AbstractA{
     void m2(){
         System.out.println("in AbstractB class's method");
     }

}
abstract class AbstractC extends  AbstractB{
    void m3(){
        System.out.println("in AbstractC class's method");
    }
}

class D extends  AbstractC{
    void m1(){
        System.out.println("implementation of m1");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        D d = new D();
        d.m1();
        d.m2();
        d.m3();
    }

}