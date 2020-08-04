package cd.emo.bdd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            connexion = DriverManager.getConnection( "jdbc:mysql://localhost:3306/Emodb", "root", "" );

            statement = connexion.createStatement();

            // execution de la requette
            resultat = statement.executeQuery( "SELECT nom, message, date FROM contenu;" );

            // recuperation des resultat
            while ( resultat.next() ) {

                String nom = resultat.getString( 1 );
                String message = resultat.getString( 2 );
                Date date = resultat.getDate( 3 );

                Message message1 = new Message();

                message1.setNoms( nom );
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
