package net.kalytta.couchdb;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.ViewQuery;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

import java.net.MalformedURLException;

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

    public void readAllEntities() {

        connector.getAllDocIds();

    }

    public Lager getLagerByID(String id) {

        if (connector.get(Lager.class, id) != null) {
            return (Lager) connector.get(Lager.class, id);
        }
        return null;

    }

    public boolean updateLager(Lager lager, String id) {


        Lager lager2 = connector.get(Lager.class, id);
        lager2.setArtikelList(lager.getArtikelList());
        lager2.setLNR(lager.getLNR());
        lager2.setLPLZ(lager.getLPLZ());
        lager2.setLORT(lager.getLORT());
        connector.update(lager);

        return true;
    }

    public boolean deleteLager(String id) {

        connector.delete(connector.get(Lager.class, id));

        return true;
    }

}
