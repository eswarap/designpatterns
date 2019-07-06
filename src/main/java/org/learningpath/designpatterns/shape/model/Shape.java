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

package org.learningpath.designpatterns.shape.model;

import org.learningpath.designpatterns.color.ShapeType;

import java.awt.*;

/**
 * Created by EswaraP on 23-02-2017.
 */
public abstract class Shape {
    protected ShapeType shapeType;

    public abstract ShapeType getShapeType();

    public abstract void draw(Graphics g);
}
