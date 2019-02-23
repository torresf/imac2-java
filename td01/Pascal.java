public class Pascal {

	private static int calcPascal(int nBut, int pBut) {
		int tab[] = new int[nBut+1];
		int n, i;

		tab[0] = 1;

		for (n=1; n<=nBut; n++) {
			tab[n] = 1;

			for (i=n-1; i>0; i--)
				tab[i] = tab[i-1] + tab[i];
		}

		int result = tab[pBut];
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Cn, p = " + calcPascal(30000, 250));
	}

	// Comment peut-on expliquer la différence de vitesse ?
	// -> Le code java est plus rapide car il bénéficie de l'optimisation du JVM (JAVA Virtual Machine)

}