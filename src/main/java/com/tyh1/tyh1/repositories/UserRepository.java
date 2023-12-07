package com.tyh1.tyh1.repositories;

import org.springframework.stereotype.Repository;

import com.tyh1.tyh1.entity.User;

import org.springframework.data.repository.CrudRepository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {}
