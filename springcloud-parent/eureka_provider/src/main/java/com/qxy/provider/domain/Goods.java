package com.qxy.provider.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 18:53
 * @Introduction: Goods商品实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods implements Serializable {
    private static final long serialVersionUID = -7155146786383430812L;
    private Integer id;
    private String title;
    private Double price;
    private Integer stock;
}
