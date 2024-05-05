package besafe.codingTest.repository.mybatis;

import besafe.codingTest.domain.user.User;
import besafe.codingTest.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MyBatisUserRepository implements UserRepository {
    private final UserMapper userMapper;

    @Override
    public Optional<User> findByEmail(String email) {
        return userMapper.findByEmail(email);
    }
}
