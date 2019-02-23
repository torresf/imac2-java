public class Morse {

	public static void main(String[] args) {
		// 1.
		System.out.println("Question 1");
		var str = "";
		for (String value: args) {
			str += value + " Stop. ";
		}
		System.out.println(str);

		// 2.
		System.out.println("Question 2");
		var str2 = new StringBuilder();
		for (String value: args) {
			str2.append(value).append(" Stop. ");
		}
		System.out.println(str2);
	}

}