public class Main {
    public static void main(String[] args) {
        // Widening Casting
		byte con = 123;
		short con1 = con;
        int con2 = con1;
		long con3 = con2;
		float con4 = con3;
        double con5 = con4;
		

        System.out.println(con);
        System.out.println(con1);
		System.out.println(con2);
		System.out.println(con3);
		System.out.println(con4);
		System.out.println(con5 + "\n");


        // Narrowing Casting
        double car = 9.546d;
		float car1 = (float) car;
        long car2 = (long) car1;
		int car3 = (int) car2;
		short car4 = (short) car3;
		byte car5 = (byte) car4;
		

        System.out.println(car);
        System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		System.out.println(car4);
		System.out.println(car5);

    }
}
