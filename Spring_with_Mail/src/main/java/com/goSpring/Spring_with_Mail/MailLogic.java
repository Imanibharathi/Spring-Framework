package com.goSpring.Spring_with_Mail;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailLogic 
{
	private MailSender mail;

	public void setMail(MailSender mail) {
		this.mail = mail;
	}
	public void sendM(String from,String to,String subject,String msg)
	{
		SimpleMailMessage smg = new SimpleMailMessage();
		smg.setFrom(from);
		smg.setTo(to);
		smg.setSubject(subject);
		smg.setText(msg);
		
		mail.send(smg);
		System.out.println("Mail sent successfully");
	}

}
