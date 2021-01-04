public class Main
{
	public Main()
	{
		Deque queue = new Deque(11); 
		System.out.print("The elements added from front(true sort should be reversed): ");
		for(int i = 0; i < 5; i++)
		{
			int x = (int)(Math.random() * 10);
			
			System.out.print(x + " ");
			queue.push(x);
		}
		System.out.print("\nThe elements added to the rear: ");
		for(int i = 0; i < 5; i++)
		{
			int x = (int)(Math.random() * 10);
			
			System.out.print(x + " ");
			queue.inject(x);
		}
		System.out.println();
		System.out.println("display front element: ");
		System.out.println(queue.getFront());
		queue.pop();
		System.out.println("display front after pop: ");
		System.out.println(queue.getFront());
		queue.pop();
		System.out.println("display front after pop: ");
		System.out.println(queue.getFront());
		
		System.out.println("display rear element: ");
		System.out.println(queue.getRear());
		queue.eject();
		System.out.println("display rear after pop: ");
		System.out.println(queue.getRear());
		queue.eject();
		System.out.println("display rear after pop: ");
		System.out.println(queue.getRear());
	}
	public static void main(String[] args)
	{
		new Main();
	}
}