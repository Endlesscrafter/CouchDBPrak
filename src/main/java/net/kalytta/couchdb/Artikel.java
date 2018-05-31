package net.kalytta.couchdb;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Artikel {

    int Artikelnummer;
    String Artikelbezeichnung;
    String Mengeneinheit;
    BigDecimal preis;
    int Steuersatz;
    Calendar Erfassungdatum;

    public Artikel(int artikelnummer, String artikelbezeichnung, String mengeneinheit, BigDecimal preis, int steuersatz, Calendar erfassungdatum) {
        Artikelnummer = artikelnummer;
        Artikelbezeichnung = artikelbezeichnung;
        Mengeneinheit = mengeneinheit;
        this.preis = preis;
        Steuersatz = steuersatz;
        Erfassungdatum = erfassungdatum;
    }

    public int getArtikelnummer() {
        return Artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        Artikelnummer = artikelnummer;
    }

    public String getArtikelbezeichnung() {
        return Artikelbezeichnung;
    }

    public void setArtikelbezeichnung(String artikelbezeichnung) {
        Artikelbezeichnung = artikelbezeichnung;
    }

    public String getMengeneinheit() {
        return Mengeneinheit;
    }

    public void setMengeneinheit(String mengeneinheit) {
        Mengeneinheit = mengeneinheit;
    }

    public BigDecimal getPreis() {
        return preis;
    }

    public void setPreis(BigDecimal preis) {
        this.preis = preis;
    }

    public int getSteuersatz() {
        return Steuersatz;
    }

    public void setSteuersatz(int steuersatz) {
        Steuersatz = steuersatz;
    }

    public Calendar getErfassungdatum() {
        return Erfassungdatum;
    }

    public void setErfassungdatum(Calendar erfassungdatum) {
        Erfassungdatum = erfassungdatum;
    }
}
