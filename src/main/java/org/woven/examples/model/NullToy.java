package org.woven.examples.model;

import org.woven.examples.exception.ToyTypeNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NullToy extends Toy {

    private final static Logger LOG = LoggerFactory.getLogger(NullToy.class);

    public NullToy() throws ToyTypeNotFoundException {
        this.wheels = -1;
        throw new ToyTypeNotFoundException("ToyType is either null or ot found");
    }

    @Override
    public void drive() {
        LOG.info("i am not a toy");
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }
}
