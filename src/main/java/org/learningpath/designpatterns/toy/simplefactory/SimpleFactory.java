/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.toy.simplefactory;

import org.learningpath.designpatterns.toy.exception.ToyTypeNotFoundException;
import org.learningpath.designpatterns.toy.model.*;

/**
 * Simple Factory class
 */
public class SimpleFactory {

    public Toy createToy(ToyType toyType) throws ToyTypeNotFoundException {
        Toy toy;
        switch (toyType) {
            case CAR:
                toy = new Car(4);
                break;
            case TRUCK:
                toy = new Truck(6);
                break;
            case SCOOTER:
                toy = new Scooter(2);
                break;
            default:
                toy = new NullToy();
        }

        return toy;
    }
}
