public class Qcm {

	public static void main(String[] args) {
		Pixel p = new Pixel();
		ColoredPixel cp = new ColoredPixel();
		Pixel pBis = cp;

		System.out.println("pBis instanceof ColoredPixel");
		System.out.println((pBis instanceof ColoredPixel));

		System.out.println("(cp instanceof Pixel)");
		System.out.println((cp instanceof Pixel));

		System.out.println("(p instanceof ColoredPixel)");
		System.out.println((p instanceof ColoredPixel));

		System.out.println("(pBis instanceof Pixel)");
		System.out.println((pBis instanceof Pixel));
	};

};