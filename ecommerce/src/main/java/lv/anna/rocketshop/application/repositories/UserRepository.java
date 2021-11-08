package lv.anna.rocketshop.application.repositories;

import lv.anna.rocketshop.application.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{}