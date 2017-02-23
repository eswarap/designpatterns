/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */


package org.woven.examples.shape.factory;

import org.woven.examples.color.Color;
import org.woven.examples.color.ColorType;
import org.woven.examples.color.Red;
import org.woven.examples.color.ShapeType;
import org.woven.examples.factory.AbstractFactory;
import org.woven.examples.shape.model.Circle;
import org.woven.examples.shape.model.Shape;

/**
 * Created by EswaraP on 23-02-2017.
 */
public class RedCircleFactory extends AbstractFactory{
    public Color getColor(ColorType colorType) {
    return new Red(ColorType.RED);
    }
    public Shape getShape(ShapeType shapeType) {
     return new Circle(ShapeType.CIRCLE);
    }
}
