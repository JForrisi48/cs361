/**
 * 
 */
package mystack;

/**
 * @author Jason Forrisi
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete --Complete--
		if (theStack == null)
			return null;
		T top = theStack.val;
		theStack = theStack.next;
		return top;
	}

	public void push(T v) {
		// TODO To complete --Complete-- 
		MyNode<T> node = new MyNode<T>(v, theStack);
		theStack = node;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete --Complete--
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack stack1 = new MyStack();
		stack1.push(1);
		stack1.push(2);
		System.out.println(stack1.pop());
		stack1.push(5);
		
		// TODO To complete --Complete--
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack stack2 = new MyStack();
		stack2.push("Jason");
		stack2.push("Christelle");
	}

}
