/**
 * 
 */
package com.basic.event.basic.service;

import com.basic.event.basic.repository.ReadOnlyRepository;

/**
 * @author JHA
 *
 */
public abstract class ReadOnlyBaseService<TE, T> {

	
	private ReadOnlyRepository<TE, T> repository;

	  ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
	    this.repository = repository;
	  }
}
