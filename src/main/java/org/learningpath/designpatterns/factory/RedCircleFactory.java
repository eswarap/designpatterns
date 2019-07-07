/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */


package org.learningpath.designpatterns.factory;

import org.learningpath.designpatterns.factory.AbstractFactory;
import org.learningpath.designpatterns.factory.model.color.Color;
import org.learningpath.designpatterns.factory.model.color.ColorType;
import org.learningpath.designpatterns.factory.model.color.Red;
import org.learningpath.designpatterns.factory.model.color.ShapeType;
import org.learningpath.designpatterns.factory.model.shape.Circle;
import org.learningpath.designpatterns.factory.model.shape.Shape;

/**
 * Created by EswaraP on 23-02-2017.
 */
public class RedCircleFactory extends AbstractFactory {

    public Color getColor() {
    return new Red(ColorType.RED);
    }
    public Shape getShape() {
     return new Circle(ShapeType.CIRCLE);
    }
}
