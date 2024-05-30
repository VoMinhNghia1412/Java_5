package com.PS23109.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PS23109.entity.Account;

public interface AccountDAO extends JpaRepository<Account, String>{
}
