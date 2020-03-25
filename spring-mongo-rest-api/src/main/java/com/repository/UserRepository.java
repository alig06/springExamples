package com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.entity.User;

public interface UserRepository extends MongoRepository<User,String>
{
}
