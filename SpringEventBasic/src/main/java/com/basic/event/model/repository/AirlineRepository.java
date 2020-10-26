package com.basic.event.model.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.basic.event.basic.repository.Repository;
import com.basic.event.model.entity.Airline;

/**
 * @author JHA
 *
 */
@Component
@org.springframework.stereotype.Repository
public interface AirlineRepository<Airline, String> extends  Repository<Airline, String>  {

	
	 boolean containsName(String name);

	  /**
	   * @param name
	   */
	  public Collection<Airline> findByName(String name) throws Exception;
}
//