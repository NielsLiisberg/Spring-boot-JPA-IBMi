// This code is build by Sitemule JPA generator:
// https://gist.github.com/NielsLiisberg/c3b356fcfc969e6d1125fd3d38806036
package com.example.models;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

// Be careful with @Data. Equals/hash in lombok is not compatible with spring.
@Getter
@Setter
@Entity
@Table(name="QCUSTCDT")
public class Customer {

	// Datatype: NUMERIC, name: cusnum, fieldLabel: Customer number field, len: 6, prec: 0
	@Id
	@Column(name="CUSNUM")
	Long id ;

	// Datatype: CHAR, name: lstnam, fieldLabel: Last name field, len: 8
	@Column(name="LSTNAM")
	String lastName ;

	// Datatype: CHAR, name: init, fieldLabel: First and middle initial field, len: 3
	@Column(name="INIT")
	String initials ;

	// Datatype: CHAR, name: street, fieldLabel: Street address field, len: 13
	@Column(name="STREET")
	String streetName ;

	// Datatype: CHAR, name: city, fieldLabel: City field, len: 6
	@Column(name="CITY")
	String cityName ;

	// Datatype: CHAR, name: state, fieldLabel: State abbreviation field, len: 2
	@Column(name="STATE")
	String stateName ;

	// Datatype: NUMERIC, name: zipcod, fieldLabel: Zip code field, len: 5, prec: 0
	@Column(name="ZIPCOD")
	Long zipCode ;

	// Datatype: NUMERIC, name: cdtlmt, fieldLabel: Credit limit field, len: 4, prec: 0
	@Column(name="CDTLMT")
	Long creditLimit ;

	// Datatype: NUMERIC, name: chgcod, fieldLabel: Charge code field, len: 1, prec: 0
	@Column(name="CHGCOD")
	Integer chargeCode ;

	// Datatype: NUMERIC, name: baldue, fieldLabel: Balance due field, len: 6, prec: 2
	@Column(name="BALDUE")
	BigDecimal balanceDue ;

	// Datatype: NUMERIC, name: cdtdue, fieldLabel: Credit due field, len: 6, prec: 2
	@Column(name="CDTDUE")
	BigDecimal creditDue ;

}
