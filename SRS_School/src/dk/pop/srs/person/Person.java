/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.person;

import dk.pop.srs.sag.Sag;
import java.util.ArrayList;

/**
 *
 * @author patrick
 */
public class Person {
    private String cpr;
    private String fornavn;
    private String mellemnavn;
    private String efternavn;
    
    private ArrayList<Sag> sager = new ArrayList<>();

    /**
     * Default constructor
     */
    public Person() {
    }

    /**
     * Second constructor
     * @param cpr
     * @param fornavn
     * @param mellemnavn
     * @param efternavn 
     */
    public Person(String cpr, String fornavn, String mellemnavn, String efternavn) {
        this.cpr = cpr;
        this.fornavn = fornavn;
        this.mellemnavn = mellemnavn;
        this.efternavn = efternavn;
    }

    /**
     * Resturn cpr field
     * @return 
     */
    public String getCpr() {
        return cpr;
    }

    /**
     * Sets cpr field
     * @param cpr 
     */
    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    /**
     * Returns fornavn field
     * @return 
     */
    public String getFornavn() {
        return fornavn;
    }

    /**
     * Sets fornavn field
     * @param fornavn 
     */
    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    /**
     * Returns mellemnavn field
     * @return 
     */
    public String getMellemnavn() {
        return mellemnavn;
    }

    /**
     * Sets mellemnavn field
     * @param mellemnavn 
     */
    public void setMellemnavn(String mellemnavn) {
        this.mellemnavn = mellemnavn;
    }

    /**
     * Returns efternavn field
     * @return 
     */
    public String getEfternavn() {
        return efternavn;
    }

    /**
     * Sets efternavn field
     * @param efternavn 
     */
    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    /**
     * Returns sager ArrayList
     * @return 
     */
    public ArrayList<Sag> getSager() {
        return sager;
    }

    /**
     * Sets sager ArrayList
     * @param sager 
     */
    public void setSager(ArrayList<Sag> sager) {
        this.sager = sager;
    }

    /**
     * Adds a Sag object to sager ArrayList
     * @param e
     * @return 
     */
    public boolean add(Sag e) {
        return sager.add(e);
    }
    
    /**
     * Removes a Sag object from sager ArrayList
     * @return 
     */
    public int getArraySize() {
        return sager.size();
    }
    
    public boolean remove(Sag e) {
        return sager.remove(e);
    }
    
    
    
}
