package com.qxy.consumer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: SayHello
 * @Date: 2023/3/17 21:12
 * @Introduction:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods implements Serializable {
    private static final long serialVersionUID = 4200161667670159787L;
    private Integer id;
    private String title;
    private Double price;
    private Integer store;
}

