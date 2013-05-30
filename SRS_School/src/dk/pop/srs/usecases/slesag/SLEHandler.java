package dk.pop.srs.usecases.slesag;

import dk.pop.srs.sag.Sag;
import dk.pop.srs.sag.SagsKatalog;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class SLEHandler {
    
    private SagsKatalog sagsKatalog;
    
    /**
     * Constructor
     * @param sagsKatalog 
     */
    public SLEHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }
    
    /**
     * Delete a sag
     * @param sag 
     */
    public void sletSag(Sag sag) {
        sagsKatalog.sletSag(sag);
    }
    
    /**
     * Get a persons sager
     * @param CPR
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> sogCPR(String CPR, boolean ui90d) {
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    /**
     * Check if a person exists
     * @param CPR
     * @return 
     */
    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkPersonExists(CPR);
    }
}
