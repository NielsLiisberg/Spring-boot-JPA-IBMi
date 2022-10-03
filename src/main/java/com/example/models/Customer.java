// This code is build by Sitemule JPA generator:
// https://gist.github.com/NielsLiisberg/c3b356fcfc969e6d1125fd3d38806036
package com.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

// Be careful with @Data. Equals/hash in lombok is not compatible with spring.
@Getter
@Setter
@Entity
@Table(name="QCUSTCDT")
public class Customer {

	// No primary key available

	// Datatype: NUMERIC, name: cusnum, fieldLabel: Customer number field, len: 6, prec: 0
	@NotNull
	@Size(max = 6)
	@Id
	@Column(name="CUSNUM")
	Long customerNumber;

	// Datatype: CHAR, name: lstnam, fieldLabel: Last name field, len: 8
	@NotNull
	@Size(max = 8)
	@Column(name="LSTNAM")
	String lastName;

	// Datatype: CHAR, name: init, fieldLabel: First and middle initial field, len: 3
	@NotNull
	@Size(max = 3)
	@Column(name="INIT")
	String firstAndMiddleInitial;

	// Datatype: CHAR, name: street, fieldLabel: Street address field, len: 13
	@NotNull
	@Size(max = 13)
	@Column(name="STREET")
	String streetAddress;

	// Datatype: CHAR, name: city, fieldLabel: City field, len: 6
	@NotNull
	@Size(max = 6)
	@Column(name="CITY")
	String city;

	// Datatype: CHAR, name: state, fieldLabel: State abbreviation field, len: 2
	@NotNull
	@Size(max = 2)
	@Column(name="STATE")
	String stateAbbreviation;

	// Datatype: NUMERIC, name: zipcod, fieldLabel: Zip code field, len: 5, prec: 0
	@NotNull
	@Size(max = 5)
	@Column(name="ZIPCOD")
	Long zipCode;

	// Datatype: NUMERIC, name: cdtlmt, fieldLabel: Credit limit field, len: 4, prec: 0
	@NotNull
	@Size(max = 4)
	@Column(name="CDTLMT")
	Long creditLimit;

	// Datatype: NUMERIC, name: chgcod, fieldLabel: Charge code field, len: 1, prec: 0
	@NotNull
	@Size(max = 1)
	@Column(name="CHGCOD")
	Integer chargeCode;

	// Datatype: NUMERIC, name: baldue, fieldLabel: Balance due field, len: 6, prec: 2
	@NotNull
	@Size(max = 6)
	@Column(name="BALDUE")
	BigDecimal balanceDue;

	// Datatype: NUMERIC, name: cdtdue, fieldLabel: Credit due field, len: 6, prec: 2
	@NotNull
	@Size(max = 6)
	@Column(name="CDTDUE")
	BigDecimal creditDue;

}