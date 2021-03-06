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

  // Specific to Java 1.5.x
public class BinaryExpTree
{
   /**
    * One node in an expression tree, allowing double values.
    *
    * @author  Timothy Rolfe
    */
   private static class TreeNode
   {
      private       int      nodenum; // What node is this?
      private final boolean  leaf;   // ?Is this a leaf? else internal
      private final char     op;     // For an internal node, the operator
      private       double   value;  // For a leaf, the value
      private       TreeNode left,   // Left subexpression for an internal node
                             right;  // Right subexpression

      // Bare-bones constructor
      private TreeNode ( int nodenum, boolean leaf, char op, double value )
      {
         this.nodenum = nodenum;
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
   
   public BinaryExpTree ( )
   {  FillTreeValues getMaxNodes = new FillTreeValues();
      int setMaxNodes = getMaxNodes.getMaxNodes();
      System.out.println ("setMaxNodes ="+setMaxNodes) ;
       root = build(1, setMaxNodes);}

/**
 * Based on a white-space delimited prefix expression, build the
 * corresponding binary expression tree.
 * @param  input  The scanner with the expression
 * @return reference to the corresponding binary expression tree
 */
   private TreeNode build (int nodenum, int maxnodes)
   {
    
      boolean  leaf,
               rootnode;
      char     op;
      String   token;
      double   value;
      TreeNode node;
      node=null;
         
      FillTreeValues checkleaf = new FillTreeValues();
      boolean isLeafTrue = checkleaf.getProbability50();
      leaf = isLeafTrue;
      if (nodenum>1)
        {rootnode=false;}
        else {rootnode=true;}
        System.out.println ("rootnode="+rootnode);
      
      
      if (rootnode)
      {
        System.out.println ("Rootnode is true");
        FillTreeValues getOp = new FillTreeValues();
        char nodeop = getOp.getOperators();
        op = nodeop;
        System.out.println(op);
         //token = input.next();
        node  = new TreeNode ( nodenum, leaf, nodeop, 0.0 );
        System.out.println ("Show node=" +node); 
       nodenum++;
       System.out.println ("Rootnode before left: next nodenum = "+nodenum);
       node.left  = build (nodenum, maxnodes);
       System.out.println (node.left);
       nodenum++;
       System.out.println ("Rootnode before right = "+nodenum);
       node.right = build (++nodenum, maxnodes);
       System.out.println (node.right);
        
       
       return node;
      }
              
              
            else if (leaf && nodenum<maxnodes)
            {
                System.out.println ("1. Leaf is true & less than max");
                FillTreeValues getValue = new FillTreeValues();
                double leafValue = getValue.getNumbers();
                value = leafValue;
                node = new TreeNode ( nodenum, leaf, '\0', value );
                
                return node;   
            }
            else if (!leaf && nodenum<maxnodes)
            {
                System.out.println ("2. Leaf is false & less than max");
                FillTreeValues getOp = new FillTreeValues();
                char nodeop = getOp.getOperators();
                op = nodeop;
                //token = input.next();
                node  = new TreeNode ( nodenum, leaf, nodeop, 0.0 );
                nodenum++;
                System.out.println ("Now nodenum = "+nodenum);
                node.left  = build (nodenum, maxnodes);
                nodenum++;
                System.out.println ("Now nodenum = "+nodenum);
                node.right = build (++nodenum, maxnodes);
            }
      else
      {
      System.out.println ("Over limit? MaxNodes = "+maxnodes);
      }
      
      return node;
   }
 

/**
 * Evaluate the expression and return its value.
 * All the work is done in the private recursive method.
 * @return  the value of the expression tree.
 */
   public double evaluate ()
   {  return root == null ? 0.0 : evaluate ( root ) ;  }

   // Evaluate the expression:  for internal nodes, this amounts
   // to a post-order traversal, in which the processing is doing
   // the actual arithmetic.  For leaf nodes, it is simply the
   // value of the node.
   private double evaluate ( TreeNode node )
   {
      double result;    // Value to be returned

      if ( node.leaf )        // Just get the value of the leaf
      {result = node.value;}
      else
      {
         // We've got work to do, evaluating the expression
         double left, right;
         char   operator = node.op;

         // Capture the values of the left and right subexpressions
         left  = evaluate ( node.left );
         right = evaluate ( node.right );

         // Do the arithmetic, based on the operator
         switch ( operator )
         {
            case '-':  result = left - right;  break;
            case '*':  result = left * right;  break;
            case '/':  result = left / right;  break;
            case '^':  result = Math.pow (left, right );  break;
         // NOTE:  allow fall-through from default to case '+'
            default:   System.out.println ("Unrecognized operator " +
                          operator + " treated as +.");
            case '+':  result = left + right;  break;
         }
      }
      // Return either the leaf's value or the one we just calculated.
      return result;
   }
}