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
    randomNodes=1 + (int)(Math.random() * ((7 - 1) + 1));    
    System.out.println (randomNodes);
    BinaryTree.buildTree(randomNodes);
    
   //TestDivisible testDiv = new TestDivisible();
       //boolean div3 = testDiv.divByThree(num);
   
 
}
}
