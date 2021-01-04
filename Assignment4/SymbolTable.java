/**
	~citation source: several methods are taken from lecture note week 10-hashing
	PID: 6144880
*/
public class SymbolTable
{
	private LinkedList[] table;
	private final int TABLESIZE = 13;
	private final int HASHCONSTANT = 37;
	
	public SymbolTable()
	{
		table = new LinkedList[TABLESIZE];
		for(int i = 0; i < TABLESIZE; i++)
		{
			table[i] = new LinkedList();
		}
	}
	private int hash(String key)
	{
		int hashVal = 0;
		for(int i = 0; i < key.length(); i++)
		{
			hashVal = HASHCONSTANT * hashVal + key.charAt(i);
		}
		hashVal %= TABLESIZE;
		if(hashVal < 0)
		{
			hashVal += TABLESIZE;
		}
		return hashVal;
	}
	public void add(ElementType e)
	{
		int hashValue = hash(e.identifier);
		table[hashValue].add(e);
	}
	public void remove(String key)
	{
		int hashValue = hash(key);
		table[hashValue].remove(key);
	}
	public boolean search(String key)
	{
		int hashValue = hash(key);
		return table[hashValue].search(key);
	}
	public String toString()
    {
        String str = "";
        
        for(int i=0; i<table.length; i++)
        {
            str = String.format(str + "%2d: ", i);
                        
            LinkedList bucket = table[i];
            if (!bucket.isEmpty())
                str += bucket.toString() + "\n";
            else
                str += "->\n";
        }
        
        return str;
    }
}