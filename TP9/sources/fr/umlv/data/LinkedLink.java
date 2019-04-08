package fr.umlv.data;

public class LinkedLink<T> {
	private Link<T> first;
	
	public LinkedLink() {
		this.first = null;
	}
	
	public void add(T value) {
		this.first = new Link<T>(value, this.first);
	}
	
	public T get(int index) {
		if (first == null) {
			throw new NullPointerException("La liste chaînée est vide");
		}
		Link<T> currentLink = first;
		for (int i = 0; i < index; i++) {
			if (currentLink.getNext() == null) {
				throw new IllegalArgumentException("Index out of bound");
			}
			currentLink = currentLink.getNext();
		}
		return currentLink.getValue();
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("LinkedLink :\n");
		Link<T> currentLink = first;
		while (currentLink != null) {
			str.append(currentLink.getValue()).append("\n");
			currentLink = currentLink.getNext();
		}
		return new String(str);
	}
	
	public boolean contains(Object o) {
		Link<T> currentLink = first;
		while (currentLink != null) {
			if (currentLink.getValue().equals(o)) {
				return true;
			}
			currentLink = currentLink.getNext();
		}
		return false;
	}

}
