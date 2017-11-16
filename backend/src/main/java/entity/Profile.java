package entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.websocket.Session;

/**
 *
 * @author jvetterlain
 */
@Entity
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String username;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Message> messages;
    private Boolean tutor;
    private String assignedTutor;
    private byte[] buf;

    @Transient
    private Session userSession;

    public Profile() {
    }

    public Session getSession() {
        return userSession;
    }

    public void setSession(Session session) {
        this.userSession = session;
    }

    public Boolean getTutor() {
        return tutor;
    }

    public void setTutor(Boolean tutor) {
        this.tutor = tutor;
    }

    public String getAssignedTutor() {
        return assignedTutor;
    }

    public void setAssignedTutor(String assignedTutor) {
        this.assignedTutor = assignedTutor;
    }

    public byte[] getBuf() {
        return buf;
    }

    public void setBuf(byte[] buf) {
        this.buf = buf;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Profile{" + "username=" + username + ", tutor=" + tutor + ", assignedTutor=" + assignedTutor + ", buf=" + buf + ", userSession=" + userSession + '}';
    }
    
    

}