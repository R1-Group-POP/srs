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

    public REGHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }

    //slet mig :Dhaihahi
    public void registrerSag(String sagsSted, String fornavn, String mellemnavn, String efternavn, String paragraf, String foranstalningsnavn, String beskrivelse, int periodeFra, int periodeTil, int aer, int sagsType, String betalingNavn, String betalingCPR, double betalingBelob, String CPR) {
        sagsKatalog.registrerSag(sagsSted, fornavn, mellemnavn, efternavn, paragraf, foranstalningsnavn, beskrivelse, periodeFra, periodeTil, aer, sagsType, betalingNavn, betalingCPR, betalingBelob, CPR);
    }
   public Person getPerson(String CPR){
       return sagsKatalog.getPerson(CPR);
   }
   
   public Betaler getBetaler(String BetalingCPR) {
       return sagsKatalog.getBetaler(BetalingCPR);
   }
}
