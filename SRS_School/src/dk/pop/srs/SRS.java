package dk.pop.srs;

import dk.pop.srs.sag.SagsKatalog;
import dk.pop.srs.database.SagDAO;
import dk.pop.srs.database.util.DBTool;
import dk.pop.srs.usecases.redperson.REDPGUI;
import dk.pop.srs.usecases.redperson.REDPHandler;
import dk.pop.srs.usecases.slebetaler.SLEBGUI;
import dk.pop.srs.usecases.slebetaler.SLEBHandler;
import dk.pop.srs.usecases.sleperson.SLEPGUI;
import dk.pop.srs.usecases.sleperson.SLEPHandler;
import dk.pop.srs.usecases.redsag.REDHSGUI;
import dk.pop.srs.usecases.redsag.REDHandler;
import dk.pop.srs.usecases.regsag.REGGUI;
import dk.pop.srs.usecases.regsag.REGHandler;
import dk.pop.srs.usecases.slesag.SLEGUI;
import dk.pop.srs.usecases.slesag.SLEHandler;
import dk.pop.srs.usecases.sogning.SOGNINGSHandler;
import dk.pop.srs.usecases.redsag.REDGUI;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Patrick
 */
public class SRS {

    /**
     * Database
     */
    private Connection dbConn;
    private SagDAO sagDAO;
    
    /**
     * Handler and information expert
     */
    private SagsKatalog sagsKatalog;
    private REGHandler rEGSHandler;
    private SOGNINGSHandler sOGNINGSHandler;
    private SLEHandler sLEHandler;
    private REDHandler rEDHandler;
    private SLEPHandler sLEPHandler;
    private REDPHandler rEDPHandler;
    private SLEBHandler sLEBHandler;
    
    /**
     * GUI
     */
    private REDGUI rEDGUI;
    private REDHSGUI rEDHSGUI;
    private SLEGUI sLEGUI;
    private REGGUI rEGSGUI;
    private HovedGUI hovedGUI;
    private SLEPGUI sLEPGUI;
    private SLEBGUI sLEBGUI;
    private REDPGUI rEDPGUI;

    /**
     * Constructor
     */
    public SRS() {
        dbConn = DBTool.getInstance();
        sagDAO = new SagDAO(dbConn);
        
        sagsKatalog = new SagsKatalog(sagDAO);
        rEGSHandler = new REGHandler(sagsKatalog);
        sOGNINGSHandler = new SOGNINGSHandler(sagsKatalog);
        sLEHandler = new SLEHandler(sagsKatalog);
        rEDHandler = new REDHandler(sagsKatalog);
        sLEPHandler = new SLEPHandler(sagsKatalog);
        rEDPHandler = new REDPHandler(sagsKatalog);
        sLEBHandler = new SLEBHandler(sagsKatalog);
        
        sLEBGUI = new SLEBGUI(hovedGUI, true, sLEBHandler);
        rEDGUI = new REDGUI(hovedGUI, true, rEDHandler);
        rEDHSGUI = new REDHSGUI(hovedGUI, true, rEDHandler, rEDGUI);
        sLEGUI = new SLEGUI(hovedGUI, true, sLEHandler);
        rEGSGUI = new REGGUI(hovedGUI, true, rEGSHandler);
        sLEPGUI = new SLEPGUI(hovedGUI, true, sLEPHandler);
        rEDPGUI = new REDPGUI(hovedGUI, true, rEDPHandler);
        hovedGUI = new HovedGUI(rEGSGUI, sLEGUI, rEDHSGUI, sOGNINGSHandler, sLEPGUI, rEDPGUI, sLEBGUI);
        
    }

    /**
     * Main method
     * @param args
     * @throws SQLException 
     */
    public static void main(String[] args) throws SQLException {
        SRS srs = new SRS();
        srs.hovedGUI.setVisible(true);
    }
}
