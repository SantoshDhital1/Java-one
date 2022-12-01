class A {
    public void methodA() {
        System.out.print("Java is ");
    }
}
class B extends A {
    public void methodB() {
        System.out.print("Object Oriented ");
    }
}
class C extends B {
    public void methodC() {
        System.out.println("Programming language.");
    }
}



public class MultiLevelInheritance_41 {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
