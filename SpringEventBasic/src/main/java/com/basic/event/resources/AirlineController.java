package com.basic.event.resources;

import java.util.logging.Logger;
import java.util.logging.Level;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.basic.event.common.DuplicateAirlineException;
import com.basic.event.common.InvalidAirlineException;
import com.basic.event.convert.ObjectTOEntity;
import com.basic.event.model.entity.Airline;
import com.basic.event.model.valueobject.AirlineValue;
import com.basic.event.service.AirlineServices;

/**
 * @author Jha
 */
@RestController
@RequestMapping("/v1/airline")
public class AirlineController {

	/**
	 *
	 */
	protected static final Logger logger = Logger.getLogger(AirlineController.class.getName());

	/**
	 *
	 */
	@Autowired
	protected AirlineServices airlineService;
	
	@Autowired
	private ObjectTOEntity otb;

	/**
	 * @param userService
	 */
	
	public AirlineController(AirlineServices airlineService,ObjectTOEntity otb) {
		this.airlineService = airlineService;
		this.otb=otb;
	}
 
	
	
	 /**
	   * Add Airline with the specified information.
	   *
	   * @param userVO
	   * @return A non-null Airline.
	   */
	  @RequestMapping(method = RequestMethod.POST)
	  public ResponseEntity<Airline> add(@RequestBody AirlineValue airlineValue) throws Exception {
	    logger.info(String
	        .format("airline-service add() invoked: %s for %s", airlineService.getClass().getName(),
	        		airlineValue.getAirline_name()));
	    System.out.println(airlineValue);
	    Airline airline = otb.convertTO(airlineValue);
	    BeanUtils.copyProperties(airlineValue, airline);
	    try {
	    	airlineService.add(airline);
	    } catch (DuplicateAirlineException | InvalidAirlineException ex) {
	      logger.log(Level.WARNING, "Exception raised add Restaurant REST Call {0}", ex);
	      throw ex;
	    } catch (Exception ex) {
	      logger.log(Level.SEVERE, "Exception raised add Booking REST Call {0}", ex);
	      throw ex;
	    }
	    return new ResponseEntity<>(HttpStatus.CREATED);
	  }
}
