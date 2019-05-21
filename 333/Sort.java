public class Sort {

	public static void main(String[] args) {
		int[] tab = {5, 2, 3, 1, 4};
		Sort.printArray(tab);
		Sort.sort(tab);
		Sort.printArray(tab);
	}

	private static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("]");
	}

	public static void swap(int[] array, int index1, int index2) {
		int tempValue = array[index1];
		array[index1] = array[index2];
		array[index2] = tempValue;
	}

	public static int indexOfMin(int[] array, int index1, int index2) {
		int min = array[index1];
		int index = index1;
		for (int i = index1; i < index2; i++) {
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			Sort.swap(array, i, Sort.indexOfMin(array, i, array.length));
		}
	}

}