/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gptestbintree;

/**
 *
 * @author Chad
 */
public class GPTestBinTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int randomNodes;
        
    //determine number of nodes
    randomNodes= 1 + (int)(Math.random() * ((7 - 1) + 1)); 
  
    System.out.println ("How many nodes= "+randomNodes);
    
    BinaryTree testbin1 = new BinaryTree();
    testbin1.buildTree(randomNodes);
    
  
    
    
    //FillTreeValues2 testFill = new FillTreeValues2();
    //long test = testFill.FillNode();
    
    //System.out.println ("Printing Returned event: "+(test));
    
    
    
    
   
   /** 
   * Testing random values.
   * FillTreeValues testnum = new FillTreeValues();
   int testn = testnum.getNumbers();
   System.out.println ("getNumbers testn "+testn);
   
   FillTreeValues testnum1 = new FillTreeValues();
   int testn1 = testnum1.getNumbers();
   System.out.println ("getNumbers testn1 "+testn1);
   
   
   
   FillTreeValues testnum3 = new FillTreeValues();
   char op = testnum3.getOperators();
   System.out.println ("getOperators "+op);
   */
}
}
