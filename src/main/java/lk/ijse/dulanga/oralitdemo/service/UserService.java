package lk.ijse.dulanga.oralitdemo.service;

import lk.ijse.dulanga.oralitdemo.dto.UserDTO;
import lk.ijse.dulanga.oralitdemo.service.exception.DuplicateException;

import java.util.List;

public interface UserService {
    UserDTO registerUser(UserDTO user) throws DuplicateException;
    List<UserDTO> listAllUsers();
}
