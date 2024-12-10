package com.jdc.mkt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "address_tbl")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 45)
	private String city;
	@Column(length = 45, nullable = false)
	private String township;
	@Column(nullable = false)
	private String street;
//	@JoinTable(
//			name = "address_customer_tbl",
//			joinColumns = {
//					@JoinColumn(name = "add_id")
//			},
//			inverseJoinColumns = {
//					@JoinColumn(name = "cu_id")
//			}
//			)
	@OneToOne
	private Customer customer;
}
