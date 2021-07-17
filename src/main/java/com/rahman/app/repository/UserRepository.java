package com.rahman.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rahman.app.entity.User;

/**
 * a repository class to extend JPA repository which provide all
 * crud method default for that entity .
 * @author Rahman
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
