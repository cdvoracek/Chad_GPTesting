/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogrammingproject_cd;

/**
 *
 * @author Group Project Genetic Programming Project SEIS 610: Software
 * Engineering Spring 2013
 *
 * Prachee Palekar Yang Kyap Brian Williams Chad Dvoracek
 *
 * This Class with generate the Binary Expression Tree.
 */

import java.util.*;

public class BinaryTree {

    /**
     * One node in an expression tree, allowing double values.
     *
     * @author Timothy Rolfe
     */
    private static int maxcounter = 0; //variable for max depth
    
    
    private static int maxvalue = 3;//default value for depth

    /**
     * maxcounter starts at a value of 0 only to establish root node. After that
     * each time max resets in will rest to 1 and grow from there to make sure
     * rootnode is not entered but will allow each branch to grow.
     */
    private static void upMaxCounter() {
        maxcounter++;
        System.out.println("Max Depth = " + maxcounter);
    }

    private class TreeNode {

        private final boolean leaf;   // ?Is this a leaf? else internal
        private final char op;     // For an internal node, the operator
        private double value;  // For a leaf, the value
        private TreeNode left, // Left subexpression for an internal node
                right,  // Right subexpression
                parent;

        // Bare-bones constructor
        private TreeNode(boolean leaf, char op, double value, TreeNode parent) 
        {

            this.leaf = leaf;
            this.op = op;
            this.value = value;
            this.left = null;   // Empty to start
            this.right = null;
            this.parent= parent;
        }

        // For leaf nodes, show the value; for internal, the operator.
        @Override
        public String toString() // To override Object.toString, must be public.
        {
            return leaf ? Double.toString(value) : Character.toString(op);
        }
    }
    TreeNode root = null;

    public BinaryTree() {
        
        /*  Initialize the random generator after figuring out how to write
         *  the expression tree formula.
         
        
            GenerateNode maxdepth = new GenerateNode();
            int depth = maxdepth.getMaxDepth();
            maxvalue = depth;
  
      
         */
        
        root = build(null);
        int testingleafnum = leafCount();
       System.out.println ("leafCount ="+ testingleafnum);
       System.out.println ("begin pre order print...");
       
       preorderPrint();
       System.out.println();
       System.out.println ("begin pre order print...");
       postorderPrint();
       
       
    }

    
    private TreeNode build(TreeNode parentnode) {

        boolean leaf,
                rootnode;
        char op;
        String token;
        double value;
        TreeNode node,
                parent;
        parent = parentnode;
        node = null;
        rootnode = false;
        leaf = false;

        if (maxcounter == 0) {
            rootnode = true;
        } else if (maxcounter < maxvalue) {

            GenerateNode checkleaf = new GenerateNode();
            boolean isLeafTrue = checkleaf.getProbability25();
            leaf = isLeafTrue;
        } else {
            leaf = true;
        }



        //System.out.println("rootnode=" + rootnode);
        //System.out.println("leaf =" + leaf);


        if (rootnode) {
            //System.out.println ("Rootnode is true");
            GenerateNode getOp = new GenerateNode();
            char nodeop = getOp.getOperators();
            op = nodeop;
            leaf = false;
            
            upMaxCounter();
            //System.out.println("rootnode op: "+op);
            //token = input.next();
            
            //System.out.println ("show root parent="+parent);
            
            node = new TreeNode(leaf, op, 0.0,null);
            
            //System.out.println ("show root node= "+node);
            //System.out.println ("show root parent="+parent);
            
            parentnode=node;
            System.out.println("Show root node.op=" + node.op);
            
            System.out.println("Show root parent send="+parentnode);
            //System.out.println("Show root.parent="+root.parent);
            //System.out.println("Show root node.value=" + node.value);
            //System.out.println("Show root node.leaf=" + node.leaf);

            System.out.println("BEGIN ROOT LEFT");
            //TO DO:  Set array value Left here
            node.left = build(parentnode);
           

            //System.out.println ("show root node= "+node);
            //System.out.println ("show root parent="+parent);
            
           
            //System.out.println("Show root node.op=" + node.op);
            System.out.println("BEGIN ROOT RIGHT");
            //TO DO:  Set array value Right here
            //Must reset maxcounter here. 
            maxcounter = 1;
            //System.out.println("Check Max before ROOT Right =" + maxcounter);
            node.right = build(parentnode);
            //System.out.println ("show root node= "+node);
            //System.out.println ("show root parent="+parent);
            
           
           //System.out.println("Show root node.op=" + node.op);

            return node;
        } else if (!rootnode && leaf) {
            System.out.println("Leaf");
            GenerateNode getValue = new GenerateNode();
            double leafValue = getValue.getNumbers();
            value = leafValue;
            node = new TreeNode(leaf, '\0', value,parentnode);
            
            

            System.out.println("Show node.value=" + node.value);
            System.out.println("show this node parent="+node.parent);
           
            //System.out.println("Show node.leaf=" + node.leaf);
            return node;
        } else if (!rootnode && !leaf) {
            System.out.println("Operator");
            
            GenerateNode getOp = new GenerateNode();
            char nodeop = getOp.getOperators();
            op = nodeop;
            //token = input.next();
            node = new TreeNode(leaf, op, 0.0,parentnode);
            upMaxCounter();
            System.out.println("Show node.op=" + node.op);
            System.out.println("show this node parent="+node.parent);
            parentnode=node;//reassign parent node to this.node
            System.out.println ("Show reassign parent to send="+parentnode);
            //System.out.println("Show node.op=" + node.value);
            //System.out.println("Show node.leaf=" + node.leaf);


            System.out.println("BUILD LEFT");
            node.left = build(parentnode);
            //System.out.println (node.op);
             //System.out.println (node.left);
             //System.out.println (node.right);
            
            System.out.println("BUILD RIGHT");
            node.right = build(parentnode);
            //System.out.println (node.op);
             //System.out.println (node.left);
             //System.out.println (node.right);
            
            //System.out.println("NEXT");
            
            return node;
        } //System.out.println ("About to begin Right");
        else {
            System.out.println("End of Build-go back to right");
            //reset depth max for next branch.
            maxcounter = 1;
        }

        return node;

    }
    
