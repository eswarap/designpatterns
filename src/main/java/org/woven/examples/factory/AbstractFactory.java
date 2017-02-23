/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.woven.examples.factory;

import org.woven.examples.color.Color;
import org.woven.examples.shape.model.Shape;

/**
 * Created by EswaraP on 23-02-2017.
 */
public abstract class AbstractFactory {

    protected abstract Color getColor();
    protected abstract Shape getShape();
}
