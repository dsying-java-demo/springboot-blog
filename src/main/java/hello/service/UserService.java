package hello.service;

import hello.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User getUserById(int id) {
        return new User(id, "dsying");
    }
}
