/**
 * 
 */
package com.basic.event.basic.repository;

/**
 * @author JHA
 *
 */
public interface Repository<TE, T> extends ReadOnlyRepository<TE, T>{

	
	
	 void add(TE entity);

	    /**
	     *
	     * @param id
	     */
	    void remove(T id);

	    /**
	     *
	     * @param entity
	     */
	    void update(TE entity);
	
}
