package lln.org.vn.demo.service.implement;

import lln.org.vn.demo.model.User;
import lln.org.vn.demo.repository.UserRepository;
import lln.org.vn.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> creates(List<User> datas) {
        return userRepository.saveAll(datas);
    }

    @Override
    public List<User> gets(List<User> datas) {
        return userRepository.findAll();
    }

    @Override
    public List<User> updates(List<User> datas) {
        return userRepository.saveAll(datas);
    }

    @Override
    public void deletes(List<User> datas) {
        userRepository.deleteAll(datas);
    }
}
