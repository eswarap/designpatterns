package org.woven.example.java;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.woven.examples.exception.ToyTypeNotFoundException;
import org.woven.examples.factorymethod.ToysFactory;
import org.woven.examples.model.Toy;
import org.woven.examples.model.ToyType;
import org.woven.examples.simplefactory.SimpleFactory;
import org.woven.examples.simplefactory.SimpleToysFactory;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class ToyFactoryTest {

    SimpleFactory simpleFactory;
    ToysFactory   toysFactory;
    SimpleToysFactory simpleToysFactory;

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

        toy = toysFactory.produceToy(ToyType.CAR);
        toy.drive();

        toy = toysFactory.produceToy(ToyType.SCOOTER);
        toy.drive();

    }

    @Test(expected = ToyTypeNotFoundException.class)
    public void testToyFactoryWithException() throws Exception {
        Toy toy = toysFactory.produceToy(ToyType.NONE);
        toy.drive();
    }
}
