package com.dashuai.learning.mybatis.service;

import com.dashuai.learning.mybatis.model.Test;

import java.util.List;

/**
 * The interface User service.
 * <p/>
 * Created in 2018.11.09
 * <p/>
 *
 * @author Liaozihong
 */
public interface UserService {
    /**
     * Select all list.
     *
     * @return the list
     */
    List<Test> selectAll();

    /**
     * Insert user boolean.
     *
     * @return the boolean
     */
    Boolean insertUser(Test test);
}
