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
boolean returnprob25,
        returnprob50;


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
//Random return generating true with a probability of 25%
boolean getprobability25 ()
    { 
        int prob25num;
        prob25num = (1 + (int)(Math.random() * ((4 - 1) + 1)));  
        switch (prob25num)
        {
                case 1: returnprob25= false;
                        break;
                case 2: returnprob25= false;
                        break;
                case 3: returnprob25= true;
                        break;
                case 4: returnprob25= false;
                        break;
        }           
        
        System.out.println ("prob25num ="+prob25num);
        System.out.println ("returnprob ="+returnprob25);
        return returnprob25;
        
    }
//Random return generating true with a probability of 50%
boolean getprobability50 ()
    { 
        int prob50num;
        prob50num = (1 + (int)(Math.random() * ((4 - 1) + 1)));  
        switch (prob50num)
        {
                case 1: returnprob50= true;
                        break;
                case 2: returnprob50= false;
                        break;
                case 3: returnprob50= true;
                        break;
                case 4: returnprob50= false;
                        break;
        }           
        
        System.out.println ("prob50num ="+prob50num);
        System.out.println ("returnprob50 ="+returnprob50);
        return returnprob50;
        
    }

}
