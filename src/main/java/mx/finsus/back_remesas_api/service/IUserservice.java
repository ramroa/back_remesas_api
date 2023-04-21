package mx.finsus.back_remesas_api.service;

import mx.finsus.back_remesas_api.model.User;

import java.util.List;

public interface IUserservice {


    public List<User> findAll();

    public User findByPhone(User user);
}
