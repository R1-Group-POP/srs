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

    public REDPHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
        
    }

public Person getPerson(String CPR) {
return sagsKatalog.getPerson(CPR);
}

public boolean checkPersonExists(String CPR) {
    return sagsKatalog.checkPersonExists(CPR);
}

public void redigerPerson(String CPR, String fornavn, String mellemnavn, String efternavn) {
    sagsKatalog.redigerPerson(CPR, fornavn, mellemnavn, efternavn);    
}



}
