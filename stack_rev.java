import java.util.Stack;

public class stack_rev
{
	public static void main(String [] args)
	{
	
		Stack stack = new Stack();

		stack.push("B");

		stack.push("J");

		stack.push("C");

		String x = stack.pop();

		stack.push("D");

		stack.push(x);

		while(!stack.isEmpty())

		System.out.println(stack.pop());
	}
}
