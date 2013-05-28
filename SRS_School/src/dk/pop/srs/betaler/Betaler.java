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

    public Betaler() {
    }

    public Betaler(String betalingCPR, String betalingNavn) {
        this.betalingCPR = betalingCPR;
        this.betalingNavn = betalingNavn;
    }

    public String getBetalingCPR() {
        return betalingCPR;
    }

    public void setBetalingCPR(String betalingCPR) {
        this.betalingCPR = betalingCPR;
    }

    public String getBetalingNavn() {
        return betalingNavn;
    }

    public void setBetalingNavn(String betalingNavn) {
        this.betalingNavn = betalingNavn;
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
    
    
    
    
}
