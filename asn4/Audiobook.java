//This is my code
//Connor Lindeboom
//CS312

package asn4;

public class Audiobook extends Stuff 
{

	protected String title;
	protected double price;
	protected String status;
	protected String author;
	protected String reader;
	protected String kind = "Audiobook";
	
	public Audiobook(String titleEnter, double priceEnter, String statusEnter, String authorEnter, String readerEnter) 
	{
		title = titleEnter;
		price = priceEnter;
		status = statusEnter;
		author = authorEnter;
		reader = readerEnter;
	}
	
	//Purpose: create a string depiction of this object
	//Output: concatenated string of all the class elements
	public String toString()
	{
		return ("" + kind + " | " + "\"" + title + "\"" + " | " + "$" + price + " | " + author + " | " + "\"" + reader + "\"" + " | " + status);
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
	
	//Purpose: Checks if the parameter is the object's author
	public boolean isAuthor(String parameter)
	{
		if(author == parameter)
			return true;
		else
			return false;
	}
	
	
}

	

