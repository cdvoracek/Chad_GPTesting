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
 *          This class will be called when generating the node operators and
 *          operands. This class includes probability methods and random number
 *          generators.  
 */
public class GenerateNode {
int     returnRandom,
        returnNumber,
        returnMaxNodes,
        returnMaxDepth,
        randomOp;
char    returnOperator;
boolean returnprob25,
        returnprob50;

//Random Formula:  Min + (int)(Math.random()*((Max-Min)+1))
public int setRandom(int min, int max)
{
returnRandom = min + (int)(Math.random()*((max-min)+1));

return returnRandom;
}

public int getNumbers()
{

returnNumber = setRandom(1,9);
//returnNumber=1 + (int)(Math.random() * ((9 - 1) + 1));
return returnNumber;
}


public char getOperators()
{
    randomOp= setRandom(1,4);
    //randomOp=1 + (int)(Math.random() * ((4 - 1) + 1));
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
boolean getProbability25 ()
    { 
        int prob25num;
        prob25num= setRandom(1,4);
        //prob25num = (1 + (int)(Math.random() * ((4 - 1) + 1)));  
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
        
        //System.out.println ("prob25num ="+prob25num);
        //System.out.println ("returnprob ="+returnprob25);
        return returnprob25;
        
    }
//Random return generating true with a probability of 50%
boolean getProbability50 ()
    { 
        int prob50num;
        prob50num = setRandom (1,4);
        //prob50num = (1 + (int)(Math.random() * ((4 - 1) + 1)));  
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
        
        //System.out.println ("prob50num ="+prob50num);
        //System.out.println ("returnprob50 ="+returnprob50);
        return returnprob50;
        
    }
public int getMaxNodes()
{
    returnMaxNodes = setRandom(8,16);
    //returnMaxNodes=3 + (int)(Math.random() * ((7 - 3) + 1));

return returnMaxNodes;
}  

public int getMaxDepth()
{
     returnMaxDepth = setRandom(1, 10);
return returnMaxDepth;
}
}
