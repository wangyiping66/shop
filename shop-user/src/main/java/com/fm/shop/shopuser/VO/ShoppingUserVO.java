package com.fm.shop.shopuser.VO;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ShoppingUserVO {

    /**
     * 用户Id
     */

    private Long userId;
    /**
     * 用户名称
     */

    private String userName;
    /**
     * 用户年纪
     */

    private Integer userAge ;
    /**
     * 用户余额
     */

    private BigDecimal userBalance;


}
