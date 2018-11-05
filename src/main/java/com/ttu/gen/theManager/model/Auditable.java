package com.ttu.gen.theManager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U> {

	@Column(nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date creationDate;
	
	@Column(nullable=true, updatable=false)
	@CreatedBy
	private U createdBy;

	@Column(nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updatingDate;
	
	@Column(nullable=true, updatable=false)
	@LastModifiedBy
	private U updatedBy;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public U getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(U createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatingDate() {
		return updatingDate;
	}

	public void setUpdatingDate(Date updatingDate) {
		this.updatingDate = updatingDate;
	}

	public U getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(U updatedBy) {
		this.updatedBy = updatedBy;
	}

}
