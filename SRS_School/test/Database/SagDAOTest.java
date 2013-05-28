///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package Database;
//
//import Database.util.DBTool;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Patrick
// */
//public class SagDAOTest {
//    static Connection conn;
//    static SagDAO instance;
//    
//    public SagDAOTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//        conn = DBTool.getInstance();
//        instance = new SagDAO(conn);
//        
//        try {
//            Statement st = conn.createStatement();
//            st.execute("DELETE FROM `sager` WHERE `CPR`='2104892119'");
//            st.execute("DELETE FROM `personer` WHERE `CPR`='2104892119'");
//            st.execute("DELETE FROM `betalere` WHERE `BetalingCPR`='2104892119'");
//        } catch (SQLException ex) {
//            Logger.getLogger(SagDAOTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        instance.registrerSag("1439", "Patrick", "", "Kann", "§14 stk 3", "Din mor", "Hos din mor", 1, 5, 0, 2, "Patrick Kann", "2104892119", 1000, "2104892119");
//        instance.registrerSag("1439", "Patrick", "", "Kann", "§14 stk 3", "Din far", "Hos din far", 1, 5, 0, 2, "Patrick Kann", "2104892119", 1000, "2104892119");
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//        try {
//            Statement st = conn.createStatement();
//            st.execute("DELETE FROM `sager` WHERE `CPR`='2104892119'");
//            st.execute("DELETE FROM `personer` WHERE `CPR`='2104892119'");
//            st.execute("DELETE FROM `betalere` WHERE `BetalingCPR`='2104892119'");
//        } catch (SQLException ex) {
//            Logger.getLogger(SagDAOTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of registrerSag method, of class SagDAO.
//     */
//    @Test
//    public void testRegistrerSag() {
//        System.out.println("registrerSag");
//        String sagsSted = "1439";
//        String fornavn = "Patrick";
//        String mellemnavn = "";
//        String efternavn = "Kann";
//        String paragraf = "§14 stk 3";
//        String foranstaltningsnavn = "Din mor";
//        String beskrivelse = "Hos din mor";
//        int periodeFra = 1;
//        int periodeTil = 5;
//        int aer = 0;
//        int sagsType = 2;
//        String betalingNavn = "Patrick kann";
//        String betalingCPR = "2104892119";
//        double betalingBelob = 1000;
//        String CPR = "2104892119";
//        
//        instance.registrerSag(sagsSted, fornavn, mellemnavn, efternavn, paragraf, foranstaltningsnavn, beskrivelse, periodeFra, periodeTil, aer, sagsType, betalingNavn, betalingCPR, betalingBelob, CPR);
//    }
//
//    /**
//     * Test of getPerson method, of class SagDAO.
//     */
//    @Test
//    public void testGetPerson() {
//        System.out.println("getPerson");
//        String CPR = "2104892119";
//
//        String[] expResult = {"Patrick", "", "Kann"};
//        String[] result = instance.getPerson(CPR);
//        assertArrayEquals(expResult, result);
//    }
//
//    /**
//     * Test of getBetaler method, of class SagDAO.
//     */
//    @Test
//    public void testGetBetaler() {
//        System.out.println("getBetaler");
//        String betalingCPR = "2104892119";
//
//        String[] expResult = {"Patrick Kann"};
//        String[] result = instance.getBetaler(betalingCPR);
//        assertArrayEquals(expResult, result);
//    }
//    
//    @Test
//    public void testGetPersonsSager() {
//        System.out.println("getPersonsSager");
//        String CPR = "2104892119";
//        
//        ArrayList<String[]> sager = new ArrayList<>();
//        String[] exp1 = {"2104892119", "1439", "§14 stk 3", "Din mor", "Hos din mor", "1", "5", "0", "2", "2104892119", "1000"};
//        String[] exp2 = {"2104892119", "1439", "§14 stk 3", "Din far", "Hos din far", "1", "5", "0", "2", "2104892119", "1000"};
//        sager.add(exp1);
//        sager.add(exp2);
//        
//        ArrayList<String[]> result = instance.getPersonsSager(CPR, false);
//        String[] result1 = result.get(0);
//        String[] result2 = result.get(1);
//        
//        assertArrayEquals(exp1, result1);
//        assertArrayEquals(exp2, result2);
//    }
//    
//    @Test
//    public void testCheckValueExists() {
//        System.out.println("checkValueExists");
//        String CPR = "2104892119";
//        boolean expResult = true;
//        
//        boolean result = instance.checkValueExists("CPR", CPR, "personer");
//        if(result != expResult) {
//            System.out.println("Result: " + result);
//            fail("Result did not match");
//        }
//    }
//}