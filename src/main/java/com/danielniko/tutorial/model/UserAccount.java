package com.danielniko.tutorial.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;


/**
 * Entity for user_account table
 * 
 * @author danielniko
 * @version 1.0
 *
 */
@Data
@Builder
@Entity
@Table(name="user_account")
public class UserAccount {

	@Id
	private String username;
	private String password;
	private String fullName;
	private String role;
	private String email;
	private String phone;
	private String createdBy;
	private Date createdDate;
	private String lastModifiedBy;
	private Date lastModifiedDate;
	
}
