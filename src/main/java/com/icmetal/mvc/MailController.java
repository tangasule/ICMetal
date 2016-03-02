package com.icmetal.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.mail.MessagingException;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import java.util.Properties;

/**
 * Created by tangshijun on 16/2/22.
 */
@Controller
public class MailController {

    @RequestMapping(value = "/contactMail", method = RequestMethod.GET)
    public String sendMail(HttpServletRequest request, ModelMap model) {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String subject = request.getParameter("subject");
        String message = request.getParameter("message");
        try {
            this.sendMail(name,email,subject,message);
        } catch (MessagingException e) {
            System.out.println("发送失败!");
        }

        return "thankyou";
    }

    /**
     * 发送邮件的测试程序
     *
     * @author tsj
     */
    public void sendMail(String name,String email,String subject , String usermessage) throws MessagingException {
        // 配置发送邮件的环境属性
        final Properties props = new Properties();
        /*
         * 可用的属性： mail.store.protocol / mail.transport.protocol / mail.host /
         * mail.user / mail.from
         */
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
//                    String userName ="kingsleyzhang1119@gmail.com";
//                    String password = "Zql911119";
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
//            InternetAddress to = new InternetAddress("644070686@qq.com");
        InternetAddress to = new InternetAddress("kingsleyzhang1119@163.com");
        message.setRecipient(RecipientType.TO, to);

        // 设置抄送
//            InternetAddress cc = new InternetAddress("luo_aaaaa@yeah.net");
//            message.setRecipient(RecipientType.CC, cc);

        // 设置密送，其他的收件人不能看到密送的邮件地址
//            InternetAddress bcc = new InternetAddress("aaaaa@163.com");
//            message.setRecipient(RecipientType.CC, bcc);

        // 设置邮件标题
//        message.setSubject("钱宝送你10000000钱宝币给你拜小年了");
        // 设置邮件的内容体
//        message.setContent("你已收到钱宝的钱宝送你10000000钱宝币", "text/html;charset=UTF-8");


        message.setSubject("有客户想联系您!");
        message.setContent("用户:"+name+"   发来了"+"主题为:"+subject+"  内容为"+usermessage+ ",他的联系方式为"+email,"text/html;charset=UTF-8");
        // 发送邮件
        Transport.send(message);
    }


}

