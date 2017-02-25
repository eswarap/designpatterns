/**
 * The content of this project itself is licensed under the 
 * Creative Commons Attribution 3.0 license,and the underlying source code used to format 
 * and display that content is licensed under the MIT license.
 */

package org.woven.examples.toy.model;

import org.woven.examples.toy.exception.ToyTypeNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NullToy extends Toy {

    private static final Logger LOG = LoggerFactory.getLogger(NullToy.class);

    /**
     * Class constructor with no arguments
     * 
     * @throws ToyTypeNotFoundException
     */
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
