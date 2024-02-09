public class Polymorph {
    String val = "Polymorph";
    void polyMethod(){
        System.out.println("Inside Polymorph method");
    }
    void polyMethodNotOverridden(){
        System.out.println("Not overridden, still in Polymorph");
    }
}
class PB extends Polymorph{
    String val = "PB";
    void polyMethod(){
        System.out.println("Inside PB method");
    }
}
class PC extends PB{
    String val = "PC";
}
class PD extends PB{
    String val = "PD";
}
class PE extends Polymorph{
    String val = "PE";
}
class execute{
    public static void main(String[] args) {
        System.out.println("Polymorphism yay");
        Polymorph polymorph = new PB();
        System.out.println(polymorph.val);
        polymorph.polyMethod();
        polymorph.polyMethodNotOverridden();




    }
}