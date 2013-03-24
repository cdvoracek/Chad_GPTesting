/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gptestbintree;

/**
 *
 * @author Chad
 */
public class FillTreeValues {
int returnNumber,
    randomOp;
char returnOperator;


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
