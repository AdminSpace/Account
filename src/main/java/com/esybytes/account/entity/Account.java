package com.esybytes.account.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Account extends BaseEntity{

	
	@Column(name = "customer_id")
	private Long customerId;
	
	@Id
	@Column(name = "account_number")
	private Long accountNumber;
	private String account_type;
	private String branchAddress;
}
