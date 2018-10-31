package com.raghav.feedbackapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.raghav.feedbackapp.model.User;


public interface UserRepository extends CrudRepository<User, Long> {
    

}
