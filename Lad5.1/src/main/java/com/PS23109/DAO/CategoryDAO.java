package com.PS23109.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS23109.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{
}