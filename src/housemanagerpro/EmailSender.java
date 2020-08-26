package housemanagerpro;
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender 
{
    public static void emailToCore(String fileaddress, String filename) 
    {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() 
            {
                protected PasswordAuthentication getPasswordAuthentication() 
                {
                    return new PasswordAuthentication("jaguarscouncil2019@gmail.com","Heythere12345");
                }
            });
        try {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("jaguarscouncil2019@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse("corecouncil.hmp@gmail.com"));
        message.setSubject("Jaguar House Participant List");
        BodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setText("Please find attached: "+ filename+ ".");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        messageBodyPart = new MimeBodyPart();
        DataSource source = new FileDataSource(fileaddress);
        messageBodyPart.setDataHandler(new DataHandler(source));
        messageBodyPart.setFileName(filename);
        multipart.addBodyPart(messageBodyPart);
        message.setContent(multipart);
        Transport.send(message);
        System.out.println("Sent message successfully....");
      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
   }
} 

    
