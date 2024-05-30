package com.PS23109.DAO;

import org.springframework.data.jpa.repository.JpaRepository;


import com.PS23109.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Long>{
}
