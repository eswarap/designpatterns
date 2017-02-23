package org.eclipse.che.examples.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Truck extends Toy {
    
     private final static Logger LOG = LoggerFactory.getLogger(Truck.class);
    
    public Truck(int _wheels) {
        this.wheels = _wheels;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public void drive() {
         LOG.info("i am driving truck");   
    }
}
