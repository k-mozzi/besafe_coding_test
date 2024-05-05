package besafe.codingTest.service;

import besafe.codingTest.domain.user.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findByEmail(String email);
}
