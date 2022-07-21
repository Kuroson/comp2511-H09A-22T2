package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E>
 */
public class Stack<E> implements Iterable<E> {
    private List<E> data = new ArrayList<>(); // We are going to store our data in here

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.data.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        E item = this.peek(); // Get first element on the stack
        this.data.remove(item); // Remove it
        return item;
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return this.data.get(this.data.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        // Creating a copy using the copy constructor
        List<E> copy = new ArrayList<>(this.data);
        Collections.reverse(copy); // Generic algorithm
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.data.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        // Copy constructing
        // Passing in a list, and its a constructor duplicates the list
        ArrayList<E> listToReturn = new ArrayList<>(this.data);
        return listToReturn;
    }

    /**
     * Assumption is that they are numbers and can be summed (Integers)
     * @param stack
     * @return
     */
    public static Integer sumStack(Stack<? extends Integer> stack) {
        // Integer & any subclasses of Integer can use this method
        Integer counter = 0;
        for (Integer i : stack) {
            counter += i;
        }
        return counter;
    }

    public static void prettyPrint(Stack<?> stack) {
        String output = "[";

        Iterator<?> iter = stack.iterator();
        for (int i = 0; i < stack.size(); i++) {
            // iter.hasNext(); // There is a next value to get using .next()
            output += (iter.next()) + " ";
        }

        System.out.println(output + "]");

    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        s.push(1);
        System.out.println(Stack.sumStack(s));

        ArrayList<String> a = new ArrayList<>();
        a.iterator();
    }
}