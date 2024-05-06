package besafe.codingTest.domain.product;

import lombok.Data;

/*
* `pId` '입찰공고ID'
* `uId` '클라이언트ID'
* `price` '입찰공고 가격'
* `title` '입찰공고 제목'
* `description` '설명'
* `name` '상품명'
* `payType` '결제방식(건/월)'
* `period` '마케팅 기간'
* `categoryCd` '카테고리공통코드': ["1":"OUTER", "2":"PANTS", "3":"DRESS", "4":"SHOES", "5":"BAG"]
* `thumb` '사진'
* */
@Data
public class Product {
    private int pId;
    private int uId;
    private int price;
    private String title;
    private String description;
    private String name;
    private String payType;
    private String period;
    private String categoryCd;
    private String thumb1;
    private String thumb2;
    private String thumb3;
    private String thumb4;
    private String thumb5;
}
