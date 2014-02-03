/*************************************************************************
 *  Compilation:  javac Reverse.java
 *  Execution:    java Reverse
 *  Dependencies: Stack.java StdOut.java StdIn.java
 *
 *  Read a sequence of integers from standard input and print them
 *  in reverse order.
 *
 *  % java  java Reverse
 *  1 2 3 4 5
 *  5
 *  4
 *  3
 *  2
 *  1
 *  
 *  
 *  Pushdown stack. A pushdown stack is a collection that is based on the 
 *  last-in-first-out (LIFO) policy. When you click a hyperlink, your browser 
 *  displays the new page (and pushes onto a stack). You can keep clicking on 
 *  hyperlinks to visit new pages, but you can always revisit the previous page 
 *  by clicking the back button (popping it from the stack). Reverse.java is a 
 *  stack client that reads a sequence of integers from standard input and prints 
 *  them in reverse order.

 *************************************************************************/

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        while (!StdIn.isEmpty()) {
            stack.push(StdIn.readInt());
        }
        for (int i : stack) {
            StdOut.println(i);
        }
    }
}