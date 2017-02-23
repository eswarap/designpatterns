package org.eclipse.che.examples.exception;

public class ToyTypeNotFoundException extends Exception {

    private final static long serialVersionUID = 1L;

    public ToyTypeNotFoundException(String s) {
        super(s);
    }
}
