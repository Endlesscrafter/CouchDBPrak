package net.kalytta.couchdb;

import java.util.List;

public class Lager {

    //CouchDB Attriubtes
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

}
