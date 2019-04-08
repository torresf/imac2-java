package fr.umlv.data;

class Link<T> {
	private T value;
	private Link<T> next;

	public Link(T value) {
		this.value = value;
		this.next = null;
	}
	
	public Link(T value, Link<T> next) {
		this.value = value;
		this.next = next;
	}

	public T getValue() {
		return value;
	}
	
	public Link<T> getNext() {
		return next;
	}

	public static void main(String[] args) {
		var l1 = new Link<Integer>(13);
		var l2 = new Link<Integer>(144);
		System.out.println(l1);
		System.out.println(l2);
	}
}
