/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.sag;

import dk.pop.srs.database.SagDAO;
import dk.pop.srs.betaler.Betaler;
import dk.pop.srs.person.Person;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Oliverbærbar
 */
public class SagsKatalog {

    private SagDAO sagDAO;
    private ArrayList<Sag> sager = new ArrayList<>();
    private ArrayList<Person> personer = new ArrayList<>();
    private ArrayList<Betaler> betalere = new ArrayList<>();

    /**
     * Constructor
     *
     * @param sagDAO
     */
    public SagsKatalog(SagDAO sagDAO) {
        this.sagDAO = sagDAO;
        updateArray();
    }

    /**
     * Saves a sag object with the new variables given
     *
     * @param sagsSted
     * @param paragraf
     * @param foranstalningsnavn
     * @param beskrivelse
     * @param periodeFra
     * @param periodeTil
     * @param aer
     * @param sagsType
     * @param betalingNavn
     * @param betalingCPR
     * @param betalingBelob
     * @param sag
     * @return
     */
    public boolean gemSag(String sagsSted, String paragraf, String foranstalningsnavn, String beskrivelse, int periodeFra, int periodeTil, int aer, int sagsType, String betalingNavn, String betalingCPR, double betalingBelob, Sag sag) {

        if (!sag.getBetaler().getBetalingCPR().equals(betalingCPR)) { //Hvis betaleren er blevet ændret
            if (checkBetalerExists(betalingCPR)) { //Hvis den nye betaler findes i forvejen
                Betaler betaler = getBetaler(betalingCPR); //Hent nye betaler
                sag.getBetaler().remove(sag); //Fjern sag fra den originale betaler
                sag.setBetaler(betaler); //Set betaler i sagen til den nye sag
                betaler.add(sag); //Tilføj sagen til den nye betaler

                /**
                 * GEM SAG *
                 */
                sag.setAer(aer);
                sag.setBeskrivelse(beskrivelse);
                sag.setBetalingBelob(betalingBelob);
                sag.setForanstaltningsnavn(foranstalningsnavn);
                sag.setParagraf(paragraf);
                sag.setPeriodeFra(periodeFra);
                sag.setPeriodeTil(periodeTil);
                sag.setSagsSted(sagsSted);
                sag.setSagstype(sagsType);
                sagDAO.opdaterSag(sag);
            } else { //Hvis den nye betaler ikke findes i forvejen
                Betaler betaler = opretBetaler(betalingCPR, betalingNavn);

                sag.getBetaler().remove(sag);
                sag.setBetaler(betaler);
                betaler.add(sag);

                /**
                 * GEM SAG *
                 */
                sag.setAer(aer);
                sag.setBeskrivelse(beskrivelse);
                sag.setBetalingBelob(betalingBelob);
                sag.setForanstaltningsnavn(foranstalningsnavn);
                sag.setParagraf(paragraf);
                sag.setPeriodeFra(periodeFra);
                sag.setPeriodeTil(periodeTil);
                sag.setSagsSted(sagsSted);
                sag.setSagstype(sagsType);
                sagDAO.opdaterSag(sag);
            }
        } else {
            /**
             * GEM SAG *
             */
            sag.setAer(aer);
            sag.setBeskrivelse(beskrivelse);
            sag.setBetalingBelob(betalingBelob);
            sag.setForanstaltningsnavn(foranstalningsnavn);
            sag.setParagraf(paragraf);
            sag.setPeriodeFra(periodeFra);
            sag.setPeriodeTil(periodeTil);
            sag.setSagsSted(sagsSted);
            sag.setSagstype(sagsType);
            sagDAO.opdaterSag(sag);
        }
        return false;
    }

    /**
     * Creates a betaler object, inserts it into ArrayList, database, and
     * finally returns it
     *
     * @param betalingCPR
     * @param betalingNavn
     * @return
     */
    public Betaler opretBetaler(String betalingCPR, String betalingNavn) {
        Betaler betaler = new Betaler(betalingCPR, betalingNavn);
        betalere.add(betaler);
        sagDAO.opretBetaler(betaler);
        return betaler;
    }

    /**
     * Updates all ArrayLists with all information from the database
     */
    private void updateArray() {
        ArrayList<ArrayList> alt = sagDAO.getEverything();
        sager = alt.get(0);
        personer = alt.get(1);
        betalere = alt.get(2);
    }

