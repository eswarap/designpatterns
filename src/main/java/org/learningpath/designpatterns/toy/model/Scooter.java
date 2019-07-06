/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.toy.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Scooter extends Toy {

    private final static Logger LOG = LoggerFactory.getLogger(Scooter.class);

    public Scooter(int _wheels) {
        this.wheels = _wheels;
    }

    @Override
    public int getWheels() {
        return this.wheels;
    }

    @Override
    public void drive() {
        LOG.info("i am driving scooter");
    }
}
