package com.icmetal.dao.mybatis.mapper;

import com.icmetal.entities.mybatis.ContactusDetail;
import org.springframework.stereotype.Repository;

public interface ContactusDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ContactusDetail record);

    int insertSelective(ContactusDetail record);

    ContactusDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContactusDetail record);

    int updateByPrimaryKey(ContactusDetail record);
}