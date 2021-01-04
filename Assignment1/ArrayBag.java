public class ArrayBag implements Bag
{
	private static final int SIZE = 12;
	private int length;
	private String[] bag = new String[SIZE];
	
	public ArrayBag()
	{
		length = 0;
	}
	
	/**
		~Citation sources: get from the same method in arraylist in lecture notes. 
		@return return a boolean value, true if length is 0. 
	*/
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	/**
		~Citation sources: get from the same method in arraylist in lecture notes. 
	*/
	public void print()
	{
		for(int i = 0; i < length; i++)
		{
			System.out.print(bag[i] + " ");
		}
		System.out.println();
	}
	
	/**
		~Citation sources: get from the same method in arraylist in lecture notes. 
		@param String value, add the String in parameter to the bag. 
	*/
	public void add(String s)
	{
		if(length == SIZE)
		{
			System.out.println("Error: The bag is full.");
		}
		else
		{
			bag[length] = s;
			length ++;
		}
	}
	
	/**
		@param String value, remove all occurrences of the String in parameter from the bag. 
	*/
	public void remove(String s)
	{
		for(int i = 0; i < length; i++)
		{
			if(bag[i].equals(s))
			{
				for(int pos = i; pos < length; pos++)
				{
					bag[pos] = bag[pos + 1];
				}
				length--;
			}
		}
		for(int j = 0; j < length; j++)
		{
			if(bag[j].equals(s))
			{
				for(int pos = j; pos < length; pos++)
				{
					bag[pos] = bag[pos + 1];
				}
				length--;
			}
		}
	}
	
	/**
		@param String value, count the number of occurrences of the String in parameter in the bag. 
		@return int value, the result of the count number.
	*/
	public int count(String s)
	{
		int count = 0;
		for(int i = 0; i < length; i++)
		{
			if(bag[i].equals(s))
				count++;
		}
		return count;
	}
}