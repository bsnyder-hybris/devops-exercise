package com.hybris.yo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hybris.yo.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
