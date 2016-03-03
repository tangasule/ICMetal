package com.icmetal.util;

import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by tangshijun on 16/3/2.
 */
@Service
public class Mailutil {

    /**
     * 发送邮件的测试程序
     *
     * @author tsj
     */
    public void sendMail(String name,String email,String subject , String usermessage) throws MessagingException {
        // 配置发送邮件的环境属性
        final Properties props = new Properties();

        // 表示SMTP发送邮件，需要进行身份验证
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.163.com");
        // 发件人的账号
        props.put("mail.user", "tangasule@163.com");
        // 访问SMTP服务时需要提供的密码
        props.put("mail.password", "Qq19891212");

        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(props, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        InternetAddress form = new InternetAddress(
                props.getProperty("mail.user"));
        message.setFrom(form);

        // 设置收件人
//            InternetAddress to = new InternetAddress("599092678@qq.com");
        InternetAddress to = new InternetAddress("644070686@qq.com");
        message.setRecipient(Message.RecipientType.TO, to);

        message.setSubject("有客户想联系您!");
        message.setContent("用户:"+name+"   发来了"+"主题为:"+subject+"  内容为"+usermessage+ ",他的联系方式为"+email,"text/html;charset=UTF-8");
        // 发送邮件
        Transport.send(message);
    }
}
