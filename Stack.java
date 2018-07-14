public class Stack {
	// your code is here
	int[] arrStack;
	int size = 3;
	int top;

	public Stack(int size) {
		super();
		this.size = size;
		arrStack = new int[this.size];
		top = -1;

	}

	public void push(int pushedElement) {
		// your code is here
		if (isFull()) {
			System.out.println("Overflow condition");
			return;
		}
		top += 1;
		arrStack[top] = pushedElement;

	}

	public void pop() {
		// your code is here
		if (isEmpty()) {
			System.out.println("Underflow condition.");
			return;
		}
		int item = arrStack[top];
		top -= 1;

	}

	public void printElements() {
		// your code is here
		for (int i = 0; i < arrStack.length; i++) {
			System.out.println(arrStack[i]);
		}
	}

	public Boolean isFull() {
		return (top == size - 1);
	}

	public Boolean isEmpty() {
		return (top == -1);
	}

}