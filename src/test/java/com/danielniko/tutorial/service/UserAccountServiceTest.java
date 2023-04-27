package com.danielniko.tutorial.service;

import static org.testng.Assert.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import com.danielniko.tutorial.model.UserAccount;

@TestPropertySource("/application-test.properties")
@SpringBootTest
@Transactional
public class UserAccountServiceTest extends AbstractTestNGSpringContextTests {
	

	@Autowired
	private UserAccountService userAccountService;

	@BeforeEach
	public void setupData() {
		
	}
	
	@Test
	public void getSingleUserByUsername() {
		UserAccount userTest = UserAccount.builder()
				.username("danielniko")
				.password("secret")
				.fullName("Daniel Leonardo Niko")
				.role("ADMIN")
				.email("daniel.gultom@gmail.com")
				.phone("081284667552")
				.createdBy("admin")
				.createdDate(new Date())
				.lastModifiedBy("admin")
				.lastModifiedDate(new Date())
				.build();
        
		String username = "danielniko";
		UserAccount user = userAccountService.findUserByUsername(username);
		assertEquals(user.getUsername(), "danielniko");
	}
	
}