    /**
     * Returns the number of leaf nodes in the tree.
     *
     * Public "wrapper" method that gets the recursion going by
     * passing in the root of the entire tree (the instance 
     * variable root) to the first call to the actual recursive
     * method leafCountTree()
     */
    public int leafCount() {
        return leafCountTree(root);
    }
    
   /**
     * leafCountTree()
     *
     * Returns the number of leaf nodes in the subtree rooted at
     * root.
     */
    private static int leafCountTree ( TreeNode root ) {
        
        // There are 0 leaf nodes in an empty tree:

        if ( root == null ) {
            return 0;
        }

        // There is 1 leaf node in a tree consisting of just
        // a leaf node:

        if ( root.left == null && root.right == null ) {
            return 1;
        }

        // Otherwise, if root itself is not a leaf node, the
        // number of leaf nodes in the tree will be equal to
        // the number of leaf nodes in the left subtree plus
        // the number of leaf nodes in the right subtree:

        return leafCountTree(root.left) + leafCountTree(root.right);
    }  
    
  /*
     * Recursively determines the number of descendants of the specified node.
     */
    private static int numDescendants(TreeNode n) {
        /*** implement this method for PS 4 ***/

        return 0;
    }

   //START ADDITIONS
/**
     * Prints the keys of the tree in the order given by a preorder traversal.
     * Invokes the recursive preorderPrintTree method to do the work.
     */
    public void preorderPrint() {
        if (root != null)
            preorderPrintTree(root);      
    }
    /*
     * Recursively performs a preorder traversal of the tree/subtree
     * whose root is specified, printing the keys of the visited nodes.
     * Note that the parameter is *not* necessarily the root of the 
     * entire tree. 
     */
    private static void preorderPrintTree(TreeNode root) {
        if (root.leaf)
            System.out.print(root.value + " ");
        else System.out.print(root.op+" ");
        if (root.left != null)
            preorderPrintTree(root.left);
        if (root.right != null)
            preorderPrintTree(root.right);
    }
     /**
     * Prints the keys of the tree in the order given by a postorder traversal.
     * Invokes the recursive postorderPrintTree method to do the work.
     */
    public void postorderPrint() {
        if (root != null)
            postorderPrintTree(root);      
    }

    /*
     * Recursively performs a postorder traversal of the tree/subtree
     * whose root is specified, printing the keys of the visited nodes.
     * Note that the parameter is *not* necessarily the root of the 
     * entire tree. 
     */
    private static void postorderPrintTree(TreeNode root) {
        if (root.left != null)
            postorderPrintTree(root.left);
        if (root.right != null)
            postorderPrintTree(root.right);
        if (root.leaf)
            System.out.print(root.value + " ");
        else System.out.print(root.op+" ");
    }
    
    
    
    
    /** Returns a preorder iterator for this tree. */
    public LinkedTreeIterator preorderIterator() {
        return new PreorderIterator();
    }

    /** Returns an inorder iterator for this tree. */
    public LinkedTreeIterator inorderIterator() {
        /*** implement this method for PS 4 ***/

        return null;
    }

    /*** inner class for a preorder iterator ***/
    private class PreorderIterator implements LinkedTreeIterator {
        private TreeNode nextNode;

        private PreorderIterator() {
            // The traversal starts with the root node.
            nextNode = root;
        }

        @Override
        public boolean hasNext() {
            return (nextNode != null);
        }

        @Override
        public int next() {
            if (nextNode == null)
                throw new NoSuchElementException("The next node is null");

           // Store a copy of the key to be returned.
            int key = (int)nextNode.value;
            
            // Advance nextNode.
            if (nextNode.left != null)
                nextNode = nextNode.left;
            else if (nextNode.right != null)
                nextNode = nextNode.right;
            else {
                // We've just visited a leaf node.
                // Go back up the tree until we find a node
                // with a right child that we haven't seen yet.
                TreeNode parent = nextNode.parent;
                TreeNode child = nextNode;
                while (parent != null &&
                  (parent.right == child || parent.right == null)) {
                    child = parent;
                    parent = parent.parent;
                }

                if (parent == null)
                    nextNode = null;  // the traversal is complete
                else
                    nextNode = parent.right;
            }

            return key;
        }
    }
/**
 * An interface that describes the functionality that must be supported
 * by classes that implement iterators for LinkedTree objects.
 */
interface LinkedTreeIterator {
    // Are there other nodes to see in this traversal?
    boolean hasNext();

    // Return the value of the key in the next node in the
    // traversal, and advance the position of the iterator.
    int next();
}
}