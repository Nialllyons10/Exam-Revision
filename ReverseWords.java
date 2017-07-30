//Read words of a text & print in reverse order

class ReverseWords {
	public static void main(String[] args) 
	{
		Stack<String> stack = new Stack<>();
		
		System.out.println("Enter text");
		
		while (!Console.endOfFile()) 
			stack.push(Console.readToken()); // assume enough room
		
		while(!stack.isEmpty()) 
		{
			String s = stack.pop();
			System.out.print(s + " ");
		}
	}
}
