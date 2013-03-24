/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gptestbintree;

/**
 *
 * @author Chad
 */
public class BinaryTree {

    public static void buildTree(int nodesNum)
    {
    switch (nodesNum)
                {
                case 1:
                System.out.println ("There are 1 nodes on this tree.");
                    FillTreeValues testnum = new FillTreeValues();
                    int a = testnum.getNumbers();
                    System.out.println ("getNumbers testn "+a);
                    //use a function like Add(num1,num2)
                    //generate a, b then c as a case
                    //then the case will generate the node if needed
                    
                break;
                case 2:
                System.out.println ("There are 2 nodes on this tree.");
                break;    
                case 3:
                System.out.println ("There are 3 nodes on this tree.");
                break;
                case 4:
                System.out.println ("There are 4 nodes on this tree.");
                break;
                case 5:
                System.out.println ("There are 5 nodes on this tree.");
                break;
                case 6:
                System.out.println ("There are 6 nodes on this tree.");
                break;
                case 7:
                System.out.println ("There are 7 nodes on this tree.");
                break;

                }
   FillTreeValues testnum = new FillTreeValues();
   int testn = testnum.getNumbers();
   System.out.println ("getNumbers testn "+testn);
   
   FillTreeValues testnum1 = new FillTreeValues();
   int testn1 = testnum1.getNumbers();
   System.out.println ("getNumbers testn1 "+testn1);
   
   
   
   FillTreeValues testnum3 = new FillTreeValues();
   char op = testnum3.getOperators();
   System.out.println ("getOperators "+op);
    
    }
public static AddNode (int addnum1, int addnum2)
{
long b;

b = (addnum1 + addnum2);
String declareNode;
declareNode = Long.toString(b);
System.out.println (declareNode);
return b=(addnum1 + addnum2);
}
   
   
   
    
}
