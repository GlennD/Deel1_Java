/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Ruben, Wouter, Glenn, Arnout, Timo
 */
public class loginManager {

    private Session session;
    private int count = 0;

    public boolean isValidLogin(String uname, String pass) {

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        session = factory.openSession();

        //Controleren of wachtwoord en username overeenkomen met waardes in de database        
        String query = "select gebrEmail, gebrWachtwoord from Geregistreerdegebruikers as reg where gebrEmail IN (:unameandpass) and gebrWachtwoord in (:unameandpass)";
        Query DBquery = session.createQuery(query).setParameterList("unameandpass", new String[]{uname, pass});

        //1 voor 1 de rijen doodlopen inde database voor een match
        for (Iterator it = DBquery.iterate(); it.hasNext();) {            it.next();
            count++;
        }
        
        //Totaal aantal rijen printen
        System.out.println("Total rows: " + count);
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
