/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lib.controller;

import javax.swing.JMenuBar;

/**
 *
 * @author danecek
 */
public class LibraryMenuBar extends JMenuBar {

    public LibraryMenuBar() {
        add(new FileMenu());
        add(new BookMenu());
    }
    
    
}
