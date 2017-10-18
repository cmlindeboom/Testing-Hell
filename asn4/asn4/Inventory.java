//This is my code
//Connor Lindeboom
//CS312

package asn4;

import java.util.ArrayList;

public class Inventory extends Object
{
	
	protected ArrayList<Stuff> inventoryList;
	protected String elements;
	protected String listString;
	
	//Constructor
	public Inventory()
	{
		inventoryList = new ArrayList<Stuff>();
	}
	
	//Purpose: Create string of the complete inventory
	//Input: an arrayList of objects
	//Result: a string of the concatenated list
	@Override
	public String toString()
	{
		if(inventoryList.isEmpty())
			return "Empty List";
		else
		{
			for(int i = 0; i < inventoryList.size(); i++)
			{
				listString  += inventoryList.get(i).toString() + ";\n";
			}
			
			return listString;
		}
	}
	
	//Purpose: add an object to the inventory list
	//Input: an object
	//Result: updates the inventory list
	public void add(Stuff stuff)
	{
		inventoryList.add(stuff);
	}
	
	//Purpose: output the entire inventory OR output particular inventory objects based on a search parameter of author or title
	//Input: A string
	//Result: output objects from the inventory matching the criterion
	int matchCount = 0;
	Stuff current;
	public void display(String parameter)
	{
		if(parameter == "X")
		{
			//display all
			System.out.print(this.toString());
		}
		else //iterate to search for author/title
		{
			for(int i = 0; i<inventoryList.size(); i++)
			{
				current = inventoryList.get(i);
				
				if(current.isTitle(parameter))
				{
					System.out.println(current.toString());
					matchCount++;
				}
				else if(current instanceof Book)
				{
					if(((Book)current).isAuthor(parameter))
					{
						System.out.println(current.toString());
						matchCount++;
					}
				}
				else if(current instanceof Audiobook)
				{
					if(((Audiobook)current).isAuthor(parameter))
					{
						System.out.println(current.toString());
						matchCount++;
					}
				}
			}
			
			
			if(matchCount == 0)
			{
				System.err.println("Parameter does not match any of our inventory!");
			}
		}
	}
	
	//Purpose: remove all items which match a search parameter from the inventory
	//Input: a string
	int matchCount2;
	public void sell(String parameter)
	{
	
		
		//iterate to search for author/title
		for(int i = 0; i<inventoryList.size(); i++)
		{
			current = inventoryList.get(i);
			
			if(current.isTitle(parameter))
			{
				inventoryList.remove(i);
				matchCount2++;
			}
			else if(current instanceof Book)
			{
				if(((Book)current).isAuthor(parameter))
				{
					inventoryList.remove(i);
					matchCount2++;
				}
			}
			else if(current instanceof Audiobook)
			{
				if(((Audiobook)current).isAuthor(parameter))
				{
					inventoryList.remove(i);
					matchCount2++;
				}
			}
		}
			
			if(matchCount2 == 0)
			{
				System.err.println("Parameter does not match any of our inventory!");
			}
		}
}
	
	
	
	
	
