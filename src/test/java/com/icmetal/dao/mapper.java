package com.icmetal.dao;

import com.icmetal.dao.mybatis.mapper.ContactusDetailMapper;
import com.icmetal.entities.mybatis.ContactusDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


/**
 * Created by tangshijun on 16/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class mapper {

    @Autowired
    private ContactusDetailMapper contactusDetailMapper;


    @Test
    public void contactus() throws Exception {
        ContactusDetail contactusDetail = new ContactusDetail();
        contactusDetail.setEmail("tangasule@163.com");
        contactusDetail.setMessage("adadad");
        contactusDetail.setName("tang");
        contactusDetail.setSubject("pou");
        contactusDetailMapper.insert(contactusDetail);
    }




}
