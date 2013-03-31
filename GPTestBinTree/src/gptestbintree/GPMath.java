/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gptestbintree;

/**
 *
 * @author Chad
 */
public class GPMath {
long nodeValue;
public long PassMath (char op1, long num1, long num2)
{

switch (op1)
                            {
                            case '+':
                            nodeValue = AddNode(num1, num2);
                            System.out.println ("a="+num1+"  op1="+op1+ "  b="+num2);  
                            System.out.println ("nodeValue= "+nodeValue);
                            
                            
                            break;
                            
                            case '-':
                            nodeValue = SubtractNode(num1, num2);
                            System.out.println ("a="+num1+"  op1="+op1+ "  b="+num2);  
                            System.out.println ("nodeValue= "+nodeValue);
                                break;
                                
                            case '*':
                            nodeValue = MultiplyNode(num1, num2);
                            System.out.println ("a="+num1+"  op1="+op1+ "  b="+num2);  
                            System.out.println ("nodeValue= "+nodeValue);
                                break;
                                
                            case '/':
                            nodeValue = DivideNode(num1, num2);
                            System.out.println ("a="+num1+"  op1="+op1+ "  b="+num2);  
                            System.out.println ("nodeValue= "+nodeValue);
                                break;

}
return nodeValue;    
    

}
    
public static long AddNode(long addnum1, long addnum2){

    
return (addnum1 + addnum2);    
}    

public static long SubtractNode(long subnum1, long subnum2){

    
return (subnum1 - subnum2);    
}    

public static long MultiplyNode(long multnum1, long multnum2){

    
return (multnum1 * multnum2);    
}    

public static long DivideNode(long divnum1, long divnum2){

    
return (divnum1 / divnum2);    
}    

}
