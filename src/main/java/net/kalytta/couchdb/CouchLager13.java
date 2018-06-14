package net.kalytta.couchdb;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.DocumentNotFoundException;
import org.ektorp.ViewQuery;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

public class CouchLager13 {

    private CouchDbConnector connector;

    public void createConnector() throws MalformedURLException {

        HttpClient httpClient = new StdHttpClient.Builder()
                .url("http://feuerbach.nt.fh-koeln.de:5984")
                .build();

        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
        connector = new StdCouchDbConnector("Lager13", dbInstance);

        connector.createDatabaseIfNotExists();

        //Sofa sofa = db.get(Sofa.class, "ektorp");
        //sofa.setColor("blue");
        //db.update(sofa);

    }

    public void insertArtikel(Artikel artikel) {


        connector.create(artikel);

    }

    public List<Artikel> readAllEntities() {

        ViewQuery q = new ViewQuery().allDocs().includeDocs(true);
        List<Object> dblist = connector.queryView(q, Object.class);
        List<Artikel> artikelLinkedList = new LinkedList<>();
        for (Object o : dblist) {
            if (o instanceof Artikel) {
                System.out.println("Artikel gefunden");
                artikelLinkedList.add((Artikel) o);
            } else {
                System.out.print(".");
            }

        }
        System.out.println();
        return artikelLinkedList;

    }

    public List<Artikel> readAllArtikelOld() {
        ViewQuery q = new ViewQuery().allDocs().includeDocs(true);
        List<Artikel> dblist = connector.queryView(q, Artikel.class);
        return dblist;
    }

    public void insertLager(String id, Lager lager) {
        connector.create(id, lager);
    }

    public Lager getLagerByID(String id) {

        try {
            if (connector.get(Lager.class, id) != null) {
                return (Lager) connector.get(Lager.class, id);
            }
        } catch (DocumentNotFoundException e) {
            System.out.println("Das Lager mit der ID " + id + " existiert nicht.");
            return null;
        }
        return null;
    }

    public boolean updateLager(Lager lager, String id) {


        Lager lager2 = connector.get(Lager.class, id);
        lager2.setArtikelList(lager.getArtikelList());
        lager2.setLNR(lager.getLNR());
        lager2.setLPLZ(lager.getLPLZ());
        lager2.setLORT(lager.getLORT());
        connector.update(lager2);

        return true;
    }

    public boolean deleteLager(String id) {

        connector.delete(connector.get(Lager.class, id));

        return true;
    }

}
