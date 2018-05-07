package com.bbking.milk.mapper;

import com.bbking.milk.entity.ShoppingCart;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);
}