package lk.ijse.dulanga.oralitdemo.reprsitory;

import lk.ijse.dulanga.oralitdemo.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,String> {
    boolean existsUserByEmailAndMobileNO(String email,String mobileNO);

    List<User> getAllUsers();
}
