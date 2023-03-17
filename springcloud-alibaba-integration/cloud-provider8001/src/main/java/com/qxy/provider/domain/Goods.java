package com.qxy.provider.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:01
 * @Introduction:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods implements Serializable {
    private static final long serialVersionUID = 5439780160648498949L;
    private Integer id;
    private String title;
    private Double price;
    private Integer store;
}
