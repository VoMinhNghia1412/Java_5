package com.PS23109.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.PS23109.entity.SearchEntity;


public interface SearchDAO extends JpaRepository<SearchEntity, Integer>{
	@Query("SELECT o FROM phantrang o WHERE o.price BETWEEN ?1 AND ?2")
	List<SearchEntity> findByPrice(double minPrice, double maxPrice);
	
}
