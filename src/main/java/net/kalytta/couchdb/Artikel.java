package net.kalytta.couchdb;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Artikel {

    //CouchDB Attributes
    String _id;
    String revision;

    int Artikelnummer;
    String Artikelbezeichnung;
    String Mengeneinheit;
    BigDecimal preis;
    int Steuersatz;
    Date Erfassungdatum;

    public Artikel() {

    }

    @Override
    public String toString() {
        return "ARTIKEL: ID:" + _id + " REV:" + revision + "\tNR=" + Artikelnummer + " BEZ=" + Artikelbezeichnung + " Mng=" + Mengeneinheit + " Preis=" + preis + " Str=" + Steuersatz + " Edat=" + Erfassungdatum + "\n";
    }

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

    @JsonProperty("_id")
    public String getId() {
        return _id;
    }

    @JsonProperty("_id")
    public void setId(String _id) {
        this._id = _id;
    }

    @JsonProperty("_rev")
    public String getRevision() {
        return revision;
    }

    @JsonProperty("_rev")
    public void setRevision(String revision) {
        this.revision = revision;
    }
}
