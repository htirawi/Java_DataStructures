public class Queue {
	// your code is here
	int[] arrQueue;
	int size = 3;
	int rear;
	int front;

	public Queue(int size) {
		super();
		this.size = size;
		arrQueue = new int[this.size];
		front = -1;
		rear = -1;
	}

	public void enQueue(int pushedElement) {
		// your code is here
		if (isFull()) {
			System.out.println("Overflow condition");
			return;
		}
		// increase the rear to next location.
		rear += 1;
		// in index of the rear add the element.
		arrQueue[rear] = pushedElement;
		// I do this because at first time the front is -1, so you have to initialize it
		// to the first element.
		if (front == -1) {
			front = 0;
		}
	}

	public void deQueue() {
		// your code is here
		if (isEmpty()) {
			System.out.println("Underflow condition.");
			return;
		}
		int item = arrQueue[front];
		front += 1;
	}

	public void display() {
		// your code is here
		for (int i = 0; i < arrQueue.length; i++) {
			System.out.println(arrQueue[i]);
		}
	}

	public Boolean isFull() {
		return (rear == size - 1);
	}

	public Boolean isEmpty() {
		return (front == -1);
	}

}