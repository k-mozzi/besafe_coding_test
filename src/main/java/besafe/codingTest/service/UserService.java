package besafe.codingTest.service;

import besafe.codingTest.jwt.JwtToken;

public interface UserService {
    JwtToken login(String email, String password);
}
