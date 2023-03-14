package com.qxy.provider.service;

import com.qxy.provider.dao.GoodsDao;
import com.qxy.provider.domain.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 18:58
 * @Introduction:
 */
@Service
public class GoodsService {
    @Autowired
    GoodsDao goodsDao;

    public Goods findById(Integer id)
    {
        return goodsDao.findById(id);
    }
}
