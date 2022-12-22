package com.example.spring.DAO;

import com.example.spring.domain.User;
import com.example.spring.repos.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



// манипкляция базой
@Component
public class UserDAO {
    private final LoginRepo loginRepo;
    @Autowired
    public UserDAO(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

    public void save(User user){
        loginRepo.save(user);
    }
}
