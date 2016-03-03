package com.icmetal.service;

import com.icmetal.dao.mybatis.mapper.ContactusDetailMapper;
import com.icmetal.dao.mybatis.mapper.FormabilityDetailMapper;
import com.icmetal.dao.mybatis.mapper.ToollifeDetailMapper;
import com.icmetal.entities.mybatis.ContactusDetail;
import com.icmetal.entities.mybatis.FormabilityDetail;
import com.icmetal.entities.mybatis.ToollifeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tangshijun on 16/3/3.
 */
@Service
public class BaseService {
    @Autowired
    private ContactusDetailMapper contactusDetailMapper;

    @Autowired
    private FormabilityDetailMapper formabilityDetailMapper;

    @Autowired
    private ToollifeDetailMapper toollifeDetailMapper;

    /**
     * saveContactus
     * @param contactusDetail
     * @return
     */
    public String saveContactus(ContactusDetail contactusDetail){
        int a = contactusDetailMapper.insert(contactusDetail);
        return "success";
    }

    /**
     * saveFormability
     * @param formabilityDetail
     * @return
     */
    public String saveFormability(FormabilityDetail formabilityDetail){
        int a =  formabilityDetailMapper.insert(formabilityDetail);
        return "success";
    }


    public String saveToollife(ToollifeDetail toollifeDetail){
        int a = toollifeDetailMapper.insert(toollifeDetail);
        return "success";
    }
}
