//This is my code
//Connor Lindeboom
//CS312

package asn4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.StringTokenizer;

public class CLI 
{

	
	
	public final static int CURRENT_YEAR = 2016; 
	private final int EXPECTED_ARGS = 6;
	
	  /*
	   * purpose: print and error message and the the program's command line options
	   * input:   a error message
	   * result:  prints instructions to stdout
	   */
	  private void usage(String msg)
	  {
	    System.err.println("\n" + msg + "\nUsage: java CLI [-d|-a|-s] <options>\n"
	     + "there are three command line options\n"
	     + "  (display) -d [(everything by default) | -t title | -a author ]\n"
	     + "  (add)     -a DVD         \"title\" cost year   \"studio\" NEW|USED\n"
	     + "  (add)     -a CD          \"title\" cost year   \"band\"   NEW|USED\n"
	     + "  (add)     -a BOOK        \"title\" cost author  genre     NEW|USED\n"
	     + "  (add)     -a AUDIOBOOK   \"title\" cost author \"reader\" NEW|USED\n"
	     + "  (sell)    -s [-t title | -a author]");
	  }
	  

	  /*
	   * purpose: run the program
	   * input:   command line options from the user
	   * result:  the database of stuff read from stdin is updates and
	              written to stdout
	   */
	  public static void main(String [] args)
	  {
	    CLI cli = new CLI();
	    //Inventory inv = cli.readFile("testfile"); // for use with JUnit
	    Inventory inv = cli.readFile(System.in);

	    cli.processCommand(args, inv);
	  }


	  /*
	   * purpose: process the users command
	   * input:   the command switch with arguments, and the current inventory
	   * result:  inventory, inv is updates and written to stdout
	   */
	  private void processCommand(String [] args, Inventory inv)
	  {
	    if (args.length == 0)
	    {
	      usage("");
	      return;
	    }

	    if ("-d".equals(args[0]))
	    {
	      if (args.length == 1)
	        ...
	      else if ("-t".equals(args[1]) && args.length == 3)
	        ...
	      else if ("-a".equals(args[1]) && args.length == 3)
	        ...
	      else
	        usage("Invalid display option");
	    }
	    else if ("-a".equals(args[0]))
	    {
	      ...
	    }
	    else
	    {
	      usage("Bummer I don't know how to `" + args[0] + "'");
	    }
	  }

	  /*
	   * purpose: create a new Item based on the mediaKind
	   * input:   the new items data
	   * result:  a new Item of the appropriate subclass
	   */
	  private Item createItem(String title, String mediaKind, Double cost, 
	                          String authorOrYear, String property2, 
	                          Boolean isNew)
	  {
	    Item it = null;
	    int year = CURRENT_YEAR;

	    ...

	    if (mediaKind.equals("AUDIOBOOK"))
	      it = new Audiobook(...
	    else if (mediaKind.equals("DVD"))
	      it = new DVD(...
	    else if (mediaKind.equals("BOOK"))
	      it = new Book(...
	    else if (mediaKind.equals("CD"))
	      it = new CD(...
	    else 
	      System.err.println("I'll pretend i didn't see the media kind " + mediaKind);

	    return it;  
	  }


	  /*
	   * purpose: create a new Item based on a database record (line from the file)
	   * input:   a comma separated string
	   * result:  a new Item of the appropriate subclass
	   */
	  private Item parseItemString(String s)
	  {
	    StringTokenizer tok = new StringTokenizer(s, ";");
	    ...
	  }


	  /*
	   * purpose: read the inventory from a Java reader
	   * input:   the reader
	   * result:  returns the populated inventory
	   */
	  private Inventory readFile(BufferedReader reader)
	  {
	    Inventory inv = new Inventory();
	    try
	    {
	      String line;

	      for(line = reader.readLine(); line != null; line = reader.readLine())
	      {
	        if (line.length() == 0)
	          continue;   // ignore blank lines

	        Item it = parseItemString(line);
	        if (it != null) 
	          inv.add(it);
	        else
	          System.err.println("Someone needs to take a look at this! " + line);
	      }
	    }
	    catch (Exception E)
	    {
	      System.err.println("ah sorry but " + E);
	    }

	    return inv;
	  }


	  // an example of the wrapper pattern
	  // 'public' ... really only want to share with the testing code
	  /*
	   * purpose: read the inventory from a disk file
	   * input:   the file name, fileName
	   * result:  returns the populated inventory
	   */
	  public Inventory readFile(String fileName) 
	  {
	    try
	    {
	      return readFile(new BufferedReader(new FileReader(fileName)));
	    }
	    catch (Exception E)
	    {
	      System.err.println("ah sorry but " + E);
	    }

	    return null;
	  }


	  // an example of the wrapper pattern
	  // 'public' ... really only want to share with the testing code
	  /*
	   * purpose: read the inventory from an input stream
	   * input:   the stream, in (e.g., stdin)
	   * result:  returns the populated inventory
	   */
	  public Inventory readFile(InputStream in) 
	  {
	    try
	    {
	      return readFile(new BufferedReader(new InputStreamReader(in)));
	    }
	    catch (Exception E)
	    {
	      System.err.println("ah sorry but " + E);
	    }

	    return null;
	  }
	}

}
