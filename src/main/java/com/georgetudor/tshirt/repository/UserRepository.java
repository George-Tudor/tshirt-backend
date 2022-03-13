package com.georgetudor.tshirt.repository;
import com.georgetudor.tshirt.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

}
