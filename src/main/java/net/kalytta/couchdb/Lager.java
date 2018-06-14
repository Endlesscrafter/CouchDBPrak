package net.kalytta.couchdb;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Lager {

    //CouchDB Attributes
    String _id;
    String revision;

    //Lagernummer
    int LNR;
    //Lagerort
    String LORT;
    //Lagerpostleitzahl
    int LPLZ;
    //Artikel im Lager
    List<Artikel> artikelList;

    public Lager(int LNR, String LORT, int LPLZ, List<Artikel> artikelList) {

        this.LNR = LNR;
        this.LORT = LORT;
        this.LPLZ = LPLZ;

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

    public List<Artikel> getArtikelList() {
        return artikelList;
    }

    public void setArtikelList(List<Artikel> artikelList) {
        this.artikelList = artikelList;
    }

    @JsonProperty("_id")
    public String get_id() {
        return _id;
    }

    @JsonProperty("_id")
    public void set_id(String _id) {
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
