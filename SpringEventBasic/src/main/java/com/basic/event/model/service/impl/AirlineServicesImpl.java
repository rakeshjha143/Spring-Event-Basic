/**
 * 
 */
package com.basic.event.model.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.event.basic.service.BaseService;
import com.basic.event.common.DuplicateAirlineException;
import com.basic.event.common.InvalidAirlineException;
import com.basic.event.model.basic.Entity;
import com.basic.event.model.entity.Airline;
import com.basic.event.model.repository.AirlineRepository;
import com.basic.event.model.service.AirlineServices;

/**
 * @author JHA
 *
 */
@Service("airlineServices")
public class AirlineServicesImpl extends BaseService<Airline, String> implements AirlineServices{

	
	private AirlineRepository<Airline, String> airlineRepository;
	
	/**
	 * @param airlineRepository
	 */
	@Autowired
	public AirlineServicesImpl(AirlineRepository<Airline, String> airlineRepository) {
		super(airlineRepository);
		this.airlineRepository = airlineRepository;
	}

	
	@Override
	public void add(Airline airline) throws Exception {
		 if (airlineRepository.containsName(airline.getName())) {
		      Object[] args = {airline.getName()};
		      throw new DuplicateAirlineException("duplicateAirline", args);
		    }
		    if (airline.getName() == null || "".equals(airline.getName())) {
		      Object[] args = {"User with null or empty name"};
		      throw new InvalidAirlineException("invalidAirline", args);
		    }
		    super.add(airline);
		
	}

	@Override
	public void update(Airline airline) throws Exception {

		
	}

	@Override
	public void delete(String id) throws Exception {

		
	}

	@Override
	public Entity findById(String id) throws Exception {

		return null;
	}

	@Override
	public Collection<Airline> findByName(String name) throws Exception {

		return null;
	}

	@Override
	public Collection<Airline> findByCriteria(Map<String, ArrayList<String>> name) throws Exception {

		return null;
	}

}
