package com.afcat.mailserver.sendmail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by xn.L on 2018/7/4.
 */

public class SendMail {

    public  String  sendMailToClient() throws MessagingException {
        Properties prop = new Properties();
        prop.setProperty("mail.host", "smtp.163.com");
        prop.setProperty("mail.transport.protocol", "smtp");
        prop.setProperty("mail.smtp.auth", "true");

        Session session = Session.getInstance(prop);

        session.setDebug(true);

        Transport ts = session.getTransport();

        ts.connect("smtp.163.com", "tryingloven@163.com", "e123456");

        Message message = createSimpleMail(session);

        ts.sendMessage(message, message.getAllRecipients());

        ts.close();

        return "success";
    }

    private  MimeMessage createSimpleMail(Session session) throws MessagingException {
        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress("tryingloven@163.com"));

        message.setRecipient(Message.RecipientType.TO, new InternetAddress("tryingloven@163.com"));

        message.setSubject("文本文件");

        message.setContent("你好啊！", "text/html;charset=UTF-8");

        return message;
    }


}
