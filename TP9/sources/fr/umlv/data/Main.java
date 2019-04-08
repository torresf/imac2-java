package fr.umlv.data;

public class Main {

	public static void main(String[] args) {
		var linkedLink = new LinkedLink<Integer>();
		linkedLink.add(13);
		linkedLink.add(144);
		linkedLink.add(200);
		System.out.println(linkedLink);
		System.out.println(linkedLink.get(2));
//		System.out.println(linkedLink.get(4)); // Throw IllegalArgumentException
		
		var strList = new LinkedLink<String>();
		strList.add("Au revoir");
		strList.add("Bonjour");
		System.out.println(strList);
		System.out.println(strList.get(1).length()); // Cast en String pour utiliser length()
		
		System.out.println(strList.contains("Bonjour"));
		System.out.println(strList.contains("Salut"));
	}

}
