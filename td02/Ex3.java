import java.util.regex.*; // Importe un module java : Regex

public class Ex3 {

	private static boolean isIP(String str) {
		Pattern p = Pattern.compile("^([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})$");
		Matcher m = p.matcher(str);
		boolean b = m.matches();
		if (!b) {
			return false;
		}
		boolean isValid = true;
		for (int i=1; i <= m.groupCount(); i++) {
			if (Integer.parseInt(m.group(i)) > 255) {
				isValid = false;
			}
		}
		return isValid;
	}

	public static boolean isNumber(String s) {
		Pattern p = Pattern.compile("(\\D)");
		Matcher m = p.matcher(s);
		return !m.find();
	}

	public static void main(String[] args) {
		
		// Question 2
		System.out.println("Question 2 : isNumber ?");
		for (String str : args) {
			if (Ex3.isNumber(str)) {
				System.out.println(str);		
			}
		}

		System.out.println();
		System.out.println("Question 3 : Display numbers at the end of strings");
		// Question 3 
		Pattern p = Pattern.compile("(\\D+)?\\d+");
		for (String str : args) {
			Matcher m = p.matcher(str);
			boolean b = m.matches();
			if (b) {
				System.out.print(str.replaceAll("\\D", ""));
			}
		}
		System.out.println();

		// Question 4
		System.out.println();
		System.out.println("Question 4 : Is an IPv4 ?");
		for (String str : args) {
			System.out.print(str + " : ");
			System.out.println(Ex3.isIP(str));
		}
	};

}