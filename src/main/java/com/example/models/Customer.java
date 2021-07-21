package com.example.models;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
// Be careful with @Data. Equals in lombok is not compatible with spring.
@Data
@Entity
@Table(name="QCUSTCDT")
public class Customer {
	@Id
	@Column(name="CUSNUM")
	long id;

	@Column(name="LSTNAM")
	String lastName;

	@Column(name="INIT")
	String initials;

	@Column(name="STREET")
	String  streetName;

	@Column(name="CITY")
	String cityName;

	@Column(name="STATE")
	String stateName;

	@Column(name="ZIPCOD")
	String zipCode;

	@Column(name="CDTLMT")
	BigDecimal creditLimit;

	@Column(name="CHGCOD")
	Long chargeCode;

	@Column(name="BALDUE")
	BigDecimal balanceDue;

	@Column(name="CDTDUE")
	BigDecimal creditDue;

}



