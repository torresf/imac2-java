public class Ex1 {

	public static void main(String[] args) {
		// 1.
		var s = "toto";
		System.out.println(s.length());

		// 2.
		var s1 = "toto";
		var s2 = s1;
		var s3 = new String(s1);

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		// 3.
		var s4 = "toto";
		var s5 = new String(s4);

		System.out.println(s4.compareTo(s5));

		// 4.
		var s6 = "toto";
		var s7 = "toto";

		System.out.println(s6 == s7);

		// 6.
		var s8 = "hello";
		s8.toUpperCase();
		System.out.println(s8);
	}

}