package com.PS23109.entity;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name = "sanpham" )
public class Sanpham {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
String id ;

String product_name ;


}
