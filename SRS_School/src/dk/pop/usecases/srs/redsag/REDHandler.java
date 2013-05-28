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

    public REDHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }
    
    public void gemSag(Sag sag, boolean betalerChanged) {
        sagsKatalog.gemSag(sag, betalerChanged);
    }

    public Person getPerson(String CPR) {
        return sagsKatalog.getPerson(CPR);
    }

    public Betaler getBetaler(String BetalingCPR) {
        return sagsKatalog.getBetaler(BetalingCPR);
    }
    
    public ArrayList<Sag> getPersonsSager(String CPR, boolean ui90d) {
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkValueExists("CPR", CPR, "person");
    }
}
