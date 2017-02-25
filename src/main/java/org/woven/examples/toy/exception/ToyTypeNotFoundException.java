/**
 * The content of this project itself is licensed under the 
 * Creative Commons Attribution 3.0 license,and the underlying source code used to format 
 * and display that content is licensed under the MIT license.
 */

package org.woven.examples.toy.exception;

/**
 * Custom exception for Undefined toy types
 */
public class ToyTypeNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Class Constructor with argument String
     *
     * @param String
     */
    public ToyTypeNotFoundException(String message) {
        super(message);
    }
}
