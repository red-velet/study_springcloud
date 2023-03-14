package com.qxy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: SayHello
 * @Date: 2023/3/14 19:01
 * @Introduction:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods implements Serializable {
    private static final long serialVersionUID = -142567453272228426L;
    private Integer id;
    private String title;
    private Double price;
    private Integer stock;
}
