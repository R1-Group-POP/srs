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

    public Person() {
    }

    public Person(String cpr, String fornavn, String mellemnavn, String efternavn) {
        this.cpr = cpr;
        this.fornavn = fornavn;
        this.mellemnavn = mellemnavn;
        this.efternavn = efternavn;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getMellemnavn() {
        return mellemnavn;
    }

    public void setMellemnavn(String mellemnavn) {
        this.mellemnavn = mellemnavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public ArrayList<Sag> getSager() {
        return sager;
    }

    public void setSager(ArrayList<Sag> sager) {
        this.sager = sager;
    }

    public boolean add(Sag e) {
        return sager.add(e);
    }
    
    public int getArraySize() {
        return sager.size();
    }
    
    
    
}
