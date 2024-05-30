package com.PS23109.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS23109.entity.OrderDetail;


public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{
}