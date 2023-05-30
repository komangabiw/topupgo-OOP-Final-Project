/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

    import javax.mail.*;
    import javax.mail.internet.*;
    import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
/**
 *
 * @author TopUpGo
 */
public class sendEmail {
    static String userName = "codashopxwinter@gmail.com";
    static String password = "rogkfbiqspshazav";
    
    public static void sendEmailRegist(String to, String otp){
        Properties pros = new Properties();
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.starttls.enable", "true");
        pros.put("mail.smtp.host","smtp.gmail.com");
        pros.put("mail.smtp.port", "587");
        pros.put("mail.smtp.ssl.protocols", "TLSv1.2");
            Session session = Session.getInstance(pros, new javax.mail.Authenticator(){
                protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                    return new javax.mail.PasswordAuthentication(userName,password);
                }
            });
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(userName));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Kode Registrasi Akun Topupgo Kamu");
            message.setText(otp);
            Transport.send(message);
        }catch(MessagingException ex){
            System.out.print("The Exception is " + ex);
        }
    }
    
    public static void sendEmailForgotPass (String to, String otp){
        Properties pros = new Properties();
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.starttls.enable", "true");
        pros.put("mail.smtp.host","smtp.gmail.com");
        pros.put("mail.smtp.port", "587");
        pros.put("mail.smtp.ssl.protocols", "TLSv1.2");
            Session session = Session.getInstance(pros, new javax.mail.Authenticator(){
                protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                    return new javax.mail.PasswordAuthentication(userName,password);
                }
            });
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(userName));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("Kode Reset Password Akun Topupgo Kamu");
            message.setText(otp);
            Transport.send(message);
        }catch(MessagingException ex){
            System.out.print("The Exception is " + ex);
        }
    }
    
    public static void sendEmailwithAttachment (String to){
        Properties pros = new Properties();
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.starttls.enable", "true");
        pros.put("mail.smtp.host","smtp.gmail.com");
        pros.put("mail.smtp.port", "587");
        pros.put("mail.smtp.ssl.protocols", "TLSv1.2");
            Session session = Session.getInstance(pros, new javax.mail.Authenticator(){
                protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                    return new javax.mail.PasswordAuthentication(userName,password);
                }
            });
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(userName));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            message.setSubject("TERIMA KASIH UNTUK PEMBELIAN ANDA!");
            message.setText("Ringkasan pembelian anda di PDF");
            
             //3) create MimeBodyPart object and set your message text     
            BodyPart messageBodyPart1 = new MimeBodyPart();  
            messageBodyPart1.setText("Ringkasan pembelian anda di PDF");  

            //4) create new MimeBodyPart object and set DataHandler object to this object      
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();  

            String filename = "D:\\report.pdf";//change accordingly  
            DataSource source = new FileDataSource(filename);  
            messageBodyPart2.setDataHandler(new DataHandler(source));  
            messageBodyPart2.setFileName(filename);  


            //5) create Multipart object and add MimeBodyPart objects to this object      
            Multipart multipart = new MimeMultipart();  
            multipart.addBodyPart(messageBodyPart1);  
            multipart.addBodyPart(messageBodyPart2);  

            //6) set the multiplart object to the message object  
            message.setContent(multipart );  
            
            Transport.send(message);
        }catch(MessagingException ex){
            System.out.print("The Exception is " + ex);
        }
    }
}