public class Const {
    public static void main(String[] args) {
        new B();
    }
}

class A {
    A() {
        System.out.println("Działą konstruktor klasy A");
    }
    A(boolean arg){
        System.out.println("Działą konstruktor (z argumentem) " +arg + " klasy A");
    }
}
class B extends A{
    B(){
        System.out.println("Działą konstruktor klasy B");
    }
}