package com.icmetal.service;

import com.icmetal.util.Mailutil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.mail.MessagingException;

/**
 * Created by tangshijun on 16/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class mailTest {

    @Autowired
    private Mailutil mailutil;

    @Test
    public void testMail(){
//        String name,String email,String subject , String usermessage
        try {
            mailutil.sendMail("tang","tangasule@163.com","OPENpROJECT","OOO");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}
