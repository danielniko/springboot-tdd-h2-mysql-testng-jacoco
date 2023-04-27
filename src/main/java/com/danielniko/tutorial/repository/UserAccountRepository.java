package com.danielniko.tutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.danielniko.tutorial.model.UserAccount;


/**
 * Data access object for user_account table
 * 
 * @author danielniko
 * @
 *
 */
public interface UserAccountRepository extends CrudRepository<UserAccount, String>{

	
	/**
	 * Get UserAccount based on username
	 * 
	 * @author danielniko
	 * @param username
	 * @return UserAccount with the specified username
	 * @see UserAccount
	 */
	public UserAccount findUserByUsername(String username);
}
