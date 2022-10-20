package aa;

import java.util.Stack;

public class Cstack {
	public static void main(String a[]) {

		Stack<Integer> stack = new Stack<>();
		System.out.println("Initial stack : " + stack);
		System.out.println("Is stack Empty? : " + stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println("Stack : " + stack);

		System.out.println("popped out:" + stack.pop());
		System.out.println("after Pop  : " + stack);
		System.out.println("Peek : " + stack.peek());
		System.out.println("position of 10: " + stack.search(10));
		System.out.println("Is empty? : " + stack.isEmpty());
		System.out.println("after Pop  : " + stack);
	}
}
