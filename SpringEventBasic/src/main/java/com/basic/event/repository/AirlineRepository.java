package com.basic.event.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.basic.event.model.entity.Airline;

/**
 * @author JHA
 *
 */

@Repository
public interface AirlineRepository extends  JpaRepository<Airline, Long>  {

	
	 boolean containsName(String name);

	  /**
	   * @param name
	   */
	  public Collection<Airline> findByName(String name) throws Exception;
}
//