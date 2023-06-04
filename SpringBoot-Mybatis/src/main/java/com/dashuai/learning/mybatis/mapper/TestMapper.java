package com.dashuai.learning.mybatis.mapper;

import com.dashuai.learning.mybatis.model.Test;
import com.dashuai.learning.mybatis.model.TestExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TestMapper {
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Test row);

    int insertSelective(Test row);

    List<Test> selectByExampleWithRowbounds(TestExample example, RowBounds rowBounds);

    List<Test> selectByExample(TestExample example);

    Test selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Test row, @Param("example") TestExample example);

    int updateByExample(@Param("row") Test row, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(Test row);

    int updateByPrimaryKey(Test row);
}