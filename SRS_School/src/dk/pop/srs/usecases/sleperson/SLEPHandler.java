/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.usecases.sleperson;

import dk.pop.srs.person.Person;
import dk.pop.srs.sag.SagsKatalog;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class SLEPHandler {
    private SagsKatalog sagsKatalog;

    /**
     * Constructor
     * @param sagsKatalog 
     */
    public SLEPHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }

    /**
     * Deletes a person
     * @param person
     * @return 
     */
    public boolean sletPerson(Person person) {
        return sagsKatalog.sletPerson(person);
    }

    /**
     * Gets a person from fornavn, mellemnavn, and efternavn
     * @param value
     * @return 
     */
    public ArrayList<Person> getPersonV2(String value) {
        return sagsKatalog.getPersonV2(value);
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
