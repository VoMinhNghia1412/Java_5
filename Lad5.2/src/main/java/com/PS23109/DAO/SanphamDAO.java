package com.PS23109.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS23109.entity.Sanpham;

public interface SanphamDAO extends  JpaRepository<Sanpham, String> {

}
