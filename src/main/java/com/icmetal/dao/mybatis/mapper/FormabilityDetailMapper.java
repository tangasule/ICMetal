package com.icmetal.dao.mybatis.mapper;

import com.icmetal.entities.mybatis.FormabilityDetail;

public interface FormabilityDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FormabilityDetail record);

    int insertSelective(FormabilityDetail record);

    FormabilityDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FormabilityDetail record);

    int updateByPrimaryKey(FormabilityDetail record);
}