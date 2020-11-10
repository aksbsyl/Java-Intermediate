import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.Properties;


public class MailServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res){
        String to = "aks.bsyl@gmail.com";
        String from = "aks.bsyl@gmail.com";
        String password = "****";//or IP address

        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");

        //Get the session object
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });
        //compose the message
            try {
                            MimeMessage message = new MimeMessage(session);
                            message.setFrom(new InternetAddress(from));
                            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
                            message.setSubject("I am MailServlet");
                            message.setText("My first message frm Intellij Mail Servlet not sendmail");
                            // Send message
                            Transport.send(message);
                            System.out.println("message sent successfully....");

                        }catch (MessagingException e) { throw new RuntimeException(e);}
                    }
    }