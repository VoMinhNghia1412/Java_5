package com.PS23109.entity;


import java.sql.Date;

import javax.persistence.*;



import lombok.*;


@Data
@Entity
@Table(name="phantrang")
public class Phantrang {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
    String id ; 
	String name ;
	Double price;
	Date dates ;

}
