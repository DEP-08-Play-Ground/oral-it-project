package lk.ijse.dulanga.oralitdemo.service.impl;

import lk.ijse.dulanga.oralitdemo.dto.UserDTO;
import lk.ijse.dulanga.oralitdemo.reprsitory.UserRepository;
import lk.ijse.dulanga.oralitdemo.service.UserService;
import lk.ijse.dulanga.oralitdemo.service.exception.DuplicateException;
import lk.ijse.dulanga.oralitdemo.service.util.EntityDTOTransformer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private EntityDTOTransformer entityDTOTransformer;

    public UserServiceImpl(UserRepository userRepository, EntityDTOTransformer entityDTOTransformer) {
        this.userRepository = userRepository;
        this.entityDTOTransformer = entityDTOTransformer;
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
