package cd.emo.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cd.emo.beans.Message;

public class MessageBDD {
    public List<Message> recupererMessage() {
        List<Message> messagess = new ArrayList<Message>();

        // chargement driver
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch ( ClassNotFoundException e ) {
        }

        // connexion à la bdd
        Connection connexion = null;
        Statement statement = null;
        ResultSet resultat = null;

        try {
            connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/bddEmo", "root", "" );

            statement = connexion.createStatement();

            // execution de la requette
            resultat = statement.executeQuery( "select * from messa;" );

            // recuperation des resultat
            while ( resultat.next() ) {
                int id = resultat.getInt( "id" );
                String nom = resultat.getString( "noms" );
                String telephone = resultat.getString( "telephone" );
                String message = resultat.getString( "message" );
                Date date = resultat.getTimestamp( "date" );

                Message message1 = new Message();
                message1.setId( id );
                message1.setNoms( nom );
                message1.setTelephone( telephone );
                message1.setMessages( message );
                message1.setDate( date );

                messagess.add( message1 );
            }
        } catch ( SQLException e ) {

        } finally {
            try {
                if ( resultat != null )
                    resultat.close();
                if ( statement != null )
                    statement.close();
                if ( connexion != null )
                    connexion.close();
            } catch ( SQLException ignore ) {

            }
        }
        return messagess;
    }
}
