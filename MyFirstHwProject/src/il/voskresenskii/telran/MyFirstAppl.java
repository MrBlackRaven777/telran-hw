package il.voskresenskii.telran;

public class MyFirstAppl {

	public static void main(String[] args) {
		System.out.print("I am ");
		System.out.print("programmer!");
		System.out.println("");
		System.out.println("Hello");
		System.out.print("i\nam");
		String name = "Dima";
		System.out.printf("\n%s", name);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("I am programmer!\n"
				+ "Hello\n"
				+ "i\n"
				+ "am\n"
				+ name);

		//Java ver >15
//		System.out.println("""
//				I am programmer!
//				Hello
//				i
//				am
//				Dima""");
	}

}
