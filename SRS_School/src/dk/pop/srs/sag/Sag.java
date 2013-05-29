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

    /**
     * Default constructor
     */
    public Sag() {
    }

    /**
     * Second constructor
     * @param sagsSted
     * @param paragraf
     * @param foranstaltningsnavn
     * @param beskrivelse
     * @param person
     * @param betaler
     * @param betalingBelob
     * @param periodeFra
     * @param periodeTil
     * @param aer
     * @param sagstype 
     */
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

    /**
     * Returns sagsSted field
     * @return 
     */
    public String getSagsSted() {
        return sagsSted;
    }

    /**
     * Sets sagsSted field
     * @param sagsSted 
     */
    public void setSagsSted(String sagsSted) {
        this.sagsSted = sagsSted;
    }
    
    /**
     * Returns paragraf field
     * @return 
     */
    public String getParagraf() {
        return paragraf;
    }

    /**
     * Sets paragraf field
     * @param paragraf 
     */
    public void setParagraf(String paragraf) {
        this.paragraf = paragraf;
    }

    /**
     * Returns foranstaltningsnavn field
     * @return 
     */
    public String getForanstaltningsnavn() {
        return foranstaltningsnavn;
    }

    /**
     * Sets foranstaltningsnavn field
     * @param foranstaltningsnavn 
     */
    public void setForanstaltningsnavn(String foranstaltningsnavn) {
        this.foranstaltningsnavn = foranstaltningsnavn;
    }

    /**
     * Returns beskrivelse field
     * @return 
     */
    public String getBeskrivelse() {
        return beskrivelse;
    }

    /**
     * Sets beskrivelse field
     * @param beskrivelse 
     */
    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    /**
     * Returns person object
     * @return 
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets person object
     * @param person 
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * Returns betaler object
     * @return 
     */
    public Betaler getBetaler() {
        return betaler;
    }

    /**
     * Sets betaler object
     * @param betaler 
     */
    public void setBetaler(Betaler betaler) {
        this.betaler = betaler;
    }

    /**
     * Returns betalingBelob field
     * @return 
     */
    public double getBetalingBelob() {
        return betalingBelob;
    }

    /**
     * Sets betalingBelob field
     * @param betalingBelob 
     */
    public void setBetalingBelob(double betalingBelob) {
        this.betalingBelob = betalingBelob;
    }

    /**
     * Returns sagsID field
     * @return 
     */
    public int getSagsID() {
        return sagsID;
    }

    /**
     * Sets sagsID field
     * @param sagsID 
     */
    public void setSagsID(int sagsID) {
        this.sagsID = sagsID;
    }

    /**
     * Returns periodeFra field
     * @return 
     */
    public int getPeriodeFra() {
        return periodeFra;
    }

    /**
     * Sets periodeFra field
     * @param periodeFra 
     */
    public void setPeriodeFra(int periodeFra) {
        this.periodeFra = periodeFra;
    }

    /**
     * Returns periodeTil field
     * @return 
     */
    public int getPeriodeTil() {
        return periodeTil;
    }

    /**
     * Set periodeTil field
     * @param periodeTil 
     */
    public void setPeriodeTil(int periodeTil) {
        this.periodeTil = periodeTil;
    }

    /**
     * Returns aer field
     * @return 
     */
    public int getAer() {
        return aer;
    }

    /**
     * Sets aer field
     * @param aer 
     */
    public void setAer(int aer) {
        this.aer = aer;
    }

    /**
     * Returns sagstype field
     * @return 
     */
    public int getSagstype() {
        return sagstype;
    }

    /**
     * Sets sagstype field
     * @param sagstype 
     */
    public void setSagstype(int sagstype) {
        this.sagstype = sagstype;
    }
    
}