    /**
     * Registers a new sag object
     *
     * @param sagsSted
     * @param fornavn
     * @param mellemnavn
     * @param efternavn
     * @param paragraf
     * @param foranstalningsnavn
     * @param beskrivelse
     * @param periodeFra
     * @param periodeTil
     * @param aer
     * @param sagsType
     * @param betalingNavn
     * @param betalingCPR
     * @param betalingBelob
     * @param CPR
     */
    public void registrerSag(String sagsSted, String fornavn, String mellemnavn, String efternavn, String paragraf, String foranstalningsnavn, String beskrivelse, int periodeFra, int periodeTil, int aer, int sagsType, String betalingNavn, String betalingCPR, double betalingBelob, String CPR) {
        Person person = null;
        Betaler betaler = null;

        if (checkPersonExists(CPR)) {
            person = getPerson(CPR);
        } else {
            person = new Person(CPR, fornavn, mellemnavn, efternavn);
            personer.add(person);
        }

        if (checkBetalerExists(betalingCPR)) {
            betaler = getBetaler(betalingCPR);
        } else {
            betaler = new Betaler(betalingCPR, betalingNavn);
            betalere.add(betaler);
        }

        Sag sag = new Sag(sagsSted, paragraf, foranstalningsnavn, beskrivelse, person, betaler, betalingBelob, periodeFra, periodeTil, aer, sagsType);
        sager.add(sag);
        int sagsID = sagDAO.opretSag(sag);
        sag.setSagsID(sagsID);
        person.add(sag);
        betaler.add(sag);
    }

    /**
     * Deletes a sag
     *
     * @param sag
     */
    public void sletSag(Sag sag) {
        sagDAO.sletSag(sag);
        sager.remove(sag);

        sag.getPerson().remove(sag);

        sag.getBetaler().remove(sag);
    }

