
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;

public class Main
{
    String  d_email = "mh715360@gmail.com",
            d_password = "97325060",
            d_host = "smtp.gmail.com",
            d_port  = "465",
            m_to = "u1704003@student.cuet.ac.bd",
            m_subject = "Testingfdjlfdjfkdjfldfjdkfdfd",
            m_text = "testing emailfkdfldfjdlfjdfkdfd.";

    public Main()
    {
        Properties props = new Properties();
        props.put("mail.smtp.user", d_email);
        props.put("mail.smtp.host", d_host);
        props.put("mail.smtp.port", d_port);
        props.put("mail.smtp.starttls.enable","true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port", d_port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");

        SecurityManager security = System.getSecurityManager();

        try
        {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);
            session.setDebug(true);
            MimeMessage msg = new MimeMessage(session);
            msg.setText(m_text);
            msg.setSubject(m_subject);
            msg.setFrom(new InternetAddress(d_email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));
            Transport.send(msg);
        }
        catch (Exception mex)
        {
            mex.printStackTrace();
        } 
    }

    public static void main(String[] args)
    {
        Main blah = new Main();
    }

    private class SMTPAuthenticator extends javax.mail.Authenticator
    {
        public PasswordAuthentication getPasswordAuthentication()
        {
            return new PasswordAuthentication(d_email, d_password);
        }
    }
}