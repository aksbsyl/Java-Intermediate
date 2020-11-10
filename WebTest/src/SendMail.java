import java.util.*;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

class Mailer {
    public static void send(String from,String password,String to,String sub,String msg){
        //Get properties object
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");

        //Get the session object
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(from,password);
            }
                });

        //compose the message
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
            message.setSubject(sub);
            message.setText(msg);
            // Send message
            Transport.send(message);
            System.out.println("message sent successfully....");

        }catch (MessagingException e) { throw new RuntimeException(e);}
    }
}
public class SendMail{
    public static void main(String[] args) {
        //from,password,to,subject,message
        Mailer.send("aks.bsyl@gmail.com","****","aks.bsyl@gmail.com","Javamail API test","Hi, I am Aakash from Javamail API test");
    }
}