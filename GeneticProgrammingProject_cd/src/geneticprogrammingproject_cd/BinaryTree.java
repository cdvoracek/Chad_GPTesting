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
public class BinaryTree {

    /**
     * One node in an expression tree, allowing double values.
     *
     * @author Timothy Rolfe
     */
    private static int maxcounter = 1; //variable for max depth
    private static int maxvalue = 5;

    /**
     * maxcounter starts at a value of 1 only to establish root node. After that
     * each time max resets in will rest to 2 and grow from there to make sure
     * rootnode is not entered but will allow each branch to grow.
     */
    private static void upMaxCounter() {
        maxcounter++;
        System.out.println("Max Depth = " + maxcounter);
    }

    private static class TreeNode {

        private final boolean leaf;   // ?Is this a leaf? else internal
        private final char op;     // For an internal node, the operator
        private double value;  // For a leaf, the value
        private TreeNode left, // Left subexpression for an internal node
                right;  // Right subexpression

        // Bare-bones constructor
        private TreeNode(boolean leaf, char op, double value) {

            this.leaf = leaf;
            this.op = op;
            this.value = value;
            this.left = null;   // Empty to start
            this.right = null;
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
   
        root = build();
        //System.out.println ("Line 64"+root);
    }

    private TreeNode buildFinal() {
        boolean leaf = false,
                rootnode;
        char op;
        String token;
        double value;
        TreeNode node;
        node = null;


        System.out.println("Building final leafs in this branch");
        GenerateNode getValue = new GenerateNode();
        double leafValue = getValue.getNumbers();
        value = leafValue;
        node = new TreeNode(leaf, '\0', value);

        System.out.println("Show node.value=" + node.value);
        System.out.println("Show node.leaf=" + node.leaf);
        return node;

    }

    private TreeNode build() {

        boolean leaf,
                rootnode;
        char op;
        String token;
        double value;
        TreeNode node;

        node = null;
        rootnode = false;
        leaf = false;

        if (maxcounter == 1) {
            rootnode = true;
        } else if (maxcounter < maxvalue) {

            GenerateNode checkleaf = new GenerateNode();
            boolean isLeafTrue = checkleaf.getProbability25();
            leaf = isLeafTrue;
        } else {
            leaf = true;
        }



        System.out.println("rootnode=" + rootnode);
        System.out.println("leaf =" + leaf);


        if (rootnode) {
            //System.out.println ("Rootnode is true");
            GenerateNode getOp = new GenerateNode();
            char nodeop = getOp.getOperators();
            op = nodeop;
            leaf = false;
            upMaxCounter();
            //System.out.println("rootnode op: "+op);
            //token = input.next();
            node = new TreeNode(leaf, op, 0.0);

            System.out.println("Show root node.op=" + node.op);
            System.out.println("Show root node.value=" + node.value);
            System.out.println("Show root node.leaf=" + node.leaf);

            System.out.println("BEGIN ROOT LEFT");
            //TO DO:  Set array value Left here
            node.left = build();
            System.out.println("ROOT node left: " + node.left);


            System.out.println("BEGIN ROOT RIGHT");
            //TO DO:  Set array value Right here
            //Must reset maxcounter here. 
            maxcounter = 2;
            System.out.println("Check Max before ROOT Right =" + maxcounter);
            node.right = build();
            System.out.println("ROOT node right: " + node.right);


            return node;
        } else if (!rootnode && leaf) {
            System.out.println("1. Begin(!rootnode && leaf )");
            GenerateNode getValue = new GenerateNode();
            double leafValue = getValue.getNumbers();
            value = leafValue;
            node = new TreeNode(leaf, '\0', value);

            System.out.println("Show node.value=" + node.value);
            System.out.println("Show node.leaf=" + node.leaf);
            return node;
        } else if (!rootnode && !leaf) {
            System.out.println("2. Begin(!rootnode && !leaf)");
            upMaxCounter();
            GenerateNode getOp = new GenerateNode();
            char nodeop = getOp.getOperators();
            op = nodeop;
            //token = input.next();
            node = new TreeNode(leaf, op, 0.0);

            System.out.println("Show node.op=" + node.op);
            System.out.println("Show node.op=" + node.value);
            System.out.println("Show node.leaf=" + node.leaf);


            System.out.println("Begin build left");
            node.left = build();
            System.out.println("Begin build right");
            node.right = build();
            System.out.println("just complete ");
            return node;
        } //System.out.println ("About to begin Right");
        else {
            System.out.println("End of Build-go back to right");
            //reset depth max for next branch.
            maxcounter = 2;
        }

        return node;

    }

    /**
     * Show the expression tree as a postfix expression. All the work is done in
     * the private recursive method.
     */
    public void showPostFix() {
        System.out.println("Line 168" + root);
        showPostFix(root);
        System.out.println();
    }

    // Postfix expression is the result of a post-order traversal
    private void showPostFix(TreeNode node) {
        if (node != null) {
            showPostFix(node.left);
            showPostFix(node.right);
            System.out.print(node + " ");
        }
    }

    /**
     * Show the expression tree as a prefix expression. All the work is done in
     * the private recursive method.
     */
    public void showPreFix() {
        System.out.println("Line 190" + root);
        showPreFix(root);
        System.out.println();
    }

    // Prefix expression is the result of a pre-order traversal
    private void showPreFix(TreeNode node) {  // NOTE:  removing tail recursion
        while (node != null) {
            System.out.print(node + " ");
            showPreFix(node.left);
            node = node.right;  // Update parameter for right traversal
        }
    }

    /**
     * Show the expression tree as a parenthesized infix expression. All the
     * work is done in the private recursive method.
     */
    public void showInFix() {
        showInFix(root);
        System.out.println();
    }

    // Parenthesized infix requires parentheses in both the
    // pre-order and post-order positions, plus the node
    // itself in the in-order position.
    private void showInFix(TreeNode node) {
        if (node != null) {
            // Note:  do NOT parenthesize leaf nodes
            if (!node.leaf) {
                System.out.print("( ");        // Pre-order position
            }
            showInFix(node.left);
            System.out.print(node + " ");   // In-order position
            showInFix(node.right);
            if (!node.leaf) // Post-order position
            {
                System.out.print(") ");
            }
        }
    }

    /**
     * Evaluate the expression and return its value. All the work is done in the
     * private recursive method.
     *
     * @return the value of the expression tree.
     */
    public double evaluate() {
        return root == null ? 0.0 : evaluate(root);
    }

    // Evaluate the expression:  for internal nodes, this amounts
    // to a post-order traversal, in which the processing is doing
    // the actual arithmetic.  For leaf nodes, it is simply the
    // value of the node.
    private double evaluate(TreeNode node) {
        double result;    // Value to be returned

        if (node.leaf) // Just get the value of the leaf
        {
            result = node.value;
        } else {
            // We've got work to do, evaluating the expression
            double left, right;
            char operator = node.op;

            // Capture the values of the left and right subexpressions
            left = evaluate(node.left);
            right = evaluate(node.right);

            // Do the arithmetic, based on the operator
            switch (operator) {
                case '-':
                    result = left - right;
                    break;
                case '*':
                    result = left * right;
                    break;
                case '/':
                    result = left / right;
                    break;
                case '^':
                    result = Math.pow(left, right);
                    break;
                // NOTE:  allow fall-through from default to case '+'
                default:
                    System.out.println("Unrecognized operator "
                            + operator + " treated as +.");
                case '+':
                    result = left + right;
                    break;
            }
        }
        // Return either the leaf's value or the one we just calculated.
        return result;
    }
}
