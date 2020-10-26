/**
 * 
 */
package com.basic.event.basic.repository;

import java.util.Collection;

/**
 * @author JHA
 *
 */
public interface ReadOnlyRepository<TE, T> {

	
	   //long Count;
    /**
     *
     * @param id
     * @return
     */
    boolean contains(T id);

    /**
     *
     * @param id
     * @return
     */
    TE get(T id);

    /**
     *
     * @return
     */
    Collection<TE> getAll();
}
