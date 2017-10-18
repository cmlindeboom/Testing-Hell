package asn4;


public class Tester 
{

	public static void main(String[] args) 
	{	
		DVD d = new DVD("Battlefield Earth", 2.99, "USED", 1996, "Paramount");
		//System.out.println(d.toString());
		
		CD c = new CD ("Master of Puppets", 5.99, "NEW", 1956, "Metallica");
		//System.out.println(c.toString());
		
		Book b = new Book ("Crepes of Wrath", 10.99, "USED", "Gray Pradbury", "Other");
		//System.out.println(b.toString());
		
		Audiobook a = new Audiobook ("10 hours of muffled screaming", 99.99, "NEW", "Anonymous", "Bob Ross");
		//System.out.println(a.toString());
		
		
		Inventory inventory = new Inventory();
		
		inventory.add(d);
		inventory.add(c);
		inventory.add(b);
		inventory.add(a);
		
		//String stringList = inventory.toString();
		
		//System.out.print(stringList);
		
		
		System.out.println();
		
		inventory.sell("Anonymous");
		
		inventory.display("X");
		
	}

	
	
}
