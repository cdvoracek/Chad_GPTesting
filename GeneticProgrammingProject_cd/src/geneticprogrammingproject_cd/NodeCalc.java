/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticprogrammingproject_cd;

/**
 *
 * @author  Group Project
 *          Genetic Programming Project 
 *          SEIS 610: Software Engineering
 *          Spring 2013
 * 
 *          Prachee Palekar
 *          Yang Kyap
 *          Brian Williams
 *          Chad Dvoracek
 * 
 *          This class will be called when calculating the values of the leaves
 *          and nodes.  
 */
public class NodeCalc {
double nodeValue;
public double PassMath (char op1, double num1, double num2)
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
    
public static double AddNode(double addnum1, double addnum2){

    
return (addnum1 + addnum2);    
}    

public static double SubtractNode(double subnum1, double subnum2){

    
return (subnum1 - subnum2);    
}    

public static double MultiplyNode(double multnum1, double multnum2){

    
return (multnum1 * multnum2);    
}    

public static double DivideNode(double divnum1, double divnum2){

    
return (divnum1 / divnum2);    
}        
}
