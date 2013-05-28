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

    public void sletPerson(Person person) {
        sagsKatalog.sletPerson(person);
    }

    public ArrayList<Person> getPersonV2(String value) {
        return sagsKatalog.getPersonV2(value);
    }

    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkValueExists("CPR", CPR, "person");
    }
}
