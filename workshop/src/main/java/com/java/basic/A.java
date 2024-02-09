public class A {

    int x = 5;
    int y;

    static void m1(){
        System.out.println("Class A");
    }
}
class B extends A{
    int x = 6; //B hides A.x
    //B now has 2 variables x and y x=6, y=0


    static void m1(){ //overriding
        System.out.println("Class B");

    }

    public static void main(String[] args) {
        m1();
        A.m1();
    }

    //computing the signature, which one would work?
//    m1(int x);
//    m1(float x);

//    m1(int x, float y);
//    m1(float x, int y);


    //    m1(int x, float y);
//    m1(float x, float x);








}