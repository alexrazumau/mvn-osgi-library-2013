/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lib.model;

import java.util.Date;

/**
 *
 * @author danecek
 */
public class Borrow {

    ReaderId readerId;
    BookId bookId;
    Date date;

    public Borrow(ReaderId readerId, BookId bookId) {
        this.readerId = readerId;
        this.bookId = bookId;
        date = new Date();
    }
}
