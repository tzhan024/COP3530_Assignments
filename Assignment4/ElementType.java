//PID: 6144880
public class ElementType
{
	public String identifier;
	public String access;
	
	public ElementType()
	{
		identifier = "";
		access = "";
	}
	public ElementType(String i, String a)
	{
		identifier = i;
		access = a;
	}
	public String toString()
    {
        return "[" + identifier + " | " + access + "]";
    }
}