public class Main
{
	public Main()
	{
		Stack stack = new Stack(); // create a new stack.
		
		
		System.out.println("The elements that inputed into the stack: ");
		for(int i = 0; i < 10; i++)
		{
			int x = (int)(Math.random() * 10);
			System.out.print(x + " ");
			stack.push(x);
		}
		
		System.out.println();
		System.out.println("display peek: ");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println("display peek after pop: ");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println("display peek after pop: ");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println("display peek after pop: ");
		System.out.println(stack.peek());
	}
	public static void main(String[] args)
	{
		new Main();
	}
}