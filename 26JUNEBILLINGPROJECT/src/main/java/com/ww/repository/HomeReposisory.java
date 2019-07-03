package com.ww.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.ww.model.User;


@Repository

public interface HomeReposisory extends CrudRepository<User, Integer> {

}
