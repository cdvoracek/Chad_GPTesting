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
long    av,
        bv,
        cv,
        dv,
        ev,
        fv,
        gv,
        hv,
        iv,
        jv,
        kv,
        lv,
        mv,
        nv,
        ov,
        Node1,
        Node2,
        Node3,
        Node4,
        Node5,
        Node6,
        Node7;
char    op1,
        aop,
        bop,
        cop,
        dop,
        eop,
        fop;
boolean checka,
        checkb;

    public void buildTree(int nodesNum)
    {
    
    //determine values
    
    //get top level op1
    
    FillTreeValues getop1 = new FillTreeValues();
    char op1 = getop1.getOperators();
    System.out.println ("op1 = "+op1);
        
    //is 'a' a operator or operand.  25% prob=operator
         
         FillTreeValues checkaop = new FillTreeValues();
         boolean checka = checkaop.getprob25();
         if (checka) 
        {
            FillTreeValues assignaop= new FillTreeValues();
            char aop = assignaop.getOperators();
            System.out.println ("checka= "+checka);
            System.out.println ("aop= "+aop);
        }
            else 
         {
            FillTreeValues setav = new FillTreeValues();
            long av = setav.getNumbers(); 
            System.out.println ("av= "+av); 
         }
           
        //is 'b' a operator or operand.  25% prob=operator     
        
        FillTreeValues checkbop = new FillTreeValues();
         boolean checkb = checkaop.getprob25();
         if (checkb) 
        {
            FillTreeValues assignbop= new FillTreeValues();
            char bop = assignbop.getOperators();
            System.out.println ("checka= "+checkb);
            System.out.println ("bop= "+bop);
        }
            else 
         {
            FillTreeValues setbv = new FillTreeValues();
            long av = setbv.getNumbers(); 
            System.out.println ("bv= "+bv); 
         } 
        
         
         
         //set c and d value for testing  
         
         cv = 10;
         dv = 25;
         
         //set e and f value for testing 
         ev = 2;
         fv = 300;
         
    GPMath newMathfnc= new GPMath();
    long nodeCalcTest = newMathfnc.PassMath(op1,av,bv);  
    System.out.println (av+op1+bv);
    System.out.println(nodeCalcTest);
    
    
        } 
        
        //caculate nodes
       
    
   
    
    
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
   
    

