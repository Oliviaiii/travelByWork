package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.storeworkList;

@Repository //oli
public interface storeworkListDao extends JpaRepository<storeworkList, Integer> {
    // 可以根據需要添加自定義的查詢方法
}
