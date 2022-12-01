class Wood {
    public void msg() {
        System.out.println("This is Wood class");
    }
}
class Foam extends Wood {
    public void example() {
        System.out.println("This is foam class which extends wood class");
    }
}
class Duster extends Wood {
    public void material() {
        System.out.println("This is duster class which extends wood class");
    }
}


public class Inheritance_38 {
    public static void main(String[] args) {
        Foam s1 = new Foam();
        Duster s2 = new Duster();
        s1.msg();
        s1.example();
        s2.material();
        s2.msg();
    }
}
