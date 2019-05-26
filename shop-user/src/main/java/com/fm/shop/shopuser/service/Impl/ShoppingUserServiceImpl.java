package com.fm.shop.shopuser.service.Impl;

import com.fm.shop.shopuser.dao.ShoppingUserDAO;
import com.fm.shop.shopuser.entity.ShoppingUserEntity;
import com.fm.shop.shopuser.service.ShoppingUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
@Slf4j
public class ShoppingUserServiceImpl implements ShoppingUserService {


    @Resource
    private ShoppingUserDAO shoppingUserDAO;


    @Override
    public ShoppingUserEntity updateNameById(Long id) {

        //BigDecimal bigDecimal = new BigDecimal("111");
        ShoppingUserEntity shoppingUserEntity = shoppingUserDAO.updateNameById(id);
        /*ShoppingUserVO shoppingUserVO = new ShoppingUserVO();
        BeanUtils.copyProperties(shoppingUserEntity,shoppingUserVO);
        System.out.println(shoppingUserVO);*/
        return shoppingUserEntity;
    }
}
