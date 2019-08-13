package lln.org.vn.demo.service;

import lln.org.vn.demo.model.User;

import java.util.List;

public interface UserService{
    List<User> creates(List<User> datas);
    List<User> gets(List<User> datas);
    List<User> updates(List<User> datas);
    void deletes(List<User> datas);
}
