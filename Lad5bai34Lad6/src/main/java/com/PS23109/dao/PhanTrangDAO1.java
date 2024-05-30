package com.PS23109.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.PS23109.entity.Phantrang;

import antlr.collections.List;

public interface PhanTrangDAO1 extends JpaRepository<Phantrang, Integer> {
	@Query("SELECT o FROM Product o WHERE o.price BETWEEN ?1 AND ?2")
	java.util.List<Phantrang> findByPrice(double minPrice, double maxPrice);


}
