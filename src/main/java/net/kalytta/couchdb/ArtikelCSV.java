package net.kalytta.couchdb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArtikelCSV {

    static boolean putArtikelToCSV(File file, List<Lager> lagerList) throws IOException {

        if (file.exists()) {
            file.delete();
        }

        file.createNewFile();

        PrintWriter pw = new PrintWriter(file);

        pw.println("LNR,LORT,LPLZ,ANZART,Artikelnummer,Artikelbezeichnung,Mengeneinheit,preis,Steuersatz,Erfassungdatum");

        ListIterator<Lager> iterator = (ListIterator<Lager>) lagerList.iterator();

        while (iterator.hasNext()) {

            Lager lager = iterator.next();
            int lgnr = lager.getLNR();
            String lort = lager.getLORT();
            int lplz = lager.getLPLZ();
            int anzart = lager.getArtikelList().size();

        }


        pw.close();


        return true;
    }
}
