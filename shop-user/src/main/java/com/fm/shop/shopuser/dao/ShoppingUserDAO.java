package com.fm.shop.shopuser.dao;


import com.fm.shop.shopuser.entity.ShoppingUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;


@Repository
public interface ShoppingUserDAO extends JpaRepository<ShoppingUserEntity,Long>{





    //ShoppingUserEntity findByUserId(Long id);

    @Query(value = "select * from shopping_user where user_id = ?1", nativeQuery = true)
    @Transactional
    ShoppingUserEntity updateNameById(Long id);




    /*default ShoppingUserVO getInfoByName(String userName) {
        QShoppingUserEntity qShoppingUserEntity = QShoppingUserEntity.shoppingUserEntity;
        JPAQuery<ShoppingUserVO> jpaQuery = new JPAQueryFactory(emf).select(
                Projections.bean(
                        ShoppingUserVO.class,
                        qShoppingUserEntity.userId,
                        qShoppingUserEntity.userAge,
                        qShoppingUserEntity.userName,
                        qShoppingUserEntity.userBalance
                )
        ).from(qShoppingUserEntity);

        QueryResults<ShoppingUserVO> results = jpaQuery.fetchResults();
        return results.getResults().get(0);
    }*/







    ShoppingUserEntity findByUserAge(Integer age);
    ShoppingUserEntity findByUserAgeAndUserBalance(Integer age,BigDecimal balance);


}
