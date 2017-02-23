/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.woven.examples.shape.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.woven.examples.color.ShapeType;

import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by EswaraP on 23-02-2017.
 */
public class Square extends Shape{
    private static final Logger LOG = LoggerFactory.getLogger(Square.class);

    @Override
    public ShapeType getShapeType() {
        return this.shapeType;
    }

    public Square(ShapeType _shapeType) {
        this.shapeType = _shapeType;
    }
    public void draw(Graphics g) {
        LOG.info("i am a "+this.shapeType);
        g.drawRect(80,30,200,200);
    }
}
