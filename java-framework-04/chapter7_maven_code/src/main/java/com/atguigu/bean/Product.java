package com.atguigu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@RequiredArgsConstructor   // 自动为 @NonNull 字段生成构造器
public class Product {

    @NonNull
    private String productId;

    @NonNull
    private String name;

    @NonNull
    private Double price;

    private Integer stock;   // 无 @NonNull，不包含在 RequiredArgsConstructor 中

    // ✅ 删除手动构造器，让 Lombok 自动生成
}