    /**
     * Deletes a person object
     *
     * @param person
     * @return
     */
    public boolean sletPerson(Person person) {
        if (person.getArraySize() == 0) {
            sagDAO.sletPerson(person);
            personer.remove(person);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Deletes a betaler object
     *
     * @param betaler
     * @return
     */
    public boolean sletBetaler(Betaler betaler) {
        if (betaler.getArraySize() == 0) {
            sagDAO.sletBetaler(betaler);
            betalere.remove(betaler);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns an ArrayList with all the personer found by value given
     *
     * @param value
     * @return
     */
    public ArrayList<Person> getPersonV2(String value) {
        ArrayList<Person> fundnePersoner = new ArrayList<>();
        for (Person p : personer) {
            if (p.getCpr().equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
                return fundnePersoner;
            } else if (p.getFornavn().equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
            } else if (p.getMellemnavn().equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
            } else if (p.getEfternavn().equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
            } else if ((p.getFornavn() + " " + p.getEfternavn()).equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
            } else if ((p.getFornavn() + " " + p.getMellemnavn() + " " + p.getEfternavn()).equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
            } else if ((p.getFornavn() + " " + p.getMellemnavn()).equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
            } else if ((p.getMellemnavn() + " " + p.getEfternavn()).equalsIgnoreCase(value)) {
                fundnePersoner.add(p);
            }

        }
        return fundnePersoner;
    }

    /**
     * Returns an ArrayList with all the betaler found by value given
     *
     * @param value
     * @return
     */
    public ArrayList<Betaler> getBetalerV2(String value) {
        ArrayList<Betaler> fundneBetalere = new ArrayList<>();
        for (Betaler b : betalere) {
            if (b.getBetalingCPR().equalsIgnoreCase(value)) {
                fundneBetalere.add(b);
                return fundneBetalere;
            } else if (b.getBetalingNavn().equalsIgnoreCase(value)) {
                fundneBetalere.add(b);
            }

        }
        return fundneBetalere;
    }

    /**
     * Returns a sag object found by sagsID
     *
     * @param sagsID
     * @return
     */
    public Sag getSag(int sagsID) {
        for (Sag s : sager) {
            if (s.getSagsID() == sagsID) {
                return s;
            }
        }
        return null;
    }

    /**
     * Returns a person object found by CPR
     *
     * @param CPR
     * @return
     */
    public Person getPerson(String CPR) {
        for (Person p : personer) {
            if (p.getCpr().equals(CPR)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Returns a betaler object found by betalingCPR
     *
     * @param betalingCPR
     * @return
     */
    public Betaler getBetaler(String betalingCPR) {
        for (Betaler b : betalere) {
            if (b.getBetalingCPR().equals(betalingCPR)) {
                return b;
            }
        }
        return null;
    }

    /**
     * Checks if a betaler exists and returns true or false
     *
     * @param betalingCPR
     * @return
     */
    public boolean checkBetalerExists(String betalingCPR) {
        for (Betaler b : betalere) {
            if (b.getBetalingCPR().equals(betalingCPR)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if a person exists and returns true or false
     *
     * @param CPR
     * @return
     */
    public boolean checkPersonExists(String CPR) {
        for (Person p : personer) {
            if (p.getCpr().equals(CPR)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Saves a person with the new variables
     * @param CPR
     * @param fornavn
     * @param mellemnavn
     * @param efternavn
     */
    public void redigerPerson(String CPR, String fornavn, String mellemnavn, String efternavn) {
        Person p = getPerson(CPR);
        p.setFornavn(fornavn);
        p.setMellemnavn(mellemnavn);
        p.setEfternavn(efternavn);
        sagDAO.opdaterPerson(p);
    }

    /**
     * Searches for a cpr, and returns an ArrayList with sager found
     * @param CPR
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> sogCPR(String CPR, boolean ui90d) {
        if (ui90d) {
            ArrayList<Sag> sager_p = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("MM");
            int currentMonth = Integer.valueOf(formatter.format(new java.util.Date()));
            for (Sag s : sager) {
                int periodeTil = s.getPeriodeTil();
                int tjek = periodeTil - currentMonth;
                String s_cpr = s.getPerson().getCpr();
                if (s_cpr.equals(CPR) && tjek <= 3 && tjek >= 0) {
                    sager_p.add(s);
                }
            }
            return sager_p;
        } else {
            ArrayList<Sag> sager_p = new ArrayList<>();
            for (Sag s : sager) {
                String s_cpr = s.getPerson().getCpr();

                if (s_cpr.equals(CPR)) {
                    sager_p.add(s);
                }
            }
            return sager_p;
        }
    }

    /**
     * Searches for a paragraf, and returns an ArrayList with sager found
     * @param paragraf
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> sogParagraf(String paragraf, boolean ui90d) {
        if (ui90d) {
            ArrayList<Sag> sager_p = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("MM");
            int currentMonth = Integer.valueOf(formatter.format(new java.util.Date()));
            for (Sag s : sager) {
                int periodeTil = s.getPeriodeTil();
                int tjek = periodeTil - currentMonth;
                String s_paragraf = s.getParagraf();
                if (s_paragraf.equalsIgnoreCase(paragraf) && tjek <= 3 && tjek >= 0) {
                    sager_p.add(s);
                }
            }
            return sager_p;
        } else {
            ArrayList<Sag> sager_p = new ArrayList<>();
            for (Sag s : sager) {
                String s_paragraf = s.getParagraf();

                if (s_paragraf.equalsIgnoreCase(paragraf)) {
                    sager_p.add(s);
                }
            }
            return sager_p;
        }
    }

    /**
     * Searches for a sagstype, and returns an ArrayList with sager found
     * @param sagstype
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> sogSagstype(String sagstype, boolean ui90d) {
        if (ui90d) {
            ArrayList<Sag> sager_p = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("MM");
            int currentMonth = Integer.valueOf(formatter.format(new java.util.Date()));
            for (Sag s : sager) {
                int periodeTil = s.getPeriodeTil();
                int tjek = periodeTil - currentMonth;
                int s_INTsagstype = s.getSagstype();
                String s_sagstype = "";
                switch (s_INTsagstype) {
                    case 1:
                        s_sagstype = "Socialsag";
                        break;
                    case 2:
                        s_sagstype = "Handicapsag";
                        break;
                    case 3:
                        s_sagstype = "Flytningerefusion";
                        break;
                    case 4:
                        s_sagstype = "Mellemkommunal";
                        break;
                }
                if (s_sagstype.equalsIgnoreCase(sagstype) && tjek <= 3 && tjek >= 0) {
                    sager_p.add(s);
                }
            }
            return sager_p;
        } else {
            ArrayList<Sag> sager_p = new ArrayList<>();
            for (Sag s : sager) {
                int s_INTsagstype = s.getSagstype();
                String s_sagstype = "";
                switch (s_INTsagstype) {
                    case 1:
                        s_sagstype = "Socialsag";
                        break;
                    case 2:
                        s_sagstype = "Handicapsag";
                        break;
                    case 3:
                        s_sagstype = "Flytningerefusion";
                        break;
                    case 4:
                        s_sagstype = "Mellemkommunal";
                        break;
                }
                if (s_sagstype.equalsIgnoreCase(sagstype)) {
                    sager_p.add(s);
                }
            }
            return sager_p;
        }
    }

    /**
     * Returns an ArrayList with all sager
     * @param ui90d
     * @return 
     */
    public ArrayList<Sag> getAlleSager(boolean ui90d) {
        if (ui90d) {
            ArrayList<Sag> sager_ui90d = new ArrayList<>();
            SimpleDateFormat formatter = new SimpleDateFormat("MM");
            int currentMonth = Integer.valueOf(formatter.format(new java.util.Date()));
            for (Sag s : sager) {
                int periodeTil = s.getPeriodeTil();
                int tjek = periodeTil - currentMonth;
                System.out.println(tjek);
                System.out.println(currentMonth);
                if (tjek <= 3 && tjek >= 0) {
                    sager_ui90d.add(s);
                }
            }
            return sager_ui90d;
        } else {
            return sager;
        }
    }

    /**
     * Checks if a value exists in the database
     * @param column
     * @param value
     * @param table
     * @return 
     */
    public boolean checkValueExists(String column, String value, String table) {
        return sagDAO.checkValueExists(column, value, table);
    }

    /**
     * Returns an ArrayList with all personer
     * @return 
     */
    public ArrayList<Person> getAllePersoner() {
        return personer;
    }

    /**
     * Returns an ArrayList with all betalere
     * @return 
     */
    public ArrayList<Betaler> getAlleBetalere() {
        return betalere;
    }
}
