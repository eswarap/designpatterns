package com.codenvy.example.java;

import static org.junit.Assert.assertTrue;

import org.eclipse.che.examples.ToysFactory;
import org.eclipse.che.examples.exception.ToyTypeNotFoundException;
import org.eclipse.che.examples.model.Toy;
import org.eclipse.che.examples.model.ToyType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit test for simple App.
 */
@RunWith(JUnit4.class)
public class AppTest {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testToyFactory() throws Exception {
        ToysFactory toysFactory = new ToysFactory();
        Toy toy = toysFactory.produceToy(ToyType.TRUCK);
        toy.drive();

        toy = toysFactory.produceToy(ToyType.CAR);
        toy.drive();

        toy = toysFactory.produceToy(ToyType.SCOOTER);
        toy.drive();

    }

    @Test(expected=ToyTypeNotFoundException.class)
    public void testToyFactoryWithException() throws Exception {
        ToysFactory toysFactory = new ToysFactory();
        Toy toy = toysFactory.produceToy(ToyType.NONE);
        toy.drive();
    }
}
