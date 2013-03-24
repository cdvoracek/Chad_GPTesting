/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gptestbintree;

/**
 *
 * @author Chad
 */
public class FillTreeValues2 {
int returnNumber,
    randomOp;
char returnOperator;
long Node1;
public long FillNode()
{
int a = getNumbers();
int b = getNumbers();
char op1= getOperators();
switch (op1)
                            {
                            case '+':
                            Node1= a + b;
                            String StrNode1= Long.toString(a+b);
                            System.out.println ("a="+a+"  op1="+op1+ "  b="+b);  
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                            
                            break;
                            
                            case '-':
                            Node1= a - b;
                            StrNode1= Long.toString(a-b);
                            System.out.println ("a="+a+"  op1="+op1+ "  b="+b); 
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                                break;
                                
                            case '*':
                            Node1= a * b;
                            StrNode1= Long.toString(a*b);
                            System.out.println ("a="+a+"  op1="+op1+ "  b="+b); 
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                                break;
                                
                            case '/':
                            Node1= a / b;
                            StrNode1= Long.toString(a/b);
                            System.out.println ("a="+a+"  op1="+op1+ "  b="+b); 
                            System.out.println (Node1);
                            System.out.println (StrNode1);
                                break;

}
return Node1;
}
public int getNumbers()
{
returnNumber=1 + (int)(Math.random() * ((9 - 1) + 1));
return returnNumber;
}


public char getOperators()
{
    randomOp=1 + (int)(Math.random() * ((4 - 1) + 1));
    switch (randomOp)
        {
        case 1:
            returnOperator='+';
            
            
            break;
        case 2:  
            returnOperator='-';
            break;
        case 3:
            returnOperator='*';
            break;
        case 4:
            returnOperator='/';
            break;
     }
    return returnOperator;
}



}
