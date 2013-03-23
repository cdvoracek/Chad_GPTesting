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
    pickEither,
    randomOp;

String returnEither,
       returnOperator;


public int getNumbersOnly ()
{
returnNumber=1 + (int)(Math.random() * ((9 - 1) + 1));
return returnNumber;
}

public String getNumbersOperators()
{
    pickEither=1 + (int)(Math.random() * ((13 - 1) + 1));
    switch (pickEither)
        {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            returnEither= Integer.toString(pickEither);
            break;
        case 10:
            returnEither="+";
            break;
        case 11:  
            returnEither="-";
            break;
        case 12:
            returnEither="*";
            break;
        case 13:
            returnEither="/";
            break;
     }
    return returnEither;
}

public String getOperators()
{
    randomOp=1 + (int)(Math.random() * ((4 - 1) + 1));
    switch (randomOp)
        {
        case 1:
            returnOperator="+";
            break;
        case 2:  
            returnOperator="-";
            break;
        case 3:
            returnOperator="*";
            break;
        case 4:
            returnOperator="/";
            break;
     }
    return returnOperator;
}



}
