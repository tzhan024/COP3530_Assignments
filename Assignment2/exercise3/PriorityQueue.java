public class PriorityQueue
{
	private Node first;
	private Node last;
	
	public PriorityQueue()
	{
		first = new Node();
		last = new Node();
	}
	public boolean isEmpty()
	{
		return first.getNext() == null && last.getPrev() == null;
	}
	public void add(int x)
	{
		Node current = new Node();
		first.setNext(current);
		current.setPrev(first);
		current.setInfo(x);
		
		last.setPrev(current);
		first = current;
	}
	public int max()
	{
		int max = 10000;
		Node temp = last.getPrev();
		do
		{
			if(temp.getInfo() < max)
				max = temp.getInfo();
			temp = temp.getPrev();
		}while(temp != null);
		return max;
	}
	public void removeMax()
	{
		Node temp = last.getPrev();
		do
		{
			if(temp.getInfo() == max())
			{
				temp.getNext().setPrev(temp.getPrev());
			}
			temp = temp.getPrev();
		}while(temp != null);
	}
}