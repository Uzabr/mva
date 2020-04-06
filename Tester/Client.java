/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tester;

/**
 *
 * @author user
 */
public class Client {

    private int ID;
    private String name;
    private int passport;
    private String date;
    private double sale;
    private String kassir;

    public Client (int ID, String name, int passport) {
        this.ID = ID;
        this.name = name;
        this.passport = passport;
    }

    public Client (int ID, String name, int passport, String date, double sale, String kassir) {
        this.ID = ID;
        this.name = name;
        this.passport = passport;
        this.date = date;
        this.sale = sale;
        this.kassir = kassir;
    }

    public int getID () {
        return ID;
    }

    public String getName () {
        return name;
    }

    public int getPassport () {
        return passport;
    }

    public String getDate () {
        return date;
    }

    public double getSale () {
        return sale;
    }

    public String getKassir () {
        return kassir;
    }
}
    

