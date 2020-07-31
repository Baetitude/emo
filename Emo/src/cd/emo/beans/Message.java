package cd.emo.beans;

import java.util.Date;

public class Message {

    /* Propriete */
    private int    id;
    private String noms;
    private String telephone;
    private String messages;
    private Date   date;

    /* getters and setters */
    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getNoms() {
        return noms;
    }

    public void setNoms( String noms ) {
        this.noms = noms;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone( String telephone ) {
        this.telephone = telephone;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages( String messages ) {
        this.messages = messages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate( Date date ) {
        this.date = date;
    }

}
