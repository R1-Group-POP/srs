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
    
    /**
     * Constructor
     * @param sagsKatalog 
     */
    public SOGNINGSHandler(SagsKatalog sagsKatalog) {
        this.sagsKatalog = sagsKatalog;
    }
    
    /**
     * Searches for a CPR and returns an ArrayList with all sager found
     * @param CPR
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> sogCPR(String CPR, boolean ui90d) {
        return sagsKatalog.sogCPR(CPR, ui90d);
    }
    
    /**
     * Searches for a paragraf and returns an ArrayList with all sager found
     * @param paragraf
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> sogParagraf(String paragraf, boolean ui90d) {
        return sagsKatalog.sogParagraf(paragraf, ui90d);
    }
    
    /**
     * Searches for a sagstype and returns an ArrayList with all sager found
     * @param sagstype
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> sogSagstype(String sagstype, boolean ui90d) {
        return sagsKatalog.sogSagstype(sagstype, ui90d);
    }
    
    /**
     * Returns alle sager
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> getAlleSager(boolean ui90d) {
        return sagsKatalog.getAlleSager(ui90d);
    }
    
    
}
