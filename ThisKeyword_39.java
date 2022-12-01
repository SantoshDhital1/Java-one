class Demo {
    int speed = 100;
    public void msg() {
        int speed = 50;
        this.speed= 20;
        System.out.println(this.speed);
        System.out.print("This keyword is used to invoke the ");
    }

    public void example() {
        this.msg();
        System.out.println("constructors, methods, static members etc.");
    }
}


public class ThisKeyword_39 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.example();

    }
}
