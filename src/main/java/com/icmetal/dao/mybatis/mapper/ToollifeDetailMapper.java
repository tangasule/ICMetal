package com.icmetal.dao.mybatis.mapper;

import com.icmetal.entities.mybatis.ToollifeDetail;

public interface ToollifeDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ToollifeDetail record);

    int insertSelective(ToollifeDetail record);

    ToollifeDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ToollifeDetail record);

    int updateByPrimaryKey(ToollifeDetail record);
}