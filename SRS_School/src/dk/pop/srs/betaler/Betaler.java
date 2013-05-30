/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.betaler;

import dk.pop.srs.sag.Sag;
import java.util.ArrayList;

/**
 *
 * @author patrick
 */
public class Betaler {
    private String betalingCPR;
    private String betalingNavn;
    
    private ArrayList<Sag> sager = new ArrayList<>();

    /**
     * Default constructor
     */
    public Betaler() {
    }

    /**
     * Second constrcutor
     * @param betalingCPR
     * @param betalingNavn 
     */
    public Betaler(String betalingCPR, String betalingNavn) {
        this.betalingCPR = betalingCPR;
        this.betalingNavn = betalingNavn;
    }

    /**
     * Returns betalingCPR field
     * @return 
     */
    public String getBetalingCPR() {
        return betalingCPR;
    }

    /**
     * Sets betalingCPR field
     * @param betalingCPR 
     */
    public void setBetalingCPR(String betalingCPR) {
        this.betalingCPR = betalingCPR;
    }

    /**
     * Returns betalingNavn field
     * @return 
     */
    public String getBetalingNavn() {
        return betalingNavn;
    }

    /**
     * Sets betalingNavn field
     * @param betalingNavn 
     */
    public void setBetalingNavn(String betalingNavn) {
        this.betalingNavn = betalingNavn;
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
     * Add a Sag object to sager ArrayList
     * @param e
     * @return 
     */
    public boolean add(Sag e) {
        return sager.add(e);
    }
    
    /**
     * Remove a Sag object from sager ArrayList
     * @param e
     * @return 
     */
    public boolean remove(Sag e) {
        return sager.remove(e);
    }
    
    /**
     * Returns the size og the sager ArrayList
     * @return 
     */
    public int getArraySize() {
        return sager.size();
    }
    
    
    
    
}
