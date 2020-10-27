/**
 * 
 */
package com.basic.event.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.basic.event.model.basic.Entity;
import com.basic.event.model.entity.Airline;

/**
 * @author JHA
 *
 */
public interface AirlineServices {

	
	
	 public void add(Airline airline) throws Exception;

	  /**
	   * @param booking
	   */
	  public void update(Airline airline) throws Exception;

	  /**
	   * @param id
	   */
	  public void delete(Long id) throws Exception;

	  /**
	   * @param id
	   */
	  public Entity findById(Long id) throws Exception;

	  /**
	   * @param name
	   */
	  public Collection<Airline> findByName(String name) throws Exception;

	  /**
	   * @param name
	   */
	  public Collection<Airline> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
