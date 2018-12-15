package io.electrica.test;

public class QueueList<T> {

	private int total;

	private Node first, last;

	private class Node {
		private T element;
		private Node next;
	}

	public QueueList() {
	}

	public void enqueue(T element) {
		Node current = last;
		last = new Node();
		last.element = element;

		if (total++ == 0) {
			first = last;
		} else {
			current.next = last;
		}
	}

	public T dequeue() {
		if (total == 0) {
			throw new java.util.NoSuchElementException();
		}
		T element = first.element;
		first = first.next;
		if (--total == 0) {
			last = null;
		}
		return element;
	}

	public boolean isEmpty() {
		return total == 0;
	}

	public T peek() {
		return first.element;
	}
}