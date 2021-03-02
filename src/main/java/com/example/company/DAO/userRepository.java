package com.example.company.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.company.entity.user;
public interface userRepository  extends JpaRepository<user, Integer> {

}
