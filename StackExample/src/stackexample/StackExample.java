/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stackexample;

/**
 *
 * @author Chad
 */

import java.util.Stack;
public class StackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Stack s = new Stack();
    s.push("Java");
    s.push("Forums");
    s.push("and");
 
    System.out.println("Next: " + s.peek());
    s.push("Tips");
    System.out.println(s.pop());
    s.push(".");
    int count = s.search("Java");
    while (count != -1 && count > 1) {
      s.pop();
      count--;
    }
    System.out.println(s.pop());
    System.out.println(s.empty());
    
    Stack op = new Stack();
    op.push ('+');
    op.push ('-');
    op.push ('*');
    op.push ('/');
    
    Stack n = new Stack();
    n.push (1);
    n.push (2);
    n.push (3);
    n.push (4);
    
    System.out.println ("Next op:"+op.peek()+ " and next n: "+n.peek());
    System.out.println (n.toString());
    
    }
}
