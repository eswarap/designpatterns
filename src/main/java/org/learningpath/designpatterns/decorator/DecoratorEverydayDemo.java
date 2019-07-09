/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DecoratorEverydayDemo {
    public static void main(String[] args) throws Exception {

        File file = new File("./output.txt");
        file.createNewFile();

        FileOutputStream oStream = new FileOutputStream(file);

        DataOutputStream doStream = new DataOutputStream(oStream);
        doStream.writeChars("text files");

        doStream.close();
        oStream.close();

    }
}
