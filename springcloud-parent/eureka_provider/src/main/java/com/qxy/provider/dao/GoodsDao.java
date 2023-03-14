package com.qxy.provider.dao;

import com.qxy.provider.domain.Goods;
import org.springframework.stereotype.Repository;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 18:55
 * @Introduction:
 */
@Repository
public class GoodsDao {
    public Goods findById(Integer id)
    {
        Goods goods = new Goods();
        goods.setId(id);
        goods.setTitle("手机");
        goods.setStock(100);
        goods.setPrice(1999.0);
        return goods;
    }
}
