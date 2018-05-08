package com.bbking.milk.mapper;

import org.springframework.stereotype.Repository;

import com.bbking.milk.entity.Goods;
@Repository
public interface GoodsMapper {
    int deleteByPrimaryKey(Long goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}