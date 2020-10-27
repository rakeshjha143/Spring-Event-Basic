package com.basic.event.convert;

import com.basic.event.model.entity.Airline;
import com.basic.event.model.valueobject.AirlineValue;

public class ObjectTOEntity {
	
	
	public Airline convertTO(AirlineValue av) {
		Airline ar=new Airline();
		ar.setAirline_name(av.getAirline_name());
		ar.setAirline_code(ar.getAirline_code());
		ar.setDigigt_code(av.getDigigt_code());
		
		return ar;
	}

}
