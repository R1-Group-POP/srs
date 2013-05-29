/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.usecases.srs.redsag;

import dk.pop.srs.betaler.Betaler;
import dk.pop.srs.person.Person;
import dk.pop.srs.sag.Sag;
import dk.pop.srs.sag.SagsKatalog;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class REDHandler {

    private SagsKatalog sagsKatalog;

    /**
     * Constructor
     * @param sagsKatalog 
     */
    public REDHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }
    
    /**
     * Saves a sag object
     * @param sagsSted
     * @param paragraf
     * @param foranstalningsnavn
     * @param beskrivelse
     * @param periodeFra
     * @param periodeTil
     * @param aer
     * @param sagsType
     * @param betalingNavn
     * @param betalingCPR
     * @param betalingBelob
     * @param originSag
     * @return 
     */
    public boolean gemSag(String sagsSted, String paragraf, String foranstalningsnavn, String beskrivelse, int periodeFra, int periodeTil, int aer, int sagsType, String betalingNavn, String betalingCPR, double betalingBelob, Sag originSag) {
        return sagsKatalog.gemSag(sagsSted, paragraf, foranstalningsnavn, beskrivelse, periodeFra, periodeTil, aer, sagsType, betalingNavn, betalingCPR, betalingBelob, originSag);
    }

    /**
     * Returns a person object found by cpr
     * @param CPR
     * @return 
     */
    public Person getPerson(String CPR) {
        return sagsKatalog.getPerson(CPR);
    }

    /**
     * Returns a betaler object found by betalingCPR
     * @param BetalingCPR
     * @return 
     */
    public Betaler getBetaler(String BetalingCPR) {
        return sagsKatalog.getBetaler(BetalingCPR);
    }
    
    /**
     * Checks if a betaler exists
     * @param betalingCPR
     * @return 
     */
    public boolean checkBetalerExists(String betalingCPR) {
        return sagsKatalog.checkBetalerExists(betalingCPR);
    }
    
    /**
     * Returns an ArrayList with persons sager
     * @param CPR
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> getPersonsSager(String CPR, boolean ui90d) {
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    /**
     * Checks if a person exists
     * @param CPR
     * @return 
     */
    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkValueExists("CPR", CPR, "person");
    }
}
