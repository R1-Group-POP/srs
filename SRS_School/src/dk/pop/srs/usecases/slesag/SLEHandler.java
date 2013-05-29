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
    
<<<<<<< HEAD
    public ArrayList<Sag> sogCPR(String CPR, boolean ui90d) {
=======
    /**
     * Get a persons sager
     * @param CPR
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> getPersonsSager(String CPR, boolean ui90d) {
>>>>>>> 2151bf72cf95e502d1bceaf7c94a6abd0b903104
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    /**
     * Check if a person exists
     * @param CPR
     * @return 
     */
    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkValueExists("CPR", CPR, "person");
    }
}
