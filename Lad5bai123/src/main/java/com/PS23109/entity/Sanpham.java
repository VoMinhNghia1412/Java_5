package com.PS23109.entity;

import javax.persistence.*;

import lombok.*;

@Data
@Entity
@Table(name = "sanpham2" )
public class Sanpham {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
String sanpham_id ;

String product_name ;


}
