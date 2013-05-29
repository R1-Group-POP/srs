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
    
    public SLEHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }
    
    public void sletSag(Sag sag) {
        sagsKatalog.sletSag(sag);
    }
    
    public ArrayList<Sag> sogCPR(String CPR, boolean ui90d) {
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    public boolean checkPersonExists(String CPR) {
        return sagsKatalog.checkValueExists("CPR", CPR, "person");
    }
}
