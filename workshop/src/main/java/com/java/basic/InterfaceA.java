public interface InterfaceA {
    int x = 5; //final and static
    void m1(); //public abstract void m1
}
interface InterfaceB extends InterfaceA{
    void m1();
}

