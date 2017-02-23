/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.woven.example.toy;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.woven.examples.toy.exception.ToyTypeNotFoundException;
import org.woven.examples.toy.factorymethod.ToysFactory;
import org.woven.examples.toy.model.Toy;
import org.woven.examples.toy.model.ToyType;
import org.woven.examples.toy.simplefactory.SimpleFactory;
import org.woven.examples.toy.simplefactory.SimpleToysFactory;

/**
 * Unit test for ToyFactory App.
 */
@RunWith(JUnit4.class)
public class ToyFactoryTest {

    private final static Logger LOG = LoggerFactory.getLogger(ToyFactoryTest.class);

    SimpleFactory               simpleFactory;
    ToysFactory                 toysFactory;
    SimpleToysFactory           simpleToysFactory;

    @Before
    public void setUp() {
        simpleFactory = new SimpleFactory();
        toysFactory = new ToysFactory(simpleFactory);
        simpleToysFactory = new SimpleToysFactory(simpleFactory);
    }

    @Test
    public void testSimplesToyFactory() throws Exception {

        Toy toy = simpleToysFactory.produceToy(ToyType.TRUCK);
        toy.drive();

        toy = simpleToysFactory.produceToy(ToyType.CAR);
        toy.drive();

        toy = simpleToysFactory.produceToy(ToyType.SCOOTER);
        toy.drive();

    }

    @Test(expected = ToyTypeNotFoundException.class)
    public void testSimplesToyFactoryWithException() throws Exception {
        Toy toy = simpleToysFactory.produceToy(ToyType.NONE);
        toy.drive();
    }

    @Test
    public void testToyFactory() throws Exception {

        Toy toy = toysFactory.produceToy(ToyType.TRUCK);
        toy.drive();
        LOG.info("No of wheels " + toy.getWheels());

        toy = toysFactory.produceToy(ToyType.CAR);
        toy.drive();
        LOG.info("No of wheels " + toy.getWheels());

        toy = toysFactory.produceToy(ToyType.SCOOTER);
        toy.drive();
        LOG.info("No of wheels " + toy.getWheels());
    }

    @Test(expected = ToyTypeNotFoundException.class)
    public void testToyFactoryWithException() throws Exception {
        Toy toy = toysFactory.produceToy(ToyType.NONE);
        toy.drive();
        LOG.info("No of wheels" + toy.getWheels());
    }
}
