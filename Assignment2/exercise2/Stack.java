public class Stack
{
	private Node first;
	private Node start;
	
	public Stack()
	{
		first = new Node();
		start = new Node();
		start.setNext(first);
	}
	public boolean isEmpty()
	{
		return first.getNext() == null;
	}
	public void push(int x)
	{
		Node current = new Node();
		first.setNext(current);
		current.setInfo(x);
		first = current;
	}
	public void pop()
	{
		Node prev = start;
		do
		{
			prev = prev.getNext();
		}while(prev.getNext().getNext() != null);
		prev.setNext(null);
		first = prev;
	}
	public int peek()
	{
		return first.getInfo();
	}
	
}