package lk.ijse.dulanga.oralitdemo.reprsitory;

import lk.ijse.dulanga.oralitdemo.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,String> {
    boolean existsUserByEmail(String email);

}
