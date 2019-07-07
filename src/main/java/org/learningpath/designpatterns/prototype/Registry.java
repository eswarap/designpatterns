/*
 * The content of this project itself is licensed under the Creative Commons Attribution 3.0 license,
 * and the underlying source code used to format and display that content is licensed under the MIT license.
 */

package org.learningpath.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String,Item> items = new HashMap<String,Item>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;

        try {
            item = (Item)(items.get(type)).clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }
    private void loadItems() {
        Movie movie = new Movie();
        movie.setTitle("Basic movie");
        movie.setPrice(24.99);
        movie.setRuntime("100 minutes");
        items.put("Movie",movie);

        Book book = new Book();
        book.setNumOfPage(328);
        book.setTitle("Basic book");
        book.setPrice(222.03);
        items.put("Book",book);
    }
}
