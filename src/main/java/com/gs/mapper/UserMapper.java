
package com.gs.mapper;

import com.gs.pojo.User;
import com.gs.pojo.UserExample;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    void updateByFailureNum(String name);

    int updateByPrimaryKey(User record);

    int getFailureNum(String name);

    void addFailureNum(String name);

    int updateUserMsg(User user);
}
