package com.afcat.mailserver.test.v1;

import com.afcat.mailserver.sendmail.SendMail;
import org.junit.Assert;
import org.junit.Test;

import javax.mail.MessagingException;

/**
 * Created by xn.L on 2018/7/4.
 */
public class SendMailTestV1 {
    @Test
    public void sendMail(){
        SendMail sendMail = new SendMail();
        String message = null;
        try {
            message = sendMail.sendMailToClient();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("success",message);
    }
}
