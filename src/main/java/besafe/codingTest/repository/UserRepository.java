package besafe.codingTest.repository;

import besafe.codingTest.domain.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByEmail(String email);
}
