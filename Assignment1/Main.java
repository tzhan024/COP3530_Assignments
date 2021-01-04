//import a scanner for the user to input elements.
import java.util.Scanner;

public class Main
{
	public Main()
	{
		ArrayBag bag = new ArrayBag(); // create an array bag.
		Scanner in = new Scanner(System.in);
		final int SIZE = 10;
		int count = 0;
		String input = "";
		System.out.println("Please enter elements into the bag: ");
		do
		{
			input = in.nextLine();
			if(input.length() > 0) //avoid if nothing entered by user.
			{
				bag.add(input);// add to bag.
				count++;
			}
		}while(input.length() > 0 && count < SIZE);
		
		if(bag.isEmpty())// check if it is empty.
			System.out.println("Error: The bag is empty.");
		else
		{
			System.out.println("Display the bag elements: ");
			bag.print();// print the bag. 
			String removed = "";
			System.out.println("Please enter a element that you want to remove all occurrences: ");
			removed = in.nextLine();
			if(removed.length() > 0)
			{
				bag.remove(removed); // remove all "removed" in the bag. 
				System.out.println("Display the bag elements after removed: ");
				bag.print(); // print after remove elements. 
			}
			else
				System.out.println("You didn't choose any element to remove.");// print if no input by keyboard. 
			
			String counted = "";
			System.out.println("Please enter a element that you want to count its occurrences: ");
			counted = in.nextLine();
			if(counted.length() > 0)
			{
				System.out.println("Display the count result of the element: " + bag.count(counted));// count the number of "counted".
			}
			else
				System.out.println("You didn't choose any element to count.");// print if no input by keyboard.
			
		}
	}
	public static void main(String[] args)
	{
		new Main();
	}
}