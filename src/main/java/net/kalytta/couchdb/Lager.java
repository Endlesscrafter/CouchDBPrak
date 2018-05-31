package net.kalytta.couchdb;

import java.util.List;

public class Lager {

    //CouchDB Attributes
    String id;
    String revision;

    //Lagernummer
    int LNR;
    //Lagerort
    String LORT;
    //Lagerpostleitzahl
    int LPLZ;
    //Anzahl der Artikel im Lager
    int ANZART;
    //Artikel im Lager
    List<Artikel> artikelList;

    public Lager(int LNR, String LORT, int LPLZ, int ANZART, List<Artikel> artikelList) {

        this.LNR = LNR;
        this.LORT = LORT;
        this.LPLZ = LPLZ;
        this.ANZART = ANZART;

        //Unsafe
        this.artikelList = artikelList;

    }

    public int getLNR() {
        return LNR;
    }

    public void setLNR(int LNR) {
        this.LNR = LNR;
    }

    public String getLORT() {
        return LORT;
    }

    public void setLORT(String LORT) {
        this.LORT = LORT;
    }

    public int getLPLZ() {
        return LPLZ;
    }

    public void setLPLZ(int LPLZ) {
        this.LPLZ = LPLZ;
    }

    public int getANZART() {
        return ANZART;
    }

    public void setANZART(int ANZART) {
        this.ANZART = ANZART;
    }

    public List<Artikel> getArtikelList() {
        return artikelList;
    }

    public void setArtikelList(List<Artikel> artikelList) {
        this.artikelList = artikelList;
    }
}
