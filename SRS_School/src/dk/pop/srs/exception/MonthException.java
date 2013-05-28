/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.exception;

/**
 *
 * @author Patrick
 */
public class MonthException extends Exception {

    public MonthException() {
        super("Den angivne måned findes ikke, eller fra og til kan ikke være den samme");
    }
}
