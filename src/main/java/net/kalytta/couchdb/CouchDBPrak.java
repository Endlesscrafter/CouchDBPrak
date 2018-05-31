package net.kalytta.couchdb;

import sun.awt.image.ImageWatched;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedList;

public class CouchDBPrak {

    public static void main(String args[]) {


        LinkedList<Lager> lagerList = new LinkedList<Lager>();
        LinkedList<Artikel> artikelList = new LinkedList<Artikel>();

        artikelList.add(new Artikel(1, "Toller Artikel", "kg", new BigDecimal(0.4d), 7, Calendar.getInstance()));
        artikelList.add(new Artikel(2, "Nicht so toller Artikel", "l", new BigDecimal(11.4d), 19, Calendar.getInstance()));


        Lager lager1 = new Lager(1, "Bremen", 60000, artikelList);

        LinkedList<Artikel> artikelList2 = new LinkedList<Artikel>();

        artikelList.add(new Artikel(3, "Mittelguter Artikel", "g", new BigDecimal(99.4d), 19, Calendar.getInstance()));
        artikelList.add(new Artikel(4, "Reduzierter Artikel", "m", new BigDecimal(50.90d), 7, Calendar.getInstance()));

        Lager lager2 = new Lager(2, "Buxtehude", 70000, artikelList2);

        lagerList.add(lager1);
        lagerList.add(lager2);

        try {
            ArtikelCSV.putArtikelToCSV(new File("LAGER.CSV"), lagerList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
