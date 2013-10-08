/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lib.model;

/**
 *
 * @author danecek
 */
public class Reader {

    public Reader(ReaderId id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    private ReaderId id;
    private String name;
    private Address address;

    /**
     * @return the id
     */
    public ReaderId getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }
}
