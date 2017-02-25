/**
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */


package org.woven.examples.shape.model;

import org.woven.examples.color.ShapeType;


/**
 * Created by EswaraP on 23-02-2017.
 */
public abstract class Shape {
    
    protected ShapeType shapeType;

    public abstract ShapeType getShapeType();

    public abstract void draw();
}
