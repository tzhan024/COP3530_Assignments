public class Main
{
	public Main()
	{
		PriorityQueue queue = new PriorityQueue(); // create a new priority queue.
		
		
		System.out.println("The elements that inputed into the Priority Queue: ");
		for(int i = 0; i < 10; i++)
		{
			int x = (int)(Math.random() * 10);
			System.out.print(x + " ");
			queue.add(x);
		}
		
		System.out.println();
		System.out.println("display max: ");
		System.out.println(queue.max());
		queue.removeMax();
		System.out.println("display max after removed: ");
		System.out.println(queue.max());
	}
	public static void main(String[] args)
	{
		new Main();
	}
}