package lk.ijse.dulanga.oralitdemo.service.impl;

import lk.ijse.dulanga.oralitdemo.dto.UserDTO;
import lk.ijse.dulanga.oralitdemo.entity.User;
import lk.ijse.dulanga.oralitdemo.reprsitory.UserRepository;
import lk.ijse.dulanga.oralitdemo.service.UserService;
import lk.ijse.dulanga.oralitdemo.service.exception.DuplicateException;
import lk.ijse.dulanga.oralitdemo.service.util.EntityDTOTransformer;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private EntityDTOTransformer transformer;

    public UserServiceImpl(UserRepository userRepository, EntityDTOTransformer transformer) {
        this.userRepository = userRepository;
        this.transformer = transformer;
    }

    @Override
    public UserDTO registerUser(UserDTO user) throws DuplicateException {
        if (userRepository.existsUserByEmailAndMobileNO(user.getEmail(), user.getMobileNO())) {
            throw new DuplicateException("User already Exists");
        }
        return transformer.getUserDTO(userRepository.save(transformer.getUserEntity(user)));
    }

    @Override
    public List<UserDTO> listAllUsers() {
        List<User> allUsers = userRepository.findAll();
        return allUsers.stream().map(user -> transformer.getUserDTO(user)).collect(Collectors.toList());
    }
}
