package com.example.spring.repos;

import com.example.spring.domain.User;
import org.springframework.data.repository.CrudRepository;



public interface LoginRepo extends CrudRepository<User, Long>{



    }
