/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailingModule;

/**
 *
 * @author abdalrahmansaleh
 */
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;

public class JavaMailUtil {
	
        private static String sender = "epbuser2020@gmail.com";
	private static String password = "weWillBeBetter2020";
        
	public static void sendMail(String recepient,String userInfo) 
	{
		//set properties
		Properties properties = new Properties();
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.auth", "true");
		
		
		
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new  PasswordAuthentication(sender, password);
			}
		});
		
		Message messageToBeSent = prepareMessage(session,sender,recepient,userInfo);
		try {
			Transport.send(messageToBeSent);
			System.out.println("Message sent successfully");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private static Message prepareMessage(Session session, String sender , String recepient,String userInfo) {
		// TODO Auto-generated method stub
		
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(sender));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setText(userInfo);
			return message;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Couldn't send message");
		}
		
		return null;
	}
	
}
