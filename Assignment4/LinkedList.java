/**
	~citation source: the linkedlist class is taken from lecture note week 3
	with some modification with this assignment. 
	PID: 6144880
*/
public class LinkedList
{
	private Node first;
	
	public LinkedList()
	{
		first = new Node();
	}
	public void add(ElementType x)
	{
		Node newListNode = new Node();
		newListNode.setInfo(x);
		newListNode.setNext(first.getNext());
		first.setNext(newListNode);
	}
	public void remove(String x)
	{
		Node old = first.getNext();
		Node p = first;
		boolean found = false;
		while(old != null && !found)
		{
			if(old.getInfo().identifier == x)
				found = true;
			else
			{
				p = old;
				old = p.getNext();
			}
		}
		if(found)
			p.setNext(old.getNext());
	}
	public boolean isEmpty()
	{
		return (first.getNext() == null);
	}
	public boolean search(String x)
	{
		Node current = first.getNext();
		while(current != null)
		{
			if(current.getInfo().identifier == x)
				return true;
			current = current.getNext();
		}
		return false;
	}
	public String toString() {
        Node current = first.getNext();

        String str = "";
        while (current != null) {
            str += current.getInfo() + " -> ";
            current = current.getNext();
        }
        
        return str;
    }
}