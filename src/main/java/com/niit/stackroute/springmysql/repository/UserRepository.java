package com.niit.stackroute.springmysql.repository;
import com.niit.stackroute.springmysql.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {


}
