/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.usecases.slebetaler;

import dk.pop.srs.betaler.Betaler;
import dk.pop.srs.sag.SagsKatalog;
import java.util.ArrayList;

/**
 *
 * @author patrick
 */
public class SLEBHandler {
    
    private SagsKatalog sagsKatalog;
    
    /**
     * Constructor
     * @param sagsKatalog 
     */
    public SLEBHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }
    
    /**
     * Deletes a betaler
     * @param betaler
     * @return 
     */
    public boolean sletBetaler(Betaler betaler) {
        return sagsKatalog.sletBetaler(betaler);
    }
    
    /**
     * Returns a betaler
     * @param value
     * @return 
     */
    public ArrayList<Betaler> getBetalerV2(String value) {
        return sagsKatalog.getBetalerV2(value);
    }
    
    /**
     * Checks if a betaler exists
     * @param betalingCPR
     * @return 
     */
    public boolean checkBetalerExists(String betalingCPR) {
        return sagsKatalog.checkValueExists("betalingCPR", betalingCPR, "betaler");
    }
    
    /**
     * Returns all betalere
     * @return 
     */
    public ArrayList<Betaler> getAlleBetalere(){
        return sagsKatalog.getAlleBetalere();
    }
}
