class Parent {
    public void display() {
        System.out.println("This is parent class.");
    }
}
class Child extends Parent {
    public void display() {
        // Super keyword is used to invoke method, constructors and instance variable from immediate parent class.
        super.display();
        System.out.println("This is child class.");
    }
}



public class SuperKeyword_39 {
    public static void main(String[] args) {
        Child s1 = new Child();
        s1.display();
    }
}
