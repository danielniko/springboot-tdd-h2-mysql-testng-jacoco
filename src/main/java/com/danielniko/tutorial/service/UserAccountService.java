package com.danielniko.tutorial.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danielniko.tutorial.model.UserAccount;
import com.danielniko.tutorial.repository.UserAccountRepository;


/**
 * Service class for user_account table
 * 
 * @author danielniko
 *
 */
@Service
public class UserAccountService {

	@Autowired
	private UserAccountRepository userAccountRepository;
	
	
	/**
	 * Get UserAccount based on Username
	 * 
	 * @author danielniko
	 * @param username
	 * @return UserAccount with the specified username
	 * @see UserAccount
	 */
	public UserAccount findUserByUsername(String username) {
		UserAccount user = userAccountRepository.findUserByUsername(username);
		return user;
	}
}
