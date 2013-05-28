/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.sag;

import dk.pop.srs.betaler.Betaler;
import dk.pop.srs.person.Person;

/**
 *
 * @author patrick
 */
public class Sag {
    private String sagsSted;
    private String paragraf;
    private String foranstaltningsnavn;
    private String beskrivelse;
    
    private Person person;
    private Betaler betaler;
    
    private double betalingBelob;
    
    private int sagsID;
    private int periodeFra;
    private int periodeTil;
    private int aer;
    private int sagstype;

    public Sag() {
    }

    public Sag(String sagsSted, String paragraf, String foranstaltningsnavn, String beskrivelse, Person person, Betaler betaler, double betalingBelob, int periodeFra, int periodeTil, int aer, int sagstype) {
        this.sagsSted = sagsSted;
        this.paragraf = paragraf;
        this.foranstaltningsnavn = foranstaltningsnavn;
        this.beskrivelse = beskrivelse;
        this.person = person;
        this.betaler = betaler;
        this.betalingBelob = betalingBelob;
        this.periodeFra = periodeFra;
        this.periodeTil = periodeTil;
        this.aer = aer;
        this.sagstype = sagstype;
    }

    public String getSagsSted() {
        return sagsSted;
    }

    public void setSagsSted(String sagsSted) {
        this.sagsSted = sagsSted;
    }

    public String getParagraf() {
        return paragraf;
    }

    public void setParagraf(String paragraf) {
        this.paragraf = paragraf;
    }

    public String getForanstaltningsnavn() {
        return foranstaltningsnavn;
    }

    public void setForanstaltningsnavn(String foranstaltningsnavn) {
        this.foranstaltningsnavn = foranstaltningsnavn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Betaler getBetaler() {
        return betaler;
    }

    public void setBetaler(Betaler betaler) {
        this.betaler = betaler;
    }

    public double getBetalingBelob() {
        return betalingBelob;
    }

    public void setBetalingBelob(double betalingBelob) {
        this.betalingBelob = betalingBelob;
    }

    public int getSagsID() {
        return sagsID;
    }

    public void setSagsID(int sagsID) {
        this.sagsID = sagsID;
    }

    public int getPeriodeFra() {
        return periodeFra;
    }

    public void setPeriodeFra(int periodeFra) {
        this.periodeFra = periodeFra;
    }

    public int getPeriodeTil() {
        return periodeTil;
    }

    public void setPeriodeTil(int periodeTil) {
        this.periodeTil = periodeTil;
    }

    public int getAer() {
        return aer;
    }

    public void setAer(int aer) {
        this.aer = aer;
    }

    public int getSagstype() {
        return sagstype;
    }

    public void setSagstype(int sagstype) {
        this.sagstype = sagstype;
    }
    
}
