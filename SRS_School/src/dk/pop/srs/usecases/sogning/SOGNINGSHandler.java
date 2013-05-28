package dk.pop.srs.usecases.sogning;

import dk.pop.srs.sag.Sag;
import dk.pop.srs.sag.SagsKatalog;
import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class SOGNINGSHandler {
    
    private SagsKatalog sagsKatalog;
    
    public SOGNINGSHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }
    
    public ArrayList<Sag> sogCPR(String CPR, boolean ui90d) {
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    public ArrayList<Sag> sogParagraf(String paragraf, boolean ui90d) {
        return sagsKatalog.sogParagraf(paragraf, ui90d);
    }
    
    public ArrayList<Sag> sogSagstype(String sagstype, boolean ui90d) {
        return sagsKatalog.sogSagstype(sagstype, ui90d);
    }
    
    public ArrayList<Sag> getAlleSager(boolean ui90d) {
        return sagsKatalog.getAlleSager(ui90d);
    }
    
    
}
