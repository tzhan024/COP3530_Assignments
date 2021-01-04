/**
	~citation source: the node class is taken from lecture note week 3, with some change the prev part.
*/

public class Node
{
	private int info;
	private Node next;
	private Node prev;
	
	public Node()
	{
		info = 0;
		next = null;
		prev = null;
	}
	
	public void setInfo(int i)
	{
		info = i;
	}
	
	public void setNext(Node p)
	{
		next = p;
	}
	
	public void setPrev(Node p)
	{
		prev = p;
	}
	
	public int getInfo()
	{
		return info;
	}
	
	public Node getNext()
	{
		return next;
	}
	
	public Node getPrev()
	{
		return prev;
	}
}