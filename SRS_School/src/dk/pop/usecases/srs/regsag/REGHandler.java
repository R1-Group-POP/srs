/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.usecases.srs.regsag;

import dk.pop.srs.betaler.Betaler;
import dk.pop.srs.person.Person;
import dk.pop.srs.sag.SagsKatalog;

/**
 *
 * @author Oliverbærbar
 */
public class REGHandler {

    private SagsKatalog sagsKatalog;

    /**
     * Constructor
     *
     * @param sagsKatalog
     */
    public REGHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }

    /**
     * Registers a new Sag
     *
     * @param sagsSted
     * @param fornavn
     * @param mellemnavn
     * @param efternavn
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
     * @param CPR
     */
    public void registrerSag(String sagsSted, String fornavn, String mellemnavn, String efternavn, String paragraf, String foranstalningsnavn, String beskrivelse, int periodeFra, int periodeTil, int aer, int sagsType, String betalingNavn, String betalingCPR, double betalingBelob, String CPR) {
        sagsKatalog.registrerSag(sagsSted, fornavn, mellemnavn, efternavn, paragraf, foranstalningsnavn, beskrivelse, periodeFra, periodeTil, aer, sagsType, betalingNavn, betalingCPR, betalingBelob, CPR);
    }

    /**
     * Returns a person object fround by cpr
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
}
