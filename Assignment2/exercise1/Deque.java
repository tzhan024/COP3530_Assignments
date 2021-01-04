/**
	~citation source: some of the methods are come from lecture note week 4.
*/
public class Deque
{
	private int SIZE;
	private int[] list;
	private int front;
	private int rear;
	private int count;
	
	public Deque()
	{
		SIZE = 10;
		list = new int[SIZE];
		front = 5;
		rear = 5;
		count = 0;
	}
	public Deque(int size)
	{
		SIZE = size;
		list = new int[SIZE];
		front = size / 2;
		rear = size / 2;
		count = 0;
	}
	public boolean isEmpty()
	{
		return count == 0;
	}
	
	//add to front, insert item x on the front end of the queue.
	public void push(int x)
	{
		list[front] = x;
		front--;
		count++;
	}
	
	//remove front, remove the front item from the deque and return it.
	public int pop()
	{
		front++;
		return list[front - 1];
	}
	
	//add rear, insert item x on the rear end of the queue.
	public void inject(int x)
	{
		list[rear] = x;
		rear++;
		count++;
	}
	
	//remove the rear item from the deque and return it.
	public int eject()
	{
		rear--;
		return list[rear + 1];
	}
	public int getFront()
	{
		return list[front + 1];
	}
	public int getRear()
	{
		return list[rear - 1];
	}
}