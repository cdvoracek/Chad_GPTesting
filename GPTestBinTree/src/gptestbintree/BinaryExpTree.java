/*
 * Addapted from Timothy Rolf ExpressionTree.java
 * http://penguin.ewu.edu/cscd300/Topic/ExpressionTree/ExpressionTree.txt
 * 
 * 
 */
package gptestbintree;

/**
 *
 * @author Chad
 */

import java.util.Scanner;    // Specific to Java 1.5.x
public class BinaryExpTree 
{
   /**
    * One node in an expression tree, allowing long values.
    *
    * @author  Timothy Rolfe
    */
   private static class TreeNode
   {
      private final boolean  leaf;   // ?Is this a leaf? else internal
      private final char     op;     // For an internal node, the operator
      private       double   value;  // For a leaf, the value
      private       TreeNode left,   // Left subexpression for an internal node
                             right;  // Right subexpression

      // Bare-bones constructor
      private TreeNode ( boolean leaf, char op, double value )
      {
         this.leaf    = leaf;
         this.op      = op;
         this.value   = value;
         this.left    = null;   // Empty to start
         this.right   = null;
      }

      // For leaf nodes, show the value; for internal, the operator.
       @Override
      public String toString()    // To override Object.toString, must be public.
      {  return leaf ? Double.toString(value) : Character.toString(op) ;  }
   }

   TreeNode root = null;

   public ExpressionTree ( Scanner input )
   {  root = build(input);  }

/**
 * Based on a white-space delimited prefix expression, build the
 * corresponding binary expression tree.
 * @param  input  The scanner with the expression
 * @return reference to the corresponding binary expression tree
 */
   private TreeNode build ( Scanner input )
   {
      boolean  leaf;
      String   token;
      double   value;
      TreeNode node;

      leaf = input.hasNextLong();
      if ( leaf )
      {
         value = input.nextLong();
         node = new TreeNode ( leaf, '\0', value );
      }
      else
      {
         token = input.next();
         node  = new TreeNode ( leaf, token.charAt(0), 0.0 );
         node.left  = build ( input );
         node.right = build ( input );
      }
      return node;
   }
}
