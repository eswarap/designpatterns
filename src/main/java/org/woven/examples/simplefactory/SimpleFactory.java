package org.woven.examples.simplefactory;

import org.woven.examples.exception.ToyTypeNotFoundException;
import org.woven.examples.model.Car;
import org.woven.examples.model.NullToy;
import org.woven.examples.model.Scooter;
import org.woven.examples.model.Toy;
import org.woven.examples.model.ToyType;
import org.woven.examples.model.Truck;

public class SimpleFactory {

    public Toy createToy(ToyType toyType) throws ToyTypeNotFoundException {
        Toy toy;
        switch(toyType) {
            case CAR : toy = new Car(4);break;
            case TRUCK : toy = new Truck(6);break;
            case SCOOTER : toy = new Scooter(2);break;
            default : toy = new NullToy();
        }

        return toy;
    }
}
