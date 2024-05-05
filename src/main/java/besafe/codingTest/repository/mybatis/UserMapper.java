package besafe.codingTest.repository.mybatis;

import besafe.codingTest.domain.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    Optional<User> findByEmail(String email);
}
