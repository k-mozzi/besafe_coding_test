package besafe.codingTest.domain.user;

import lombok.Data;

import java.util.Date;

/*
* `utType` '회원 종류',
* `useYn` '탈퇴여부',
* `lastRefTokenTime` '리프레시토큰정보',
* `mDate` 수정일자',
* `cDate` '생성일자',
* testValue: VALUES ('besafe@test.com', 'tester', '김경모', NULL, 'N', NULL, NULL, NOW(), NULL);
* */
@Data
public class User {
    private int uId;
    private String email;
    private String password;
    private String name;
    private Integer utType;
    private String useYn;
    private Date lastRefTokenTime;
    private Date mDate;
    private Date cDate;
    private String profile;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
