/*
 * Adapted from Timoth Rolfe
 * http://penguin.ewu.edu/cscd300/Topic/ExpressionTree/PrefixCalc.txt
 * 
 */
package gptestbintree;

/**
 *
 * @author Chad
 * Testing Name Change
 */

import java.util.Scanner;
public class GPTestBinTree {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) 
            {
      BinaryExpTree calc;
      Scanner        console = new Scanner(System.in);

   // Allow for a command-line argument (which would be double-quoted).
      if ( args.length > 0 )
      {
         System.out.println ("Processing string " + args[0]);

         calc = new BinaryExpTree(new Scanner(args[0]));
      }
      else
      {
         System.out.println
           ( "Prefix expression, with all elements separated by blanks");

         calc = new BinaryExpTree(new Scanner(console.nextLine()));
      }

      System.out.println ("\nInput as prefix expression:");
      calc.showPreFix();

      System.out.println ("\nInput as postfix expression:");
      calc.showPostFix();

      System.out.println ("\nInput as parenthesized infix expression:");
      calc.showInFix();

      System.out.println ("\nValue:  " + calc.evaluate());

      System.out.print ("Press <Enter> to exit:  ");
      console.nextLine();
   }
}
