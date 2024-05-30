package com.PS23109.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "phantrang" )
public class SearchEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    String id ; 
	String name ;
	Double price;
	Date dates ;
}
