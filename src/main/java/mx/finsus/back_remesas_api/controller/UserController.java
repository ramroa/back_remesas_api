package mx.finsus.back_remesas_api.controller;

import mx.finsus.back_remesas_api.model.User;
import mx.finsus.back_remesas_api.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    private IUserservice service;



    @GetMapping("/phone")
    public  ResponseEntity<User> findByPhone(@RequestBody User user){
        User userDB = service.findByPhone(user);
        return  new ResponseEntity<User>(userDB, HttpStatus.FOUND);

    }





}
