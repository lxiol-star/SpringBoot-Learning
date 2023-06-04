package com.dashuai.learning.mybatis.service.impl;

import com.dashuai.learning.mybatis.mapper.TestMapper;
import com.dashuai.learning.mybatis.model.Test;
import com.dashuai.learning.mybatis.model.TestExample;
import com.dashuai.learning.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * User service
 * <p/>
 * Created in 2018.11.09
 * <p/>
 *
 * @author Liaozihong
 */
@Service
public class UserServiceImpl implements UserService {
    /**
     * The User mapper.
     */
    @Resource
    TestMapper testMapper;

    @Override
    public List<Test> selectAll() {
        //criteria对象要放在list，才能和xml文件的oredCriteria对应
//        TestExample example = new TestExample();
//        List<TestExample.Criteria> list = example.getOredCriteria();
//        TestExample.Criteria criteria = example.createCriteria();
//        criteria.andCodeEqualTo("a");
//        criteria.andDescEqualTo("b");
//        TestExample.Criteria criteria2 = example.createCriteria();
//        criteria2.andCodeEqualTo("a");
//        criteria2.andDescEqualTo("b");
//        example.or(criteria2);
//        example.or().andDescEqualTo("3");
//        TestExample.Criteria or = example.or();
//        or.andDescEqualTo("1");

        TestExample example=new TestExample();
        TestExample.Criteria criteria = example.createCriteria();
        TestExample.Criteria criteria1 = example.createCriteria();
        criteria.andDescEqualTo("1").andCodeEqualTo("1");
        criteria1.andDescEqualTo("1").andCodeEqualTo("1");
        example.or(criteria1);
        example.and().andCodeIsNotNull();
        return testMapper.selectByExample(example);
    }

    @Override
    public Boolean insertUser(Test test) {
        return testMapper.insertSelective(test)>0;
    }
}
