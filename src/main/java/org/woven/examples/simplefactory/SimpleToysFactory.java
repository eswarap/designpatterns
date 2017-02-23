package org.woven.examples.simplefactory;

import org.woven.examples.exception.ToyTypeNotFoundException;
import org.woven.examples.model.Toy;
import org.woven.examples.model.ToyType;
import org.woven.examples.simplefactory.SimpleFactory;

/**
 * Factory class for simple factory pattern
 */
public class SimpleToysFactory {
    
    public SimpleFactory simpleFactory;
    
    public SimpleToysFactory(SimpleFactory _simpleFactory) {
        this.simpleFactory = _simpleFactory;   
    }
    public Toy produceToy(ToyType toyType) throws ToyTypeNotFoundException {
        return simpleFactory.createToy(toyType);
    }

}
