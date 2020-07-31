package cd.emo.forms;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import cd.emo.beans.Message;

public class MessageForm {

    private static final String ATT_NOM       = "noms";
    private static final String ATT_TELEPHONE = "telephone";
    private static final String ATT_MESSAGE   = "messages";

    private String              resultat;
    private Map<String, String> erreurs       = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public Message nouVeauMessage( HttpServletRequest request ) {
        String noms = getValeurChamp( request, ATT_NOM );
        String telephone = getValeurChamp( request, ATT_TELEPHONE );
        String messages = getValeurChamp( request, ATT_MESSAGE );

        Message message = new Message();

        try {
            validationNom( noms );
        } catch ( Exception e ) {
            setErreur( ATT_NOM, e.getMessage() );
        }
        message.setNoms( noms );

        try {
            validationTelephone( telephone );
        } catch ( Exception e ) {
            setErreur( ATT_TELEPHONE, e.getMessage() );
        }
        message.setTelephone( telephone );

        try {
            validationMessage( messages );
        } catch ( Exception e ) {
            setErreur( ATT_MESSAGE, e.getMessage() );
        }
        message.setMessages( messages );

        if ( erreurs.isEmpty() ) {
            resultat = " Merci pour votre Message !";
        } else {
            resultat = " Echec de votre message";
        }

        return message;
    }

    private void setErreur( String attNom, String message ) {
        erreurs.put( attNom, message );
    }

    private void validationNom( String noms ) throws Exception {
        if ( noms != null ) {
            if ( noms.length() < 3 ) {
                throw new Exception( "Aumoins plus de 3 caractere !" );
            }
        } else {
            throw new Exception( "Merci d'entrer votre noms" );
        }
    }

    private void validationTelephone( String telephone ) throws Exception {
        if ( telephone != null ) {
            if ( telephone.length() < 10 ) {
                throw new Exception( "Aumoins plus de 10 caractere !" );
            }
        } else {
            throw new Exception( "Merci d'entrer votre numéro de telephone" );
        }
    }

    private void validationMessage( String message ) throws Exception {
        if ( message != null ) {
            if ( message.length() < 10 ) {
                throw new Exception( "Aumoins plus de 10 caractere !" );
            }
        } else {
            throw new Exception( "Merci d'entrer votre message svp" );
        }
    }

    /*
     * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
     * sinon.
     */
    private String getValeurChamp( HttpServletRequest request, String attNom ) {
        String valeur = request.getParameter( attNom );
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }

    }
}