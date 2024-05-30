package com.PS23109.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sanpham")
public class SanphamEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Integer sanpham_id;
String name ;
}
