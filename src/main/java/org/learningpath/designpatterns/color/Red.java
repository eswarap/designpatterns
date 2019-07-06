/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.color;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by EswaraP on 23-02-2017.
 */
public class Red extends Color {

    private static final Logger LOG = LoggerFactory.getLogger(Red.class);

    @Override
    public ColorType getColorType() {
        return this.colorType;
    }

    public Red(ColorType _colorType) {
        this.colorType = _colorType;
    }

    public void fill() {
        LOG.info("i am "+this.getColorType());
    }
}
