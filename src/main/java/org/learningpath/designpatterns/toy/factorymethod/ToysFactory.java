/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.toy.factorymethod;

import org.learningpath.designpatterns.toy.exception.ToyTypeNotFoundException;
import org.learningpath.designpatterns.toy.simplefactory.SimpleFactory;
import org.learningpath.designpatterns.toy.model.Toy;
import org.learningpath.designpatterns.toy.model.ToyType;

public class ToysFactory {

    public SimpleFactory simpleFactory;

    public ToysFactory(SimpleFactory _simpleFactory) {
        this.simpleFactory = _simpleFactory;
    }

    public Toy produceToy(ToyType toyType) throws ToyTypeNotFoundException {
        return simpleFactory.createToy(toyType);
    }

}
