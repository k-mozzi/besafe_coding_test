package besafe.codingTest.controller;

import besafe.codingTest.domain.user.User;
import besafe.codingTest.service.UserService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/*
 * testValue: VALUES ('besafe', 'tester', '김경모', NULL, 'N', NULL, NULL, NOW(), NULL);
 * */
@Data
@RestController
public class UserController {
    private final UserService userService;

    /*
     * email을 통해 회원 정보 출력하는 메서드
     * */
    @GetMapping("/user/{email}")
    public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
        Optional<User> userOptional = userService.findByEmail(email);
        if (userOptional.isPresent()) {
            return ResponseEntity.ok(userOptional.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("이메일이 올바르지 않습니다.");
        }
    }

    /*
     * 로그인 메서드
     * Postman Body에 email, password 입력
     * */
    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
        Optional<User> userOptional = userService.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) {
                return ResponseEntity.ok(user);
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("비밀번호가 올바르지 않습니다.");
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("이메일이 올바르지 않습니다.");
        }
    }
}
