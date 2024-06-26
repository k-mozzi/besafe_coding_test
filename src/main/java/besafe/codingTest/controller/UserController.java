package besafe.codingTest.controller;

//import besafe.codingTest.domain.user.User;
//import besafe.codingTest.service.UserService;
//import lombok.Data;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
///*
// * testValue: VALUES ('xxx', 'xxx', 'xxx', 1, 'N', NULL, NULL, NOW(), NULL);
// * */
//@Data
//@RestController
//public class UserController {
//    private final UserService userService;
//
//    /*
//     * email을 통해 회원 정보 출력하는 메서드
//     * */
//    @GetMapping("/user/{email}")
//    public ResponseEntity<?> getUserByEmail(@PathVariable String email) {
//        Optional<User> userOptional = userService.findByEmail(email);
//        if (userOptional.isPresent()) {
//            return ResponseEntity.ok(userOptional.get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("이메일이 올바르지 않습니다.");
//        }
//    }
//
//    /*
//     * 로그인 메서드
//     * Postman Body에 email, password 입력
//     * */
//    @PostMapping("/auth/login")
//    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String password) {
//        Optional<User> userOptional = userService.findByEmail(email);
//        if (userOptional.isPresent()) {
//            User user = userOptional.get();
//            if (user.getPassword().equals(password)) {
//                return ResponseEntity.ok(user);
//            } else {
//                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("비밀번호가 올바르지 않습니다.");
//            }
//        } else {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("이메일이 올바르지 않습니다.");
//        }
//    }
//}

import besafe.codingTest.jwt.JwtToken;
import besafe.codingTest.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class UserController {
    private final UserServiceImpl userService;

    @PostMapping("/login")
    public JwtToken signIn(@RequestParam String email, @RequestParam String password) {
        JwtToken jwtToken = userService.login(email, password);
        log.info("request email = {}, password = {}", email, password);
        log.info("jwtToken accessToken = {}, refreshToken = {}", jwtToken.getAccessToken(), jwtToken.getRefreshToken());
        return jwtToken;
    }
}