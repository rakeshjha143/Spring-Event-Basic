/**
 * 
 */
package com.basic.event.model.basic;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * @author JHA
 *
 */
public abstract class BaseEntity<T> extends Entity<T>{

	@CreatedBy
    protected T createdBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date creationDate;

    @LastModifiedBy
    protected T lastModifiedBy;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastModifiedDate;

	/**
	 * @param createdBy
	 * @param creationDate
	 * @param lastModifiedBy
	 * @param lastModifiedDate
	 */
	public BaseEntity(T id, String name, T createdBy, Date creationDate, T lastModifiedBy, Date lastModifiedDate) {
		super();
		super.id = id;
        super.name = name;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.lastModifiedBy = lastModifiedBy;
		this.lastModifiedDate = lastModifiedDate;
	}
    
    
}
