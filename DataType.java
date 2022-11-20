public class DataType {
	public static void main(String[] args){
		// Integer Types
		int x = 5;
		System.out.println("My roll number is " + x);

		byte num = 100; //store number from -128 to 127
		System.out.println(num);

		short myNum = 22823; // store number from -32768 to 32767
		System.out.println(myNum);

		long large = 3485251593845l;
		System.out.println(large);
		

		// Floating Point Types
		float y = 5.3563f;
		System.out.println("The float accept only six or seven decimal digit like " + y);
		
		double z = 534e4d;
		System.out.println("Double accept 15 decimal digit like " + z);
		

		// Boolean Types
		boolean iamfail = false;
		boolean iampass = true;
		System.out.println(iamfail);
		System.out.println(iampass);
		

		//character types
		char letter = 'b';
		System.out.println(letter);

		char val1 = 97, val2 = 98, val3 = 99;
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);

		String BCA = "Bachlors in Computer Application"; 
		System.out.println(BCA);

	}
}