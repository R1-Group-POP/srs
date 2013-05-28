package dk.pop.srs;

import dk.pop.srs.sag.SagsKatalog;
import dk.pop.srs.database.SagDAO;
import dk.pop.srs.database.util.DBTool;
import dk.pop.srs.usecases.sleperson.SLEPGUI;
import dk.pop.srs.usecases.sleperson.SLEPHandler;
import dk.pop.usecases.srs.redsag.REDHSGUI;
import dk.pop.usecases.srs.redsag.REDHandler;
import dk.pop.usecases.srs.regsag.REGGUI;
import dk.pop.usecases.srs.regsag.REGHandler;
import dk.pop.srs.usecases.slesag.SLEGUI;
import dk.pop.srs.usecases.slesag.SLEHandler;
import dk.pop.srs.usecases.sogning.SOGNINGSHandler;
import dk.pop.usecases.srs.redsag.REDGUI;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Patrick
 */
public class SRS {

    private Connection dbConn;
    private SagDAO sagDAO;
    
    private SagsKatalog sagsKatalog;
    private REGHandler rEGSHandler;
    private SOGNINGSHandler sOGNINGSHandler;
    private SLEHandler sLEHandler;
    private REDHandler rEDHandler;
    private SLEPHandler sLEPHandler;
    
    private REDGUI rEDGUI;
    private REDHSGUI rEDHSGUI;
    private SLEGUI sLEGUI;
    private REGGUI rEGSGUI;
    private HovedGUI hovedGUI;
    private SLEPGUI sLEPGUI;
    

    public SRS() {
        dbConn = DBTool.getInstance();
        sagDAO = new SagDAO(dbConn);
        
        sagsKatalog = new SagsKatalog(sagDAO);
        rEGSHandler = new REGHandler(sagsKatalog);
        sOGNINGSHandler = new SOGNINGSHandler(sagsKatalog);
        sLEHandler = new SLEHandler(sagsKatalog);
        rEDHandler = new REDHandler(sagsKatalog);
        sLEPHandler = new SLEPHandler(sagsKatalog);
        
        rEDGUI = new REDGUI(hovedGUI, true, rEDHandler);
        rEDHSGUI = new REDHSGUI(hovedGUI, true, rEDHandler, rEDGUI);
        sLEGUI = new SLEGUI(hovedGUI, true, sLEHandler);
        rEGSGUI = new REGGUI(hovedGUI, true, rEGSHandler);
        sLEPGUI = new SLEPGUI(hovedGUI, true, sLEPHandler);
        hovedGUI = new HovedGUI(rEGSGUI, sLEGUI, rEDHSGUI, sOGNINGSHandler);
        
    }

    public static void main(String[] args) throws SQLException {
        SRS srs = new SRS();
        srs.hovedGUI.setVisible(true);
    }
}
