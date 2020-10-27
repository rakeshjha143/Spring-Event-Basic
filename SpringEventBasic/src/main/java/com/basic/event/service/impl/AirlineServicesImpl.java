/**
 * 
 */
package com.basic.event.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import com.basic.event.common.DuplicateAirlineException;
import com.basic.event.common.InvalidAirlineException;
import com.basic.event.model.basic.Entity;
import com.basic.event.model.entity.Airline;
import com.basic.event.repository.AirlineRepository;
import com.basic.event.service.AirlineServices;

/**
 * @author JHA
 *
 */
@Service("airlineServices")
public class AirlineServicesImpl implements AirlineServices {

	
private AirlineRepository airlineRepository;




	/**
 * @param airlineRepository
 */
@Autowired
public AirlineServicesImpl(AirlineRepository airlineRepository) {
	this.airlineRepository = airlineRepository;
}

	@Override
	public void add(Airline airline) throws Exception {
		if (airlineRepository.containsName(airline.getAirline_name())) {
			Object[] args = { airline.getAirline_name() };
			throw new DuplicateAirlineException("duplicateAirline", args);
		}
		if (airline.getAirline_name() == null || "".equals(airline.getAirline_name())) {
			Object[] args = { "User with null or empty name" };
			throw new InvalidAirlineException("invalidAirline", args);
		}
		
		airlineRepository.save(airline);
	}

	@Override
	public void update(Airline airline) throws Exception {
		airlineRepository.saveAndFlush(airline);

	}

	@Override
	public void delete(Long id) throws Exception {

		airlineRepository.deleteById(id);
	}

	@Override
	public Entity findById(Long id) throws Exception {

		return airlineRepository.getOne(id);
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
