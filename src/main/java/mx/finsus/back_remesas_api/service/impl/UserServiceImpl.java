package mx.finsus.back_remesas_api.service.impl;

import mx.finsus.back_remesas_api.model.User;
import mx.finsus.back_remesas_api.repository.IUserRepository;
import mx.finsus.back_remesas_api.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements IUserservice {

    @Autowired
    private IUserRepository repository;


    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findByPhone(User user ) {
        return repository.findByPhone(user.getPhone());

    }



}
