package com.fm.shop.shopuser.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by wp on 2018-01-29.
 * 用户信息
 */
@Data
@Entity
@Table(name = "shopping_user")
@EntityListeners(AuditingEntityListener.class)
public class ShoppingUserEntity {

    /**
     * 用户Id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    /**
     * 用户名称
     */
    @Basic
    private String userName;
    /**
     * 用户年纪
     */
    @Basic
    private Integer userAge ;
    /**
     * 用户余额
     */
    @Basic
    private BigDecimal userBalance;

}
