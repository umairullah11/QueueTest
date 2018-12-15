package io.electrica.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

class QueueListTest {

	private QueueList<Integer> queue = new QueueList<>();

	public QueueListTest() {
	}

	/**
	 * Test of isEmpty method of class QueueList on empty Q.
	 */
	@Test
	public void testIsEmptyTrue() {
		assertTrue(queue.isEmpty());
	}

	/**
	 * Test of isEmpty method of class QueueList on non-empty Q.
	 */
	@Test
	public void testIsEmptyFalse() {
		queue.enqueue(1);
		assertFalse(queue.isEmpty());
	}

	/**
	 * Test of dequeue method of class QueueList.
	 */
	@Test
	public void testDequeue() {
		queue.enqueue(1);
		assertEquals(new Integer(1), queue.dequeue());
	}

	/**
	 * Test of dequeue method of class QueueList. Throws exception if queue is empty
	 */
	@Test
	public void testDequeueException() {
		assertThrows(NoSuchElementException.class, () -> queue.dequeue(), "Empty Queue");
	}

	/**
	 * Test of enqueue method of class QueueList.
	 */
	@Test
	public void testEnqueue() {
		queue.enqueue(2);
		assertEquals(queue.peek(), new Integer(2));
	}

	/**
	 * Test of peek method of class QueueList.
	 */
	@Test
	public void testPeek() {
		queue.enqueue(1);
		assertEquals(new Integer(1), queue.peek());
	}

}
