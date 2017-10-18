//This is my code
//Connor Lindeboom
//CS312

package asn4;

public class DVD extends Stuff 
{

	protected String title;
	protected double price; 
	protected String status;
	protected int year;
	protected String studio;
	protected String kind = "DVD";
	
	//DVD constructor
	public DVD(String titleEnter, double priceEnter, String statusEnter, int yearEnter, String studioEnter) 
	{
		title = titleEnter;
		price = priceEnter;
		status = statusEnter;
		year = yearEnter;
		studio = studioEnter;
	}
	
	//Purpose: create a string depiction of this object
	//Output: concatenated string of all the class elements
	
	public String toString()
	{
		return ("" + kind + " | " + "\"" + title + "\"" + " | " + "$" + price + " | " + year + " | " + "\"" + studio + "\"" + " | " + status);
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
