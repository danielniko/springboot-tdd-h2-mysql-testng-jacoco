package com.danielniko.tutorial.service;

import static org.testng.Assert.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.danielniko.tutorial.model.UserAccount;

@TestPropertySource("/application-test.properties")
@SpringBootTest
public class UserAccountServiceTest extends AbstractTestNGSpringContextTests {
	
    @PersistenceContext
    private EntityManager entityManager;
	
	@Autowired
	private UserAccountService userAccountService;

	@BeforeEach
	public void setupData() {
		
	}
	
	@Test
	public void getSingleUserByUsername() {
		UserAccount userTest = new UserAccount();
		userTest.setUsername("danielniko");
		userTest.setPassword("secret");
		userTest.setFullName("Daniel Leonardo Niko");
		
		String username = "danielniko";
		UserAccount user = userAccountService.findUserByUsername(username);
		assertEquals(user.getUsername(), "danielniko");
	}
	
}
