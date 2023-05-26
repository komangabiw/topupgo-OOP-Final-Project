/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

    import javax.mail.*;
    import javax.mail.internet.*;
    import java.util.Properties;
/**
 *
 * @author anoth
 */
public class sendEmail {
    static String userName = "codashopxwinter@gmail.com";
    static String password = "rogkfbiqspshazav";
    
    public static void sendEmailRegist(String to){
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
            message.setSubject("");
            message.setText("");
            Transport.send(message);
        }catch(Exception ex){
            System.out.print("The Exception is " + ex);
        }
    }
    
    public static void sendEmailForgotPass (String to){
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
            message.setSubject("Reset Password");
            message.setText("");
            Transport.send(message);
        }catch(Exception ex){
            System.out.print("The Exception is " + ex);
        }
    }
}