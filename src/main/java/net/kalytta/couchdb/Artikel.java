package net.kalytta.couchdb;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Artikel {

    //CouchDB Attributes
    String id;
    String revision;

    int Artikelnummer;
    String Artikelbezeichnung;
    String Mengeneinheit;
    BigDecimal preis;
    int Steuersatz;
    Date Erfassungdatum;

    public Artikel(int artikelnummer, String artikelbezeichnung, String mengeneinheit, BigDecimal preis, int steuersatz, Date erfassungdatum) {
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

    public Date getErfassungdatum() {
        return Erfassungdatum;
    }

    public void setErfassungdatum(Date erfassungdatum) {
        Erfassungdatum = erfassungdatum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }
}
