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
    
    public boolean gemSag(Sag newSag, Sag originSag, boolean betalerChanged) {
        return sagsKatalog.gemSag(newSag, originSag, betalerChanged);
    }

    public Person getPerson(String CPR) {
        return sagsKatalog.getPerson(CPR);
    }

    public Betaler getBetaler(String BetalingCPR) {
        return sagsKatalog.getBetaler(BetalingCPR);
    }
    
    public boolean checkBetalerExists(String betalingCPR) {
        return sagsKatalog.checkBetalerExists(betalingCPR);
    }
    
    public ArrayList<Sag> getPersonsSager(String CPR, boolean ui90d) {
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkValueExists("CPR", CPR, "person");
    }
}
