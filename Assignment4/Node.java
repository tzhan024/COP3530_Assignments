/**
	~citation source: the node class is taken from lecture note week 3
	PID: 6144880
*/

public class Node
{
	private ElementType info;
	private Node next;
	
	public Node()
	{
		info = null;
		next = null;
	}
	
	public void setInfo(ElementType x)
	{
		info = x;
	}
	
	public void setNext(Node l)
	{
		next = l;
	}
	
	public ElementType getInfo()
	{
		return info;
	}
	
	public Node getNext()
	{
		return next;
	}
}