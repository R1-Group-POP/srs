/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.usecases.redperson;

import dk.pop.srs.person.Person;
import dk.pop.srs.sag.SagsKatalog;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class REDPHandler {

    private SagsKatalog sagsKatalog;

    /**
     * Constructor
     * @param sagsKatalog 
     */
    public REDPHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }

    /**
     * Returns a person object found by CPR
     * @param CPR
     * @return 
     */
    public Person getPerson(String CPR) {
        return sagsKatalog.getPerson(CPR);
    }

    /**
     * Checks if a person exists
     * @param CPR
     * @return 
     */
    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkPersonExists(CPR);
    }

    /**
     * Saves a person with the new variables
     * @param CPR
     * @param fornavn
     * @param mellemnavn
     * @param efternavn 
     */
    public void redigerPerson(String CPR, String fornavn, String mellemnavn, String efternavn) {
        sagsKatalog.redigerPerson(CPR, fornavn, mellemnavn, efternavn);
    }
}
