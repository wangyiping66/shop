package com.fm.shop.shopuser.service;


import com.fm.shop.shopuser.VO.ShoppingUserVO;
import com.fm.shop.shopuser.common.Result;
import com.fm.shop.shopuser.entity.ShoppingUserEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * Created by wp on 201p-01-29.
 */

public interface ShoppingUserService {

    ShoppingUserEntity updateNameById(Long id);
}
