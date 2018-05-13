
package com.gs.service;

import com.gs.pojo.User;

import java.util.List;

public interface UserService {
    void add(User c);
    void delete(int id);
    void update(User c);
    User get(int id);
    List list();
    boolean isExist(String name);
    void updateByFailureNum(String name);
    User get(String name, String password);
    int getFailureNum(String name);
    void addFailureNum(String name);
    int updateUserMsg(User user);
}
