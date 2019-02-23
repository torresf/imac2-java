import java.util.regex.*; // Importe un module java : Regex

public class Ex3 {

	private static int[] checkIp(String ipv4) {

		int tab[] = new int[4];
		// while(m.find()) {
		// 	m.group();
		// }
	}

	public static void main(String[] args) {
		Pattern p = Pattern.compile("(\\D+)?\\d+");
		for (String value: args) {
			Matcher m = p.matcher(value);
			boolean b = m.matches();
			if (b) {
				System.out.print(value.replaceAll("\\D", ""));
			}
		}
		System.out.println();

		System.out.println(this.checkIp("10.1.255.0"));
	};


}