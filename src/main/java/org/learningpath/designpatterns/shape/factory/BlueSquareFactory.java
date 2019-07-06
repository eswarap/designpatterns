/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.shape.factory;

import org.learningpath.designpatterns.factory.AbstractFactory;
import org.learningpath.designpatterns.color.Blue;
import org.learningpath.designpatterns.color.Color;
import org.learningpath.designpatterns.color.ColorType;
import org.learningpath.designpatterns.color.ShapeType;
import org.learningpath.designpatterns.shape.model.Shape;
import org.learningpath.designpatterns.shape.model.Square;

/**
 * Created by EswaraP on 23-02-2017.
 */
public class BlueSquareFactory extends AbstractFactory {
    public Color getColor() {
    return new Blue(ColorType.BLUE);
    }
    public Shape getShape() {
     return new Square(ShapeType.SQUARE);
    }
}
