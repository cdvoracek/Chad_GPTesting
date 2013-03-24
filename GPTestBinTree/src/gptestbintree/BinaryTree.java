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
//define variables
long a,b,Node1;
char op;


    public static void buildTree(int nodesNum)
    {
    switch (nodesNum)
                {
                case 1:
                System.out.println ("There are 1 nodes on this tree.");
                
                    FillTreeValues testnum = new FillTreeValues();
                    long a = testnum.getNumbers();
                    FillTreeValues testnum2 = new FillTreeValues();
                    long b = testnum2.getNumbers();
                    FillTreeValues testop = new FillTreeValues();
                    char op = testop.getOperators();
                System.out.println ("a="+a+"  op="+op+ "  b="+b);    
                    switch (op)
                            {
                            case '+':
                            long Node1= a + b;
                            String StrNode1= Long.toString(a+b);
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                                break;
                            
                            case '-':
                            Node1= a - b;
                            StrNode1= Long.toString(a-b);
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                                break;
                                
                            case '*':
                            Node1= a * b;
                            StrNode1= Long.toString(a*b);
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                                break;
                                
                            case '/':
                            Node1= a / b;
                            StrNode1= Long.toString(a/b);
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                                break;
                            
                            }
                    
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
  
   
    }
/**public static AddNode (int addnum1, int addnum2)
{
long b;

b = (addnum1 + addnum2);
String declareNode;
declareNode = Long.toString(b);
System.out.println (declareNode);
return b=(addnum1 + addnum2);
}
   
*/   
   
    
}
