package lk.ijse.dulanga.oralitdemo.service.impl;

import lk.ijse.dulanga.oralitdemo.dto.UserDTO;
import lk.ijse.dulanga.oralitdemo.reprsitory.UserRepository;
import lk.ijse.dulanga.oralitdemo.service.UserService;
import lk.ijse.dulanga.oralitdemo.service.exception.DuplicateException;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO registerUser(UserDTO user) throws DuplicateException {
        return null;
    }

    @Override
    public List<UserDTO> listAllUsers() {
        return null;
    }
}
