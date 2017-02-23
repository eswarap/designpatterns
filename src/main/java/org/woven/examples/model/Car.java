package org.woven.examples.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car extends Toy {
    
    private final static Logger LOG = LoggerFactory.getLogger(Car.class);
    
    public Car(int _wheels) {
        this.wheels = _wheels;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public void drive() {
         LOG.info("i am driving car");   
    }
}
