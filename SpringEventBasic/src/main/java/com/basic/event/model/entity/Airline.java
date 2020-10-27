package com.basic.event.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.basic.event.model.basic.AbstractEntity;


@Entity
@Table(name = "air_line")
public class Airline extends AbstractEntity{
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String airline_name;
	
	private String airline_code;
	
	private String digigt_code;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the airline_name
	 */
	public String getAirline_name() {
		return airline_name;
	}

	/**
	 * @param airline_name the airline_name to set
	 */
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}

	/**
	 * @return the airline_code
	 */
	public String getAirline_code() {
		return airline_code;
	}

	/**
	 * @param airline_code the airline_code to set
	 */
	public void setAirline_code(String airline_code) {
		this.airline_code = airline_code;
	}

	/**
	 * @return the digigt_code
	 */
	public String getDigigt_code() {
		return digigt_code;
	}

	/**
	 * @param digigt_code the digigt_code to set
	 */
	public void setDigigt_code(String digigt_code) {
		this.digigt_code = digigt_code;
	}





	
  




	
}
