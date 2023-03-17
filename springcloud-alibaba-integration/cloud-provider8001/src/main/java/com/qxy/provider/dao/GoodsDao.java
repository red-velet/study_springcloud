package com.qxy.provider.dao;

import com.qxy.provider.domain.Goods;
import org.springframework.stereotype.Repository;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:03
 * @Introduction:
 */
@Repository
public class GoodsDao {
    public Goods findById(Integer id) {
        Goods goods = new Goods();
        goods.setId(id);
        goods.setTitle("爱国者-华为手机");
        goods.setPrice(9000.0);
        goods.setStore(100);
        return goods;
    }
}
