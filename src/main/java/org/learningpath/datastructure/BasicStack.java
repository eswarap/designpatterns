/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.datastructure;

public class BasicStack<X> {
    private X [] data;
    private int stackPointer;

    public BasicStack() {
        data = (X[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(X newItem) {
        data[stackPointer++] = newItem;
    }

    public X pop() {
        if (stackPointer ==0) {
            throw new IllegalStateException("No more items on the stack");
        }
        return data[--stackPointer];
    }

    public boolean hasItem(X item) {
        boolean hasItem = false;
        for (int i = 0; i < stackPointer; i++) {
            if (data[i].equals(item) ){
                hasItem = true;
                break;
            }
        }
        return hasItem;
    }

    public X access(X item) {
        while (stackPointer >0) {
            X tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw  new IllegalArgumentException("item not found in stack");
    }

    public int size() {
        return stackPointer;
    }
}
