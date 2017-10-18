//This is my code
//Connor Lindeboom
//CS312

package asn4;

public abstract class Stuff 
{
	protected String title;
	protected double price;
	protected String status;
	
	//default constructor
	public Stuff()
	{
		title = "";
		price = 0.0;
		status = "NEW";
	}
	
	//overloaded constructor
	public Stuff(String titleEnter, double priceEnter, String statusEnter)
	{
		title = titleEnter;
		price = priceEnter;
		status = statusEnter;
	}
	
	//Purpose: called by display method to check for stuff with the corresponding title
	//Input: a string
	//Result: a boolean
	public boolean isTitle(String parameter)
	{
		if(title == parameter)
			return true;
		else
			return false;
	}
	
	
}
