package asn4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.StringTokenizer;


public class CLI     // the command line interface
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
    //Inventory inv = cli.readFile(System.in);

    cli.processCommand(args);
  }


  /*
   * purpose: process the users command
   * input:   the command switch with arguments, and the current inventory
   * result:  inventory, inv is updates and written to stdout
   */
  private void processCommand(String [] args)
  {
    if (args.length == 0)
    {
      usage("");
      return;
    }

    if ("-d".equals(args[0]))
    {
      if (args.length == 1)
        System.out.println("test");
      else if ("-t".equals(args[1]) && args.length == 3)
          System.out.println("test");

      else if ("-a".equals(args[1]) && args.length == 3)
          System.out.println("test");

      else
        usage("Invalid display option");
    }
    else if ("-a".equals(args[0]))
    {
        System.out.println("test");

    }
    else
    {
      usage("Bummer I don't know how to `" + args[0] + "'");
    }
  }
}
