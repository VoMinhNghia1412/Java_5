package com.PS23109.DAO;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.PS23109.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{


}
