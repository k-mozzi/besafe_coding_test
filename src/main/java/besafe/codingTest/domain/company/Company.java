package besafe.codingTest.domain.company;

import lombok.Data;

import java.util.Date;

/*
* `uId` '업체유저ID'
* `profile` '회사이미지'
* `siteUrl` '회사사이트'
* `info` '기업소개'
* `portfolioFile` '포트폴리오'
* `businessId` '사업자번호'
* `tel` '전화번호'
* `numOfSales` '누적계약건수'
* `GPA` '평점'
* `name` '회사이름'
* `cDate` '생성일'
* `mDate` '수정일'
* `mUser` '수정자'
* `categortCd` '카테고리코드': ["1":"OUTER", "2":"PANTS", "3":"DRESS", "4":"SHOES", "5":"BAG"]
* */
@Data
public class Company {
    private int cId;
    private int uId;
    private String profile;
    private String siteUrl;
    private String info;
    private String portfolioFile;
    private String businessId;
    private String tel;
    private int numOfSales;
    private Double GPA;
    private String name;
    private Date cDate;
    private Date mDate;
    private String mUser;
    private String categoryCd1;
    private String categoryCd2;
    private String categoryCd3;
}
